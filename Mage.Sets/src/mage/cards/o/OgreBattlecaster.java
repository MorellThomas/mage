package mage.cards.o;

import mage.ApprovingObject;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.common.delayed.ReflexiveTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.players.Player;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

/**
 * @author @stwalsh4118, xenohedron
 */
public final class OgreBattlecaster extends CardImpl {

    private static final FilterCard filter = new FilterInstantOrSorceryCard();

    public OgreBattlecaster(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}");
        
        this.subtype.add(SubType.OGRE);
        this.subtype.add(SubType.SHAMAN);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // First strike
        this.addAbility(FirstStrikeAbility.getInstance());

        // Whenever Ogre Battlecaster attacks, you may cast target instant or sorcery card from your graveyard by paying {R}{R} in addition to its other costs. If that spell would be put into a graveyard, exile it instead. When you cast that spell, Ogre Battlecaster gets +X/+0 until end of turn, where X is that spell's mana value.
        Ability ability = new AttacksTriggeredAbility(new OgreBattlecasterEffect(), false);
        ability.addTarget(new TargetCardInYourGraveyard(filter));
        this.addAbility(ability);
    }

    private OgreBattlecaster(final OgreBattlecaster card) {
        super(card);
    }

    @Override
    public OgreBattlecaster copy() {
        return new OgreBattlecaster(this);
    }
}

class OgreBattlecasterEffect extends OneShotEffect {

    OgreBattlecasterEffect() {
        super(Outcome.PlayForFree);
        this.staticText = "you may cast target instant or sorcery card from your graveyard " + 
            "by paying {R}{R} in addition to its other costs. If that spell would be put into a graveyard, exile it instead. " + 
            "When you cast that spell, {this} gets +X/+0 until end of turn, where X is that spell's mana value";
    }

    private OgreBattlecasterEffect(final OgreBattlecasterEffect effect) {
        super(effect);
    }

    @Override
    public OgreBattlecasterEffect copy() {
        return new OgreBattlecasterEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Card card = game.getCard(this.getTargetPointer().getFirst(game, source));
        if (controller == null || card == null) {
            return false;
        }
        if (controller.chooseUse(Outcome.Benefit, "Cast " + card.getLogName() + '?', source, game)) {
            int originalManaValue = card.getManaValue();
            card.getSpellAbility().addCost(new ManaCostsImpl<>("{R}{R}"));
            game.getState().setValue("PlayFromNotOwnHandZone" + card.getId(), Boolean.TRUE);
            boolean cardWasCast = controller.cast(controller.chooseAbilityForCast(card, game, false),
                    game, false, new ApprovingObject(source, game));
            game.getState().setValue("PlayFromNotOwnHandZone" + card.getId(), null);
            if (cardWasCast) {
                ContinuousEffect effect = new BoostTargetEffect(originalManaValue, 0, Duration.EndOfTurn);
                effect.setTargetPointer(new FixedTarget(source.getSourceId()));
                game.fireReflexiveTriggeredAbility(new ReflexiveTriggeredAbility(effect, false,
                        "When you cast that spell, {this} gets +X/+0 until end of turn, where X is that spell's mana value"), source);
            }
        }
        ContinuousEffect effect = new OgreBattlecasterReplacementEffect(card.getId());
        effect.setTargetPointer(new FixedTarget(card.getId(), game.getState().getZoneChangeCounter(card.getId())));
        game.addEffect(effect, source);
        return true;
    }
}

class OgreBattlecasterReplacementEffect extends ReplacementEffectImpl {

    private final UUID cardId;

    OgreBattlecasterReplacementEffect(UUID cardId) {
        super(Duration.EndOfTurn, Outcome.Exile);
        this.cardId = cardId;
        staticText = "if that spell would be put into a graveyard, exile it instead";
    }

    private OgreBattlecasterReplacementEffect(final OgreBattlecasterReplacementEffect effect) {
        super(effect);
        this.cardId = effect.cardId;
    }

    @Override
    public OgreBattlecasterReplacementEffect copy() {
        return new OgreBattlecasterReplacementEffect(this);
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        ((ZoneChangeEvent) event).setToZone(Zone.EXILED);
        return false;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
        return zEvent.getToZone() == Zone.GRAVEYARD
                && zEvent.getTargetId().equals(this.cardId);
    }
}

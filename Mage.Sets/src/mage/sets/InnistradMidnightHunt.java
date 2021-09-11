package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class InnistradMidnightHunt extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Arlinn, the Pack's Hope", "Arlinn, the Moon's Fury", "Baithook Angler", "Hook-Haunt Drifter", "Baneblade Scoundrel", "Baneclaw Marauder", "Beloved Beggar", "Generous Soul", "Bird Admirer", "Wing Shredder", "Brimstone Vandal", "Brutal Cathar", "Moonrage Brute", "Burly Breaker", "Dire-Strain Demolisher", "Celestus Sanctifier", "Chaplain of Alms", "Chapel Shieldgeist", "Component Collector", "Covert Cutpurse", "Covetous Geist", "Covetous Castaway", "Ghostly Castigator", "Curse of Leeches", "Leeching Lurker", "Dennick, Pious Apprentice", "Dennick, Pious Apparition", "Devoted Grafkeeper", "Departed Soulkeeper", "Fangblade Brigand", "Fangblade Eviscerator", "Firmament Sage", "Galedrifter", "Waildrifter", "Gavony Dawnguard", "Graveyard Trespasser", "Graveyard Glutton", "Harvesttide Infiltrator", "Harvesttide Assailant", "Hound Tamer", "Untamed Pup", "Kessig Naturalist", "Lord of the Ulvenwald", "Lunarch Veteran", "Luminous Phantom", "Malevolent Hermit", "Benevolent Geist", "Mourning Patrol", "Morning Apparition", "Obsessive Astronomer", "Overwhelmed Archivist", "Archive Haunt", "Reckless Stormseeker", "Storm-Charged Slasher", "Shady Traveler", "Stalking Predator", "Shipwreck Sifters", "Spellrune Painter", "Spellrune Howler", "Sunrise Cavalier", "Sunstreak Phoenix", "Suspicious Stowaway", "Seafaring Werewolf", "Tavern Ruffian", "Tavern Smasher", "The Celestus", "Thraben Exorcism", "Tovolar, Dire Overlord", "Tovolar, the Midnight Scourge", "Tovolar's Huntmaster", "Tovolar's Packleader", "Unblinking Observer", "Vadrik, Astral Archmage", "Village Watch", "Village Reavers");
    private static final InnistradMidnightHunt instance = new InnistradMidnightHunt();

    public static InnistradMidnightHunt getInstance() {
        return instance;
    }

    private InnistradMidnightHunt() {
        super("Innistrad: Midnight Hunt", "MID", ExpansionSet.buildDate(2021, 9, 24), SetType.EXPANSION);
        this.blockName = "Innistrad: Midnight Hunt";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = 1;

        cards.add(new SetCardInfo("Angelfire Ignition", 209, Rarity.RARE, mage.cards.a.AngelfireIgnition.class));
        cards.add(new SetCardInfo("Arcane Infusion", 210, Rarity.UNCOMMON, mage.cards.a.ArcaneInfusion.class));
        cards.add(new SetCardInfo("Archive Haunt", 68, Rarity.UNCOMMON, mage.cards.a.ArchiveHaunt.class));
        cards.add(new SetCardInfo("Arrogant Outlaw", 84, Rarity.COMMON, mage.cards.a.ArrogantOutlaw.class));
        cards.add(new SetCardInfo("Augur of Autumn", 168, Rarity.RARE, mage.cards.a.AugurOfAutumn.class));
        cards.add(new SetCardInfo("Baithook Angler", 42, Rarity.COMMON, mage.cards.b.BaithookAngler.class));
        cards.add(new SetCardInfo("Bird Admirer", 169, Rarity.COMMON, mage.cards.b.BirdAdmirer.class));
        cards.add(new SetCardInfo("Bladebrand", 87, Rarity.COMMON, mage.cards.b.Bladebrand.class));
        cards.add(new SetCardInfo("Bladestitched Skaab", 212, Rarity.UNCOMMON, mage.cards.b.BladestitchedSkaab.class));
        cards.add(new SetCardInfo("Blessed Defiance", 5, Rarity.COMMON, mage.cards.b.BlessedDefiance.class));
        cards.add(new SetCardInfo("Blood Pact", 88, Rarity.COMMON, mage.cards.b.BloodPact.class));
        cards.add(new SetCardInfo("Bloodline Culling", 89, Rarity.RARE, mage.cards.b.BloodlineCulling.class));
        cards.add(new SetCardInfo("Bloodthirsty Adversary", 129, Rarity.MYTHIC, mage.cards.b.BloodthirstyAdversary.class));
        cards.add(new SetCardInfo("Bloodtithe Collector", 90, Rarity.UNCOMMON, mage.cards.b.BloodtitheCollector.class));
        cards.add(new SetCardInfo("Borrowed Time", 6, Rarity.UNCOMMON, mage.cards.b.BorrowedTime.class));
        cards.add(new SetCardInfo("Bounding Wolf", 170, Rarity.COMMON, mage.cards.b.BoundingWolf.class));
        cards.add(new SetCardInfo("Bramble Armor", 171, Rarity.COMMON, mage.cards.b.BrambleArmor.class));
        cards.add(new SetCardInfo("Briarbridge Tracker", 172, Rarity.RARE, mage.cards.b.BriarbridgeTracker.class));
        cards.add(new SetCardInfo("Brimstone Vandal", 130, Rarity.COMMON, mage.cards.b.BrimstoneVandal.class));
        cards.add(new SetCardInfo("Brood Weaver", 173, Rarity.UNCOMMON, mage.cards.b.BroodWeaver.class));
        cards.add(new SetCardInfo("Burly Breaker", 174, Rarity.UNCOMMON, mage.cards.b.BurlyBreaker.class));
        cards.add(new SetCardInfo("Burn Down the House", 131, Rarity.RARE, mage.cards.b.BurnDownTheHouse.class));
        cards.add(new SetCardInfo("Can't Stay Away", 213, Rarity.RARE, mage.cards.c.CantStayAway.class));
        cards.add(new SetCardInfo("Candlegrove Witch", 8, Rarity.COMMON, mage.cards.c.CandlegroveWitch.class));
        cards.add(new SetCardInfo("Candlelit Cavalry", 175, Rarity.COMMON, mage.cards.c.CandlelitCavalry.class));
        cards.add(new SetCardInfo("Candletrap", 9, Rarity.COMMON, mage.cards.c.Candletrap.class));
        cards.add(new SetCardInfo("Cathar Commando", 10, Rarity.COMMON, mage.cards.c.CatharCommando.class));
        cards.add(new SetCardInfo("Cathartic Pyre", 133, Rarity.UNCOMMON, mage.cards.c.CatharticPyre.class));
        cards.add(new SetCardInfo("Celestus Sanctifier", 12, Rarity.COMMON, mage.cards.c.CelestusSanctifier.class));
        cards.add(new SetCardInfo("Champion of the Perished", 91, Rarity.RARE, mage.cards.c.ChampionOfThePerished.class));
        cards.add(new SetCardInfo("Chapel Shieldgeist", 13, Rarity.UNCOMMON, mage.cards.c.ChapelShieldgeist.class));
        cards.add(new SetCardInfo("Chaplain of Alms", 13, Rarity.UNCOMMON, mage.cards.c.ChaplainOfAlms.class));
        cards.add(new SetCardInfo("Clarion Cathars", 14, Rarity.COMMON, mage.cards.c.ClarionCathars.class));
        cards.add(new SetCardInfo("Clear Shot", 176, Rarity.UNCOMMON, mage.cards.c.ClearShot.class));
        cards.add(new SetCardInfo("Consider", 44, Rarity.COMMON, mage.cards.c.Consider.class));
        cards.add(new SetCardInfo("Contortionist Troupe", 178, Rarity.UNCOMMON, mage.cards.c.ContortionistTroupe.class));
        cards.add(new SetCardInfo("Corpse Cobble", 214, Rarity.UNCOMMON, mage.cards.c.CorpseCobble.class));
        cards.add(new SetCardInfo("Croaking Counterpart", 215, Rarity.RARE, mage.cards.c.CroakingCounterpart.class));
        cards.add(new SetCardInfo("Curse of Shaken Faith", 134, Rarity.RARE, mage.cards.c.CurseOfShakenFaith.class));
        cards.add(new SetCardInfo("Curse of Silence", 15, Rarity.RARE, mage.cards.c.CurseOfSilence.class));
        cards.add(new SetCardInfo("Curse of Surveillance", 46, Rarity.RARE, mage.cards.c.CurseOfSurveillance.class));
        cards.add(new SetCardInfo("Dawnhart Rejuvenator", 180, Rarity.COMMON, mage.cards.d.DawnhartRejuvenator.class));
        cards.add(new SetCardInfo("Dawnhart Wardens", 216, Rarity.UNCOMMON, mage.cards.d.DawnhartWardens.class));
        cards.add(new SetCardInfo("Defend the Celestus", 182, Rarity.UNCOMMON, mage.cards.d.DefendTheCelestus.class));
        cards.add(new SetCardInfo("Defenestrate", 95, Rarity.COMMON, mage.cards.d.Defenestrate.class));
        cards.add(new SetCardInfo("Delver of Secrets", 47, Rarity.UNCOMMON, mage.cards.d.DelverOfSecrets.class));
        cards.add(new SetCardInfo("Deserted Beach", 260, Rarity.RARE, mage.cards.d.DesertedBeach.class));
        cards.add(new SetCardInfo("Devious Cover-Up", 48, Rarity.COMMON, mage.cards.d.DeviousCoverUp.class));
        cards.add(new SetCardInfo("Dire-Strain Demolisher", 174, Rarity.UNCOMMON, mage.cards.d.DireStrainDemolisher.class));
        cards.add(new SetCardInfo("Dire-Strain Rampage", 219, Rarity.RARE, mage.cards.d.DireStrainRampage.class));
        cards.add(new SetCardInfo("Diregraf Horde", 96, Rarity.COMMON, mage.cards.d.DiregrafHorde.class));
        cards.add(new SetCardInfo("Diregraf Rebirth", 220, Rarity.UNCOMMON, mage.cards.d.DiregrafRebirth.class));
        cards.add(new SetCardInfo("Dissipate", 49, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Dreadhound", 97, Rarity.UNCOMMON, mage.cards.d.Dreadhound.class));
        cards.add(new SetCardInfo("Drownyard Amalgam", 50, Rarity.COMMON, mage.cards.d.DrownyardAmalgam.class));
        cards.add(new SetCardInfo("Dryad's Revival", 183, Rarity.UNCOMMON, mage.cards.d.DryadsRevival.class));
        cards.add(new SetCardInfo("Duel for Dominance", 184, Rarity.COMMON, mage.cards.d.DuelForDominance.class));
        cards.add(new SetCardInfo("Duress", 98, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Eaten Alive", 99, Rarity.COMMON, mage.cards.e.EatenAlive.class));
        cards.add(new SetCardInfo("Electric Revelation", 135, Rarity.COMMON, mage.cards.e.ElectricRevelation.class));
        cards.add(new SetCardInfo("Embodiment of Flame", 141, Rarity.UNCOMMON, mage.cards.e.EmbodimentOfFlame.class));
        cards.add(new SetCardInfo("Evolving Wilds", 261, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Fading Hope", 51, Rarity.UNCOMMON, mage.cards.f.FadingHope.class));
        cards.add(new SetCardInfo("Faithful Mending", 221, Rarity.UNCOMMON, mage.cards.f.FaithfulMending.class));
        cards.add(new SetCardInfo("Falcon Abomination", 52, Rarity.COMMON, mage.cards.f.FalconAbomination.class));
        cards.add(new SetCardInfo("Falkenrath Perforator", 136, Rarity.COMMON, mage.cards.f.FalkenrathPerforator.class));
        cards.add(new SetCardInfo("Falkenrath Pit Fighter", 137, Rarity.RARE, mage.cards.f.FalkenrathPitFighter.class));
        cards.add(new SetCardInfo("Famished Foragers", 138, Rarity.COMMON, mage.cards.f.FamishedForagers.class));
        cards.add(new SetCardInfo("Fateful Absence", 18, Rarity.RARE, mage.cards.f.FatefulAbsence.class));
        cards.add(new SetCardInfo("Festival Crasher", 140, Rarity.COMMON, mage.cards.f.FestivalCrasher.class));
        cards.add(new SetCardInfo("Field of Ruin", 262, Rarity.UNCOMMON, mage.cards.f.FieldOfRuin.class));
        cards.add(new SetCardInfo("Firmament Sage", 53, Rarity.UNCOMMON, mage.cards.f.FirmamentSage.class));
        cards.add(new SetCardInfo("Flame Channeler", 141, Rarity.UNCOMMON, mage.cards.f.FlameChanneler.class));
        cards.add(new SetCardInfo("Flare of Faith", 19, Rarity.COMMON, mage.cards.f.FlareOfFaith.class));
        cards.add(new SetCardInfo("Fleshtaker", 222, Rarity.UNCOMMON, mage.cards.f.Fleshtaker.class));
        cards.add(new SetCardInfo("Forest", 276, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Foul Play", 101, Rarity.UNCOMMON, mage.cards.f.FoulPlay.class));
        cards.add(new SetCardInfo("Galvanic Iteration", 224, Rarity.RARE, mage.cards.g.GalvanicIteration.class));
        cards.add(new SetCardInfo("Gavony Dawnguard", 20, Rarity.UNCOMMON, mage.cards.g.GavonyDawnguard.class));
        cards.add(new SetCardInfo("Gavony Trapper", 22, Rarity.COMMON, mage.cards.g.GavonyTrapper.class));
        cards.add(new SetCardInfo("Geistflame Reservoir", 142, Rarity.RARE, mage.cards.g.GeistflameReservoir.class));
        cards.add(new SetCardInfo("Ghoulcaller's Harvest", 225, Rarity.RARE, mage.cards.g.GhoulcallersHarvest.class));
        cards.add(new SetCardInfo("Grafted Identity", 57, Rarity.RARE, mage.cards.g.GraftedIdentity.class));
        cards.add(new SetCardInfo("Graveyard Glutton", 104, Rarity.RARE, mage.cards.g.GraveyardGlutton.class));
        cards.add(new SetCardInfo("Graveyard Trespasser", 104, Rarity.RARE, mage.cards.g.GraveyardTrespasser.class));
        cards.add(new SetCardInfo("Grizzly Ghoul", 226, Rarity.UNCOMMON, mage.cards.g.GrizzlyGhoul.class));
        cards.add(new SetCardInfo("Haunted Ridge", 263, Rarity.RARE, mage.cards.h.HauntedRidge.class));
        cards.add(new SetCardInfo("Hedgewitch's Mask", 23, Rarity.COMMON, mage.cards.h.HedgewitchsMask.class));
        cards.add(new SetCardInfo("Heirloom Mirror", 105, Rarity.UNCOMMON, mage.cards.h.HeirloomMirror.class));
        cards.add(new SetCardInfo("Hobbling Zombie", 106, Rarity.COMMON, mage.cards.h.HobblingZombie.class));
        cards.add(new SetCardInfo("Hook-Haunt Drifter", 42, Rarity.COMMON, mage.cards.h.HookHauntDrifter.class));
        cards.add(new SetCardInfo("Hound Tamer", 187, Rarity.UNCOMMON, mage.cards.h.HoundTamer.class));
        cards.add(new SetCardInfo("Howl of the Hunt", 188, Rarity.COMMON, mage.cards.h.HowlOfTheHunt.class));
        cards.add(new SetCardInfo("Hungry for More", 228, Rarity.UNCOMMON, mage.cards.h.HungryForMore.class));
        cards.add(new SetCardInfo("Immolation", 144, Rarity.COMMON, mage.cards.i.Immolation.class));
        cards.add(new SetCardInfo("Infernal Grasp", 107, Rarity.UNCOMMON, mage.cards.i.InfernalGrasp.class));
        cards.add(new SetCardInfo("Inherited Fiend", 105, Rarity.UNCOMMON, mage.cards.i.InheritedFiend.class));
        cards.add(new SetCardInfo("Insectile Aberration", 47, Rarity.UNCOMMON, mage.cards.i.InsectileAberration.class));
        cards.add(new SetCardInfo("Intrepid Adversary", 25, Rarity.MYTHIC, mage.cards.i.IntrepidAdversary.class));
        cards.add(new SetCardInfo("Island", 270, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jack-o'-Lantern", 254, Rarity.COMMON, mage.cards.j.JackOLantern.class));
        cards.add(new SetCardInfo("Jadar, Ghoulcaller of Nephalia", 108, Rarity.RARE, mage.cards.j.JadarGhoulcallerOfNephalia.class));
        cards.add(new SetCardInfo("Join the Dance", 229, Rarity.UNCOMMON, mage.cards.j.JoinTheDance.class));
        cards.add(new SetCardInfo("Kessig Naturalist", 231, Rarity.UNCOMMON, mage.cards.k.KessigNaturalist.class));
        cards.add(new SetCardInfo("Lambholt Harrier", 145, Rarity.COMMON, mage.cards.l.LambholtHarrier.class));
        cards.add(new SetCardInfo("Lier, Disciple of the Drowned", 59, Rarity.MYTHIC, mage.cards.l.LierDiscipleOfTheDrowned.class));
        cards.add(new SetCardInfo("Lord of the Ulvenwald", 231, Rarity.UNCOMMON, mage.cards.l.LordOfTheUlvenwald.class));
        cards.add(new SetCardInfo("Loyal Gryff", 26, Rarity.UNCOMMON, mage.cards.l.LoyalGryff.class));
        cards.add(new SetCardInfo("Lunar Frenzy", 147, Rarity.UNCOMMON, mage.cards.l.LunarFrenzy.class));
        cards.add(new SetCardInfo("Mask of Griselbrand", 111, Rarity.RARE, mage.cards.m.MaskOfGriselbrand.class));
        cards.add(new SetCardInfo("Might of the Old Ways", 189, Rarity.COMMON, mage.cards.m.MightOfTheOldWays.class));
        cards.add(new SetCardInfo("Moonsilver Key", 255, Rarity.UNCOMMON, mage.cards.m.MoonsilverKey.class));
        cards.add(new SetCardInfo("Morbid Opportunist", 113, Rarity.UNCOMMON, mage.cards.m.MorbidOpportunist.class));
        cards.add(new SetCardInfo("Mountain", 274, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mystic Monstrosity", 256, Rarity.UNCOMMON, mage.cards.m.MysticMonstrosity.class));
        cards.add(new SetCardInfo("Mystic Skull", 256, Rarity.UNCOMMON, mage.cards.m.MysticSkull.class));
        cards.add(new SetCardInfo("Neblegast Intruder", 64, Rarity.UNCOMMON, mage.cards.n.NeblegastIntruder.class));
        cards.add(new SetCardInfo("Obsessive Astronomer", 152, Rarity.UNCOMMON, mage.cards.o.ObsessiveAstronomer.class));
        cards.add(new SetCardInfo("Odric's Outrider", 29, Rarity.UNCOMMON, mage.cards.o.OdricsOutrider.class));
        cards.add(new SetCardInfo("Organ Hoarder", 66, Rarity.COMMON, mage.cards.o.OrganHoarder.class));
        cards.add(new SetCardInfo("Overgrown Farmland", 265, Rarity.RARE, mage.cards.o.OvergrownFarmland.class));
        cards.add(new SetCardInfo("Overwhelmed Archivist", 68, Rarity.UNCOMMON, mage.cards.o.OverwhelmedArchivist.class));
        cards.add(new SetCardInfo("Patrician Geist", 69, Rarity.RARE, mage.cards.p.PatricianGeist.class));
        cards.add(new SetCardInfo("Pestilent Wolf", 192, Rarity.COMMON, mage.cards.p.PestilentWolf.class));
        cards.add(new SetCardInfo("Phantom Carriage", 70, Rarity.UNCOMMON, mage.cards.p.PhantomCarriage.class));
        cards.add(new SetCardInfo("Pithing Needle", 257, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Plains", 268, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Play with Fire", 154, Rarity.UNCOMMON, mage.cards.p.PlayWithFire.class));
        cards.add(new SetCardInfo("Plummet", 193, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Poppet Factory", 71, Rarity.MYTHIC, mage.cards.p.PoppetFactory.class));
        cards.add(new SetCardInfo("Poppet Stitcher", 71, Rarity.MYTHIC, mage.cards.p.PoppetStitcher.class));
        cards.add(new SetCardInfo("Primal Adversary", 194, Rarity.MYTHIC, mage.cards.p.PrimalAdversary.class));
        cards.add(new SetCardInfo("Raze the Effigy", 156, Rarity.COMMON, mage.cards.r.RazeTheEffigy.class));
        cards.add(new SetCardInfo("Reckless Stormseeker", 157, Rarity.RARE, mage.cards.r.RecklessStormseeker.class));
        cards.add(new SetCardInfo("Return to Nature", 195, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Rite of Harmony", 236, Rarity.RARE, mage.cards.r.RiteOfHarmony.class));
        cards.add(new SetCardInfo("Ritual Guardian", 30, Rarity.COMMON, mage.cards.r.RitualGuardian.class));
        cards.add(new SetCardInfo("Ritual of Hope", 31, Rarity.UNCOMMON, mage.cards.r.RitualOfHope.class));
        cards.add(new SetCardInfo("Rockfall Vale", 266, Rarity.RARE, mage.cards.r.RockfallVale.class));
        cards.add(new SetCardInfo("Sacred Fire", 239, Rarity.UNCOMMON, mage.cards.s.SacredFire.class));
        cards.add(new SetCardInfo("Saryth, the Viper's Fang", 197, Rarity.RARE, mage.cards.s.SarythTheVipersFang.class));
        cards.add(new SetCardInfo("Seafaring Werewolf", 80, Rarity.RARE, mage.cards.s.SeafaringWerewolf.class));
        cards.add(new SetCardInfo("Secrets of the Key", 73, Rarity.COMMON, mage.cards.s.SecretsOfTheKey.class));
        cards.add(new SetCardInfo("Shadowbeast Sighting", 198, Rarity.COMMON, mage.cards.s.ShadowbeastSighting.class));
        cards.add(new SetCardInfo("Shipwreck Marsh", 267, Rarity.RARE, mage.cards.s.ShipwreckMarsh.class));
        cards.add(new SetCardInfo("Sigarda, Champion of Light", 240, Rarity.MYTHIC, mage.cards.s.SigardaChampionOfLight.class));
        cards.add(new SetCardInfo("Slaughter Specialist", 122, Rarity.RARE, mage.cards.s.SlaughterSpecialist.class));
        cards.add(new SetCardInfo("Snarling Wolf", 199, Rarity.COMMON, mage.cards.s.SnarlingWolf.class));
        cards.add(new SetCardInfo("Spectral Adversary", 77, Rarity.MYTHIC, mage.cards.s.SpectralAdversary.class));
        cards.add(new SetCardInfo("Spellrune Howler", 160, Rarity.UNCOMMON, mage.cards.s.SpellruneHowler.class));
        cards.add(new SetCardInfo("Spellrune Painter", 160, Rarity.UNCOMMON, mage.cards.s.SpellrunePainter.class));
        cards.add(new SetCardInfo("Startle", 78, Rarity.COMMON, mage.cards.s.Startle.class));
        cards.add(new SetCardInfo("Storm-Charged Slasher", 157, Rarity.RARE, mage.cards.s.StormChargedSlasher.class));
        cards.add(new SetCardInfo("Stormrider Spirit", 79, Rarity.COMMON, mage.cards.s.StormriderSpirit.class));
        cards.add(new SetCardInfo("Stromkirk Bloodthief", 123, Rarity.UNCOMMON, mage.cards.s.StromkirkBloodthief.class));
        cards.add(new SetCardInfo("Stuffed Bear", 259, Rarity.COMMON, mage.cards.s.StuffedBear.class));
        cards.add(new SetCardInfo("Sungold Barrage", 36, Rarity.COMMON, mage.cards.s.SungoldBarrage.class));
        cards.add(new SetCardInfo("Sunrise Cavalier", 244, Rarity.UNCOMMON, mage.cards.s.SunriseCavalier.class));
        cards.add(new SetCardInfo("Sunstreak Phoenix", 162, Rarity.MYTHIC, mage.cards.s.SunstreakPhoenix.class));
        cards.add(new SetCardInfo("Suspicious Stowaway", 80, Rarity.RARE, mage.cards.s.SuspiciousStowaway.class));
        cards.add(new SetCardInfo("Swamp", 272, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Tainted Adversary", 124, Rarity.MYTHIC, mage.cards.t.TaintedAdversary.class));
        cards.add(new SetCardInfo("Tavern Ruffian", 163, Rarity.COMMON, mage.cards.t.TavernRuffian.class));
        cards.add(new SetCardInfo("Tavern Smasher", 163, Rarity.COMMON, mage.cards.t.TavernSmasher.class));
        cards.add(new SetCardInfo("Thermo-Alchemist", 164, Rarity.UNCOMMON, mage.cards.t.ThermoAlchemist.class));
        cards.add(new SetCardInfo("Thraben Exorcism", 39, Rarity.COMMON, mage.cards.t.ThrabenExorcism.class));
        cards.add(new SetCardInfo("Timberland Guide", 202, Rarity.COMMON, mage.cards.t.TimberlandGuide.class));
        cards.add(new SetCardInfo("Triskaidekaphile", 81, Rarity.RARE, mage.cards.t.Triskaidekaphile.class));
        cards.add(new SetCardInfo("Unnatural Growth", 206, Rarity.RARE, mage.cards.u.UnnaturalGrowth.class));
        cards.add(new SetCardInfo("Unruly Mob", 40, Rarity.COMMON, mage.cards.u.UnrulyMob.class));
        cards.add(new SetCardInfo("Untamed Pup", 187, Rarity.UNCOMMON, mage.cards.u.UntamedPup.class));
        cards.add(new SetCardInfo("Vadrik, Astral Archmage", 248, Rarity.RARE, mage.cards.v.VadrikAstralArchmage.class));
        cards.add(new SetCardInfo("Vampire Interloper", 125, Rarity.COMMON, mage.cards.v.VampireInterloper.class));
        cards.add(new SetCardInfo("Vampire Socialite", 249, Rarity.UNCOMMON, mage.cards.v.VampireSocialite.class));
        cards.add(new SetCardInfo("Vanquish the Horde", 41, Rarity.RARE, mage.cards.v.VanquishTheHorde.class));
        cards.add(new SetCardInfo("Village Reavers", 165, Rarity.UNCOMMON, mage.cards.v.VillageReavers.class));
        cards.add(new SetCardInfo("Village Watch", 165, Rarity.UNCOMMON, mage.cards.v.VillageWatch.class));
        cards.add(new SetCardInfo("Vivisection", 83, Rarity.UNCOMMON, mage.cards.v.Vivisection.class));
        cards.add(new SetCardInfo("Voldaren Ambusher", 166, Rarity.UNCOMMON, mage.cards.v.VoldarenAmbusher.class));
        cards.add(new SetCardInfo("Willow Geist", 207, Rarity.RARE, mage.cards.w.WillowGeist.class));
        cards.add(new SetCardInfo("Wing Shredder", 169, Rarity.COMMON, mage.cards.w.WingShredder.class));
        cards.add(new SetCardInfo("Wrenn and Seven", 208, Rarity.MYTHIC, mage.cards.w.WrennAndSeven.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is fully implemented
    }
}

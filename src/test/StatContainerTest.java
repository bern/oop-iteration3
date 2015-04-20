//package test;
//
//import game.model.entity.Armory;
//import game.model.entity.stat.StatContainer;
//import game.model.item.Armor;
//import game.model.item.Weapon;
//import game.util.Location;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StatContainerTest {
//    @Test
//    public void test() throws Exception {
//        //Set up
//        Location location = new Location(0,0);
//        Armory armory = new Armory();
//        StatContainer statContainer = new StatContainer(armory);
//        Weapon weapon = new Weapon(location, 10);
//        Armor armor = new Armor(location, 5);
//        Armor armor2 = new Armor(location, 15);
//        armory.equip(weapon);
//        armory.equip(armor);
//        armory.equip(armor2);
//
//        //test
//        statContainer.setHardiness(5);
//        statContainer.setStrength(2);
//        statContainer.setExperience(1000);
//        statContainer.updateAllDerived();
//        assertEquals(25, statContainer.getArmorRating());
//        assertEquals(14, statContainer.getOffensiveRating());
//    }
//}
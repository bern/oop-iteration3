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
//public class ArmoryTest {
//
//    @Test
//    public void test() throws Exception {
//        //Set up
//        Location location = new Location(0,0);
//        Armory armory = new Armory();
//        Weapon weapon = new Weapon(location, 10);
//        Armor armor = new Armor(location, 5);
//        Armor armor2 = new Armor(location, 15);
//
//        //unequip when empty
//        assertFalse(armory.unequip(weapon));
//        assertFalse(armory.unequip(armor));
//        assertFalse((armory.unequip(armor2)));
//
//        //Equip
//        assertTrue(armory.equip(weapon));
//        assertTrue(armory.equip(armor));
//        assertTrue(armory.equip(armor2));
//
//        //values
//        assertEquals(20, armory.getArmorRating());
//        assertEquals(10, armory.getWeaponRating());
//
//        //unequip
//        assertTrue(armory.unequip(weapon));
//        assertTrue(armory.unequip(armor));
//        assertTrue(armory.unequip(armor2));
//    }
//}
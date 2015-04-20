package game.model.entity;

import game.model.item.Armor;
import game.model.item.Equipment;
import game.model.item.Weapon;

import java.util.ArrayList;

public class Armory {
    private Weapon weapon;
    private ArrayList<Armor> items;

    public static final int MAX_SIZE = 6;

    public Armory() {
        items = new ArrayList<Armor>();
    }

    public boolean hasItem(Equipment item) {
        return items.contains(item);
    }

    public ArrayList<Armor> getItems() {
        return items;
    }

    public int getArmorRating() {
        int temp = 0;
        for(Armor equipment : items) {
            temp += equipment.getArmorRating();
        }
        return temp;
    }

    public int getWeaponRating() {
        if (weapon != null)
            return weapon.getAttackRatiing();
        return 0;
    }

    public boolean equip(Equipment equipment) {
        return equipment.equip(this);
    }

    public boolean unequip(Equipment equipment) {
        return equipment.unequip(this);
    }

    public boolean equipArmor(Armor armor) {
        return items.add(armor);
    }

    public boolean unequipArmor(Armor armor) {
        return items.remove(armor);
    }

    public boolean equipWeapon(Weapon weapon) {
        if (weapon == null)
            throw new NullPointerException("weapon");
        if (this.weapon != null)
            this.weapon.unequip(this);
        this.weapon = weapon;
        return true;
    }

    public boolean unequipWeapon(Weapon weapon) {
        if (weapon == null)
            throw new NullPointerException("weapon");
        if (this.weapon != null) {
            if (this.weapon.equals(weapon)) {
                weapon = null;
                return true;
            }
        }
        return false;
    }
}

package game.model.item;

import game.model.entity.Armory;
import game.util.Location;

public class Armor extends Equipment {
    int armorRating;

    public Armor(Location location, int armorRating) {
        super(location);
        this.armorRating = armorRating;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public boolean equip(Armory armory) {
        return armory.equipArmor(this);
    }

    public boolean unequip(Armory armory) {
        return armory.unequipArmor(this);
    }
}

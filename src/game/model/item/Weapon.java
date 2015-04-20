package game.model.item;

import game.model.entity.Armory;
import game.util.Location;

public class Weapon extends Equipment{
    private int attackRatiing;

    public Weapon(Location l, int attackRating) {
        super(l);
        this.attackRatiing = attackRating;
    }

    @Override
    public boolean equip(Armory armory) {
        return armory.equipWeapon(this);
    }

    @Override
    public boolean unequip(Armory armory) {
        return armory.unequipWeapon(this);
    }

    public int getAttackRatiing() {
        return attackRatiing;
    }
}

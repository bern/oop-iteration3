package game.model.item;

import game.model.entity.Armory;
import game.model.entity.Entity;
import game.model.entity.stat.StatContainer;
import game.util.Location;

public abstract class Equipment extends TakeableItem{

    public Equipment(Location l) {
        super(l);
    }

    public abstract boolean equip(Armory armory);
    public abstract boolean unequip(Armory armory);
}

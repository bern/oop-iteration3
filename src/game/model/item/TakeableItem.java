package game.model.item;

import game.controller.TakeItem;
import game.model.entity.Character;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;
import game.util.Location;

import javax.swing.*;

public abstract class TakeableItem extends Item {

    public TakeableItem(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Entity e) {
        return new TakeItem(e, this);
    }

    @Override
    public AbstractAction interactWith(Mount m) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Npc n) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Character n) {
        return null;
    }

    
}

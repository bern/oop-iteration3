package game.model.item;

import game.controller.TakeItem;
import game.model.entity.Avataar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;
import game.util.Location;

import javax.swing.*;

public abstract class TakeableItem extends Item {

    public TakeableItem(Location l) {
        super(l);
    }
}

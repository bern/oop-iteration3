package game.model.item;

import game.controller.TakeItem;
import game.model.entity.Avatar;
import game.util.Location;

import javax.swing.*;

public abstract class TakeableItem extends Item {

    public TakeableItem(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar avatar) {
        return new TakeItem(avatar, this);
    }
}

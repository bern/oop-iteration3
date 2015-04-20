package game.model.entity;

import game.controller.DenyMoveAction;
import game.model.behavior.EntityInteractable;
import game.model.item.TakeableItem;
import game.util.Location;

import javax.swing.*;

public class Avatar extends Entity {

    public Avatar(Location l) {
        super(l);
    }

    //Add Item to inventory
    public void addTakeable(TakeableItem item) {
        //TODO.
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new DenyMoveAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new DenyMoveAction();
    }
}

package game.model.item;

import game.controller.OneShotAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;

public abstract class OneShotItem extends Item {

    public OneShotItem(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new OneShotAction(this, i);
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return new OneShotAction(this, i);
    }

    public abstract void performAction(Entity i);
}

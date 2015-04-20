package game.model.item;

import game.controller.DenyMoveAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;

public class Obstacle extends Item{

    public Obstacle(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return new DenyMoveAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new DenyMoveAction();
    }
}

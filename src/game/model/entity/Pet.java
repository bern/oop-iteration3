package game.model.entity;


import game.model.behavior.EntityInteractable;
import game.util.Location;

import javax.swing.*;

public class Pet extends Entity {

    public Pet(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Mount i) {
        return null;
    }

    @Override
    public AbstractAction interactWith(EntityInteractable e) {
        return e.beInteractedWithBy( this );
    }
}

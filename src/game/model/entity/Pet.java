package game.model.entity;


import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

public class Pet extends Entity {

    public Pet(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }
}

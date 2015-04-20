package game.model.entity;



import game.model.behavior.Interactable;
import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

public class Character extends Entity {


    public Character(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AbstractAction interactWith(Interactable e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

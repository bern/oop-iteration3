package game.model.entity;

import game.model.behavior.Interactable;
import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

public class Npc extends Entity {


    public Npc(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Interactable e) {
        return e.beInteractedWithBy( this );
    }
}

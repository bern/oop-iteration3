package game.model.entity;

import game.controller.DenyMoveAction;
import game.model.behavior.Interactable;
import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

public class Npc extends Entity {


    public Npc(Location l) {
        super(l);
    }


    @Override
    public AbstractAction interactWith(Interactable e) {
        return e.beInteractedWithBy( this );
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new DenyMoveAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new DenyMoveAction();    //Change to TalkingAndDenyMoveAction?!?
    }
}

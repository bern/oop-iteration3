package game.model.entity;

import game.controller.DenyMoveAction;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Npc extends Entity {


    public Npc(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new DenyMoveAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new DenyMoveAction();    //Change to TalkingAndDenyMoveAction?!?
    }

    public BufferedImage drawOn( GameWorldView gv){
        return gv.imageOf(this);
    }
}

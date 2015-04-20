package game.model.entity;


import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Pet extends Entity {

    public Pet(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return null;
    }

    public BufferedImage drawOn( GameWorldView gv){
        return gv.imageOf(this);
    }
}

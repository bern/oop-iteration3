package game.model.entity;


import game.model.behavior.EntityInteractable;
import game.util.Location;
import game.view.GameWorldView;

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
    public AbstractAction beInteractedWithBy(Avatar a) {
        return null;
    }

    @Override
    public void prepareForDraw(GameWorldView g) {
        g.drawGameObject( this );
    }
}

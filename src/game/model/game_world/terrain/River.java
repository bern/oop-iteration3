package game.model.game_world.terrain;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class River  extends Terrain{
    public River(Location l) {
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

    public BufferedImage drawOn(GameWorldView v){
        return v.imageOf(this);
    }
}

package game.model.game_world.terrain;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Water extends Terrain {

    public Water(Location location) {
        super(location);
    }


    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return null;
    }


    public AbstractAction beInteractedWithBy(Mount i) {
        return null;
    }

    public BufferedImage drawOn(GameWorldView v){
        return v.imageOf(this);
    }
}


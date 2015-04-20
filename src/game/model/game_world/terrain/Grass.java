package game.model.game_world.terrain;

import game.controller.MoveToAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new MoveToAction( i, this.getLocation());
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new MoveToAction( a, this.getLocation());

    }

    @Override
    public BufferedImage drawOn(GameWorldView v){
        return v.imageOf(this);
    }
}

package game.model.game_world.terrain;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;


public class Mountain extends Terrain {

    public Mountain(Location location) {
        super(location);
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
    public String toString(){
        return "Mountain";
    }
}
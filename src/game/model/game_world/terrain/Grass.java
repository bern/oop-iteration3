package game.model.game_world.terrain;


import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Mount i) {
        return null;
    }

    @Override
    public String toString(){
        return "Grass";
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }
}

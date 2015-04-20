package game.model.game_world;


import game.controller.MoveToAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;
import game.model.game_world.terrain.Terrain;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {


    public Grass(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new MoveToAction( i, getLocation().north());
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new MoveToAction( a, getLocation().north());
    }
}

package game.model.game_world;


import game.controller.MoveToAction;
import game.model.entity.Character;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {


    public Grass(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Entity e) {
        return new MoveToAction( e, getLocation().north());
    }

    @Override
    public AbstractAction interactWith(Mount m) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Npc n) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Character n) {
        return null;
    }
}

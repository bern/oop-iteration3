package game.model.game_world.terrain;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.util.Location;

import javax.swing.*;


public class Dirt extends Terrain {

    public Dirt(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
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
        return "Dirt";
    }

    public Dirt draw(){
        return this;
    }
}

package game.model.entity;

import game.util.Location;

import javax.swing.*;

/**
 * Created by parango on 4/19/15.
 */
public class Npc extends Entity {


    public Npc(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Entity e) {
        return null;
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

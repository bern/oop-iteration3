package game.model.entity;


import game.util.Location;

import javax.swing.*;

public class Pet extends Entity {


    public Pet(Location l) {
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

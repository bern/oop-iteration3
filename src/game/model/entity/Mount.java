package game.model.entity;


import game.util.Location;

import javax.swing.*;

public class Mount extends Entity {

    Character mountedCharacter;

    public Mount(Location l) {
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

    public void mount(Character character) {
        setMountedCharacter(character);
    }

    public Character getMountedCharacter() {
        return mountedCharacter;
    }


    public void setMountedCharacter(Character mountedCharacter) {
        this.mountedCharacter = mountedCharacter;
    }
}

package game.model.entity;

import game.model.item.Item;

<<<<<<< Updated upstream
public abstract class Pet extends Entity {

    public Pet(int x, int y) {
        super();
=======
import game.util.Location;

import javax.swing.*;

public class Pet extends Entity {


    public Pet(Location l) {
        super(l);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    public String interactWith( Item i){
        return "Mount with Item";
=======

    @Override
    public AbstractAction interactWith(Avatar n) {
        return null;
>>>>>>> Stashed changes
    }
}

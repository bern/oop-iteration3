package game.model.game_world;


import game.model.behavior.Interactable;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Interactable e) {
        //TODO
        return null;
    }
}

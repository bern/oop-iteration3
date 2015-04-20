package game.model.game_world.terrain;


import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }
}

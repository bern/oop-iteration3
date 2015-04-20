package game.model.game_world.terrain;

import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;


public class Mountain extends Terrain {


    public Mountain(Location l, Location location) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }
}
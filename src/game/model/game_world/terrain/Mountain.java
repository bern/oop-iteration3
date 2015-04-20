package game.model.game_world.terrain;

import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;


public class Mountain extends Terrain {

    public Mountain(Location location) {
        super(location);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }
    @Override
    public String toString(){
        return "Mountain";
    }
}
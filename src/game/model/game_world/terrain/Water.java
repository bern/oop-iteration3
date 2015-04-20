package game.model.game_world.terrain;

import game.model.behavior.Interactor;
import game.util.Location;

import javax.swing.*;

/**
 * Created by parango on 4/19/15.
 */
public class Water extends Terrain {

    public Water(Location location) {
        super(location);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }

    @Override
    public String toString(){
        return "Water";
    }
}


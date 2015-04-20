package game.model.item;

import game.controller.TriggerTrapAction;
import game.model.entity.Avatar;
import game.model.game_world.AreaEffect;
import game.util.Location;

import javax.swing.*;


/** Will active an AreaEffect when triggered */
public class Trap extends Item {
    AreaEffect areaEffect;

    public Trap(Location l, AreaEffect areaEffect) {
        super(l);
        areaEffect = areaEffect;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return new TriggerTrapAction(this);
    }

    public void performAction() {
        //TODO: Apply area affect to the map.
    }

    public void disarmTrip() {

    }
}

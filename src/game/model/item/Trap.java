package game.model.item;

import game.controller.TriggerTrapAction;
import game.model.abilities.StatusEffect;
import game.model.entity.Avatar;
import game.util.Location;

import javax.swing.*;

public class Trap extends Item {
    StatusEffect effect;
    int detectionRating;

    public Trap(Location l, StatusEffect effect, int detectionRating) {
        super(l);
        this.effect = effect;
        this.detectionRating = detectionRating;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return new TriggerTrapAction(this, i);
    }

    public void performAction(Avatar avatar) {
        if (isDetected(avatar)) {
            //TODO activate effect.
            //effect.activate();
        }
    }

    public boolean isDetected(Avatar avatar) {
        return avatar.getDetectingRating() > detectionRating;
    }

    /** Destroy associated effect. Then Remove from the map. */
    public void disarmTrip() {
        //TODO: remove area effect.
        //TODO: remove self.
    }
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.LinearAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class PickpocketAbility extends LinearAbility {
    
    @Override
    protected int getStrength() {
        return 1;
    }

    @Override
    protected PickpocketedEffect createStatusEffect() {
        return new PickpocketedEffect();
    }

    @Override
    public void activate(Entity caller) {
        PickpocketedEffect ef = createStatusEffect();
        ef.setOwner(caller);
        affectTiles(caller, ef);
    }
}

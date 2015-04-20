/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.RadialAbility;
import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class DetectTrapAbility extends RadialAbility {

    @Override
    protected int getStrength() {
        return 1;
    }

    @Override
    protected TrapDetectionEffect createStatusEffect() {
        return new TrapDetectionEffect();
    }

    @Override
    public void activate(Entity caller) {
        TrapDetectionEffect ef = createStatusEffect();
        ef.setOwner(caller);
        affectTiles(caller, ef);
    }
    
}

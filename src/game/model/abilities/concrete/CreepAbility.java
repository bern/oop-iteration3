/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.BoonAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class CreepAbility extends BoonAbility {
    
    @Override
    protected CreepingEffect createStatusEffect() {
        return new CreepingEffect();
    }

    @Override
    public void activate(Entity caller) {
        CreepingEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
    }
}

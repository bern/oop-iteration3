/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class CreepingEffect extends StatusEffect {

    @Override
    public void applyTo(Entity victim) {
        victim.toggleSneaking();
    }
    
}

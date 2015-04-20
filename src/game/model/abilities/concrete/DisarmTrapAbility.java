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
public class DisarmTrapAbility extends RadialAbility {

    @Override
    protected int getStrength() {
        return 1;
    }

    @Override
    protected TrapDisarmEffect createStatusEffect() {
        return new TrapDisarmEffect();
    }

    @Override
    public void activate(Entity caller) {
        affectTiles(caller);
    }
    
}

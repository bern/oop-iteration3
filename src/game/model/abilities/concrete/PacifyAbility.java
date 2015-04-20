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
public class PacifyAbility extends LinearAbility{

    @Override
    protected int getStrength() {
        return 1;
    }

    @Override
    protected PacifyEffect createStatusEffect() {
        return new PacifyEffect(30);
    }

    @Override
    public void activate(Entity caller) {
        affectTiles(caller);
    }
    
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.RadialAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class FearAbility extends RadialAbility {
    
    @Override
    protected int getStrength() {
        return 2;
    }

    @Override
    protected FearEffect createStatusEffect() {
       return new FearEffect(10);
    }

    @Override
    public void activate(Entity caller) {
        FearEffect ef = createStatusEffect();
        ef.setOwner(caller);
        affectTiles(caller, ef);
    } 
}

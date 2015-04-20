/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.TimedEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class FearEffect extends TimedEffect {
    
    public FearEffect(long time) {
        super(time);
    }

    @Override
    public void reverseEffect() {
        getVictim().setAfraid(false);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.setAfraid(true);
        setVictim(victim);
    }
    
}

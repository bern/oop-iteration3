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
public class InvisibleEffect extends TimedEffect {
    public InvisibleEffect(long time) {
        super(time);
    }

    @Override
    public void reverseEffect() {
       //getVictim().setInvisible(false);
    }

    @Override
    public void applyTo(Entity victim) {
       //victim.setInvisible(true);
       setVictim(victim);
    }
    
}

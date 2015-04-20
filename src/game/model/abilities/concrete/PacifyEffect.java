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
public class PacifyEffect extends TimedEffect {
    public PacifyEffect(long time) {
        super(time);
    }
    
    @Override
    public void reapply() {
        //getVictim().setPacified(true);
    }

    @Override
    public void reverseEffect() {
        //getVictim().setPacified(false);
    }

    @Override
    public void applyTo(Entity victim) {
        //victim.setPacified(true);
        setVictim(victim);
    }
    
}

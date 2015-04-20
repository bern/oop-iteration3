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
public class ParalyzeEffect extends TimedEffect {
    
    public ParalyzeEffect(long stick) {
        super(stick);
    }

    @Override
    public void reverseEffect() {
        //getVictim().setParalyzed(false);
    }

    @Override
    public void applyTo(Entity victim) {
        //victim.setParalyzed(true);
        setVictim(victim);
    }
}

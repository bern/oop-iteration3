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
public class SlowEffect extends TimedEffect {
    private float amt;
    
    public SlowEffect(float amt, long time) {
        super(time);
        this.amt = amt;
    }

    @Override
    public void reverseEffect() {
       //getVictim().setSpeed(1.0);
    }

    @Override
    public void applyTo(Entity victim) {
        //victim.setSpeed(amt);
        setVictim(victim);
    }
    
}

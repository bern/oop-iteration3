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
public class QuickenEffect extends TimedEffect {
    private float strength;
    
    public QuickenEffect(float str, long time) {
        super(time);
        strength = str;
    }

    @Override
    public void reverseEffect() {
        getVictim().setSpeed(1.0);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.setSpeed(strength);
        setVictim(victim);
    }
    
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.Game;
import game.model.abilities.TimedEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class QuickenEffect extends TimedEffect {
    private int strength;
    
    public QuickenEffect(int str, long time) {
        super(time);
        strength = str;
    }
    
    @Override
    public void reapply() {
        getVictim().modSpeed(strength);
    }

    @Override
    public void reverseEffect() {
        getVictim().modSpeed(strength * -1);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.modSpeed(strength);
        setVictim(victim);
        Game.getInstance().getActiveWorld().addEffect(this);
    }
    
}

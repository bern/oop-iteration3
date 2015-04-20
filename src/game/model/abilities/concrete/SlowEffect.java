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
public class SlowEffect extends TimedEffect {
    private int amt;
    
    public SlowEffect(int amt, long time) {
        super(time);
        this.amt = amt;
    }

    @Override
    public void reverseEffect() {
       getVictim().modSpeed(amt * -1);
    }
    
    @Override
    public void reapply() {
        getVictim().modSpeed(amt);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.modSpeed(amt);
        setVictim(victim);
        Game.getInstance().getActiveWorld().addEffect(this);
    }
    
}

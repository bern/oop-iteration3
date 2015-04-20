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
public class ParalyzeEffect extends TimedEffect {
    
    public ParalyzeEffect(long stick) {
        super(stick);
    }
    
    @Override
    public void reapply() {
        getVictim().setParalyzed(true);
    }

    @Override
    public void reverseEffect() {
        getVictim().setParalyzed(false);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.setParalyzed(true);
        setVictim(victim);
        Game.getInstance().getActiveWorld().addEffect(this);
    }
}

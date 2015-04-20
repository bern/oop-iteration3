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
public class StrengthEffect extends TimedEffect {
    private int str;
    
    public StrengthEffect(int str, long time) {
        super(time);
        this.str = str;
    }

    @Override
    public void reverseEffect() {
        getVictim().modStrength(str * -1);
    }

    @Override
    public void applyTo(Entity victim) {
        victim.modStrength(str);
        setVictim(victim);
    }
    
}

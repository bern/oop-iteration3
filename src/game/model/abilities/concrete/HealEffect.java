/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class HealEffect extends StatusEffect {
    private int amt;
    
    public HealEffect(int amt) {
        this.amt = amt;
    }
    @Override
    public void applyTo(Entity victim) {
        victim.healDamage(amt);
    }
    
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

public class DamageEffect extends StatusEffect {
    private int damage;
    
    public DamageEffect(int str) {
        super();
        damage = str;
    }

    @Override
    public void applyTo(Entity victim) {
        victim.takeDamage(damage);
    }
    
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.Projectile;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class FireballProjectile extends Projectile {

    @Override
    public void onHit(Entity hit) {
        DamageEffect effect = createStatusEffect();
        effect.applyTo(hit);
    }

    @Override
    protected DamageEffect createStatusEffect() {
        return new DamageEffect(10);
    }

    @Override
    protected long getSpeed() {
        return 250;
    }
    
}

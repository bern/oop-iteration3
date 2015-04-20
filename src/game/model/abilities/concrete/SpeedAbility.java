/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.BoonAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class SpeedAbility extends BoonAbility {
    
    @Override
    protected QuickenEffect createStatusEffect() {
        return new QuickenEffect(5, 15);
    }

    @Override
    public void activate(Entity caller) {
        QuickenEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
    }
}

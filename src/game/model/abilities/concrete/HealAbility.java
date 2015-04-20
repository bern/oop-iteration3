/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.Game;
import game.model.abilities.BoonAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class HealAbility extends BoonAbility {
    
    @Override
    protected HealEffect createStatusEffect() {
        return new HealEffect(10);
    }

    @Override
    public void activate(Entity caller) {
        HealEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
        Game.getInstance().getActiveWorld().addEffect(ef);
    }
}

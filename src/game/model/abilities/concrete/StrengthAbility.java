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
public class StrengthAbility extends BoonAbility {
    
    @Override
    protected StrengthEffect createStatusEffect() {
        return new StrengthEffect(2, 30);
    }

    @Override
    public void activate(Entity caller) {
        StrengthEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
        Game.getInstance().getActiveWorld().addEffect(ef);
    }
}

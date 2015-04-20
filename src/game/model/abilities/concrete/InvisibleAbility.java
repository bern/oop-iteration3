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
public class InvisibleAbility extends BoonAbility{

    @Override
    protected InvisibleEffect createStatusEffect() {
        return new InvisibleEffect(15);
    }

    @Override
    public void activate(Entity caller) {
        InvisibleEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
        //Game.getInstance().getActiveWorld().addEffect(ef);
    }
    
}

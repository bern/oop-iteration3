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
public class SpeedAbility extends BoonAbility {
    
    @Override
    protected QuickenEffect createStatusEffect() {
        return new QuickenEffect((float) 2.0, 15);
    }

    @Override
    public void activate(Entity caller) {
        QuickenEffect ef = createStatusEffect();
        ef.setOwner(caller);
        ef.applyTo(caller);
       // Game.getInstance().getActiveWorld().addEffect(ef);
    }
}

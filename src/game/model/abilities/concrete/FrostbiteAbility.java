/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.RadialAbility;
import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class FrostbiteAbility extends RadialAbility {

    @Override
    protected int getStrength() {
        return 2;
    }

    @Override
    protected SlowEffect createStatusEffect() {
       return new SlowEffect((float) 0.5, 5);
    }

    @Override
    public void activate(Entity caller) {
        affectTiles(caller);
    } 
}

/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.AngularAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class ThunderAbility extends AngularAbility {
    
    @Override
    protected int getStrength() {
        return 3;
    }
    
    @Override
    protected int getAngle() {
        return 60;
    }

    @Override
    protected ParalyzeEffect createStatusEffect() {
       return new ParalyzeEffect(5);
    }

    @Override
    public void activate(Entity caller) {
        affectTiles(caller);
    }
}

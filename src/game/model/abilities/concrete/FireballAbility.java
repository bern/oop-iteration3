/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.Game;
import game.model.abilities.ProjectileAbility;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class FireballAbility extends ProjectileAbility {

    @Override
    protected FireballProjectile createProjectile() {
        return new FireballProjectile();
    }

    @Override
    public void activate(Entity caller) {
        FireballProjectile proj = createProjectile();
        //proj.setDirection(caller.getFacing());
        //proj.setLocation(caller.getLocation().mod(caller.getFacing()));
        //Game.getInstance().getActiveWorld().addProjectile(proj);
    }
    
}

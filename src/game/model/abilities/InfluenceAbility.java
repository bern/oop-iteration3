/*
 * Iteration three son!
 */
package game.model.abilities;

import game.Game;
import game.model.entity.Entity;
import game.model.game_world.GameWorld;
import game.util.Location;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class InfluenceAbility extends Ability {
    protected abstract int getStrength();
    protected abstract List<Location> getAffectedTiles(Entity caller);
    protected abstract StatusEffect createStatusEffect();
    protected void affectTiles(Entity caller) {
        for(Location l : getAffectedTiles(caller)) {
            GameWorld w = Game.getInstance().getActiveWorld();
            Entity entAt = w.getEntityAt(l);
            if(entAt != null) {
                StatusEffect ef = createStatusEffect();
                ef.setOwner(caller);
                ef.applyTo(entAt);
            }
        }
    }
}

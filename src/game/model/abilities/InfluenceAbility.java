/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;
import game.model.game_world.Tile;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class InfluenceAbility extends Ability {
    protected abstract int getStrength();
    protected abstract List<Tile> getAffectedTiles(Entity caller);
    protected abstract StatusEffect createStatusEffect();
    protected void affectTiles(Entity caller, StatusEffect ef) {
        for(Tile t : getAffectedTiles(caller)) {
            /*
            if(t.entityOn() != null) t.entityOn().applyEffect(ef);
            */
        }
    }
}

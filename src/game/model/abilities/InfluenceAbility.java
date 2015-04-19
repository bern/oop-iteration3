/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.game_world.Tile;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class InfluenceAbility extends Ability {
    protected abstract int getStrength();
    protected abstract List<Tile> getAffectedTiles();
    protected abstract StatusEffect createStatusEffect();
    protected void affectTiles() {
        for(Tile t : getAffectedTiles()) {
            /*
            if(t.entityOn() != null) t.entityOn().applyEffect(createStatusEffect());
            */
        }
    }
}

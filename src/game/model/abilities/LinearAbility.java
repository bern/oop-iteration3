/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;
import game.model.game_world.Tile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class LinearAbility extends InfluenceAbility {
    @Override
    protected List<Tile> getAffectedTiles(Entity center) {
        return new ArrayList<>();
    }
}

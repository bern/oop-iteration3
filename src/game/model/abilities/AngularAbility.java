/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;
import game.util.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class AngularAbility extends InfluenceAbility {
    @Override
    protected List<Location> getAffectedTiles(Entity center) {
        List<Location> list = new ArrayList<Location>();
        
        Location base = center.getLocation();
        
        if(getStrength() == 0) {
            list.add(base);
            return list;
        }
        
        for(int i = 0; i < getStrength(); i++) {
            Location newLoc = base;
            for(int j = 0; j <= i; j++) {
                newLoc = base.dir(center.getFacing());
            }
            list.add(newLoc);
        }
        
        list.remove(base);
        return list;
    }
    
    protected abstract int getAngle();
}

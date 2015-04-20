/*
 * Iteration three son!
 */
package game.model.abilities;

import game.Game;
import game.model.entity.Entity;
import game.model.game_world.Direction;
import game.util.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aidan
 */
public abstract class RadialAbility extends InfluenceAbility {
    @Override
    protected List<Location> getAffectedTiles(Entity center) {
        List<Location> list = new ArrayList<Location>();
        Location base = center.getLocation();
        list.add(base);
        
        if(getStrength() == 0) return list;
        
        for(int i = 0; i < getStrength(); i++) {
            for(Location l : list) {
                addAllDirs(l, list);
            }
        }
        
        list.remove(base);
        return list;
    }
    
    private boolean validLocation(Location l, List<Location> list) {
        if(l.getX() < 0 || l.getX() >= Game.getInstance().getActiveWorld().getWidth())  return false;
        if(l.getY() < 0 || l.getY() >= Game.getInstance().getActiveWorld().getLength())  return false;
        
        for(Location l2 : list) {
            if(l2.equals(l)) return false;
        }
        
        return true;
    }
    
    private void addAllDirs(Location l, List<Location> list) {
        Location test1 = l.dir(Direction.UP);
        Location test2 = l.dir(Direction.DOWN);
        Location test3 = l.dir(Direction.UPLEFT);
        Location test4 = l.dir(Direction.UPRIGHT);
        Location test5 = l.dir(Direction.DOWNLEFT);
        Location test6 = l.dir(Direction.DOWNRIGHT);
        
        if(validLocation(test1, list)) list.add(test1);
        if(validLocation(test2, list)) list.add(test2);
        if(validLocation(test3, list)) list.add(test3);
        if(validLocation(test4, list)) list.add(test4);
        if(validLocation(test5, list)) list.add(test5);
        if(validLocation(test6, list)) list.add(test6);
    }
}

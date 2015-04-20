/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;
import game.model.game_world.Direction;
import game.util.Location;

/**
 *
 * @author Aidan
 */
public abstract class Projectile {
    private Direction dir;
    private Location loc;
    private long movedLast;
    
    public Projectile(Direction dir, Location loc) {
        this.dir = dir;
        this.loc = loc;
        this.movedLast = System.currentTimeMillis();
    }
    
    public Projectile() {
        this.dir = Direction.UP;
        this.loc = new Location(0,0);
        this.movedLast = System.currentTimeMillis();
    }
    
    public abstract void onHit(Entity hit);
    public Direction getDirection() { return dir; }
    public void setDirection(Direction dir) { this.dir = dir; }
    public Location getLocation() { return loc; }
    public void setLocation(Location loc) { this.loc = loc; }
    public void modLocation() { loc = loc.dir(dir); }
    public boolean canMove() {
        if(System.currentTimeMillis() >= (movedLast + getSpeed())) {
            movedLast = System.currentTimeMillis() + getSpeed();
            return true;
        }
        
        return false;
    }
    protected abstract StatusEffect createStatusEffect();
    protected abstract long getSpeed();
}

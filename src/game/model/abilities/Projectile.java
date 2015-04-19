/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;
import game.model.game_world.Direction;

/**
 *
 * @author Aidan
 */
public abstract class Projectile {
    private Direction dir;
    private long movedLast;
    
    public Projectile(Direction dir) {
        this.dir = dir;
        this.movedLast = System.currentTimeMillis();
    }
    
    public Projectile() {
        this.dir = Direction.UP;
        this.movedLast = System.currentTimeMillis();
    }
    
    public abstract void onHit(Entity hit);
    public Direction getDirection() { return dir; }
    public void setDirection(Direction dir) { this.dir = dir; }
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

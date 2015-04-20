/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public abstract class TimedEffect extends StatusEffect {
    private long removeAt;
    private Entity appliedTo;
    
    public TimedEffect(Entity owner, long stickTime) {
        super(owner);
        removeAt = System.currentTimeMillis() + (stickTime * 1000);
    }
    
    public TimedEffect(long stickTime) {
        super();
        removeAt = System.currentTimeMillis() + (stickTime * 1000);
    }
    
    public TimedEffect() {
        super();
        removeAt = System.currentTimeMillis() + 1000;
    }
    
    public boolean removeEffect() {
        if(System.currentTimeMillis() <= removeAt) {
            reverseEffect();
            return true;
        }
        
        return false;
    }
    
    public abstract void reverseEffect();
    public abstract void reapply();
    
    public Entity getVictim() { return appliedTo; }
    public void setVictim(Entity appliedTo) { this.appliedTo = appliedTo; }
    public void setTime(long time) { removeAt = System.currentTimeMillis() + (time * 1000); }
}

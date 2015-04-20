/*
 * Iteration three son!
 */
package game.model.abilities;

import game.model.entity.Entity;

public abstract class StatusEffect {
    private Entity owner;
    
    public abstract void applyTo(Entity victim);
    //public abstract void applyTo(Trap victim);
    public Entity getOwner() { return owner; }
    public void setOwner(Entity owner) { this.owner = owner; }
    public StatusEffect(Entity owner) { this.owner = owner; }
    public StatusEffect() { owner =  null; }
}

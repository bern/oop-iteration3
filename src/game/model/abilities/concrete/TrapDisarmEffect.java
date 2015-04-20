/*
 * Iteration three son!
 */
package game.model.abilities.concrete;

import game.model.abilities.TimedEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class TrapDisarmEffect extends TimedEffect {
    
    //private Trap trapVictim;

    @Override
    public void applyTo(Entity victim) {
        //do nothing
    }
    
    /*
    public void applyTo(Trap t) {
        t.disarm();
        setTrapVictim(t);
    }
    */

    @Override
    public void reverseEffect() {
        //getTrapVictim().arm();
    }
    
    /*
    public void setTrapVictim(Trap t) { trapVictim = t; }
    public Trap getTrapVictim() { return trapVictim; }
    */

    @Override
    public void reapply() {
        //getTrapVictim().disarm();
    }
}

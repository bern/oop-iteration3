/*
 * Iteration three son!
 */
package game.model.abilities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aidan
 */
public class EffectBin {
    private List<TimedEffect> effects;
    
    public EffectBin() {
        effects = new ArrayList();
    }
    
    public void addEffect(TimedEffect e) { effects.add(e); }
    public void update() {
        boolean removedAny = false;
        for(int i = effects.size() - 1; i >= 0; i--) {
            if(effects.get(i).removeEffect()) {
                effects.remove(i);
                removedAny = true;
            }
        }
        if(removedAny) {
            reapplyEffects();
        }
    }
    
    public void reapplyEffects() {
        for(int i = effects.size() - 1; i >= 0; i--) {
            TimedEffect effect = effects.get(i);
            effect.reverseEffect();
            effect.applyTo(effect.getVictim());
        }
    }
    
    public void emptyBin() {
        for(int i = effects.size() - 1; i >= 0; i--) {
            effects.get(i).reverseEffect();
            effects.remove(i);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.model.abilities.concrete;

import game.model.abilities.StatusEffect;
import game.model.entity.Entity;

/**
 *
 * @author Aidan
 */
public class EmptyEffect extends StatusEffect {

    @Override
    public void applyTo(Entity victim) {
        //do literally nothing
    }
}

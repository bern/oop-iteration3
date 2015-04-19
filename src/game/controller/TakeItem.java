package game.controller;

import game.model.entity.Entity;
import game.model.item.TakeableItem;

import java.awt.event.ActionEvent;

/**
 * Created by parango on 4/19/15.
 */
public class TakeItem  extends GameAction{
    Entity entity;
    TakeableItem item;

    public TakeItem( Entity e, TakeableItem i) {
        this.entity = e;
        this.item = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // TODO doo item pick up! who gets to pick up items and who doesnt?
        //entity.pickUp(i);
    }
}

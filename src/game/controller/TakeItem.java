package game.controller;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.item.TakeableItem;

import java.awt.event.ActionEvent;

public class TakeItem  extends GameAction{
    Avatar avatar;
    TakeableItem item;

    public TakeItem( Avatar a, TakeableItem i) {
        this.avatar = a;
        this.item = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        avatar.addTakeable(item);
        //TODO: Remove item from the map.
    }
}

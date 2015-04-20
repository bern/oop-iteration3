package game.controller;

import game.Game;
import game.model.entity.Entity;
import game.model.item.OneShotItem;

import java.awt.event.ActionEvent;

public class OneShotAction extends GameAction {
    OneShotItem item;
    Entity entity;

    public OneShotAction(OneShotItem item, Entity entity) {
        this.item = item;
        this.entity = entity;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        item.performAction(entity);
    }
}

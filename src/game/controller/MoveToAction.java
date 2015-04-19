package game.controller;

import game.model.entity.Entity;
import game.util.Location;

import java.awt.event.ActionEvent;

/**
 * Created by parango on 4/19/15.
 */
public class MoveToAction extends GameAction{
    Entity entity;
    Location location;

    public MoveToAction( Entity e, Location l) {
        this.entity = e;
        this.location = l;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        entity.moveTo(location);
    }
}

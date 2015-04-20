package game.controller;

import game.model.entity.Entity;
import game.util.Location;

import java.awt.event.ActionEvent;


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

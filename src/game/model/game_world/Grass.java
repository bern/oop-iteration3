package game.model.game_world;


import game.controller.MoveToAction;
import game.model.behavior.Interactable;
import game.model.entity.Avataar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;
import game.util.Location;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Interactable e) {
        //TODO
        return null;
    }
}

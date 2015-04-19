package game.model.game_world;

import game.Game;
import game.model.MainModel;
import game.model.behavior.EntityInteractable;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;

public class GameWorld extends MainModel {

    Entity[][] entities;
    EntityInteractable[][] itemsAndAreaEffects;
    Terrain[][] terrains;

    Entity entity;

    public GameWorld(Game g, Terrain[][] t){
        super(g);

        terrains = t;
        entity = new Avatar(new Location(5,5));

    }

    public GameWorld(Game g){
        super(g);

        terrains = new Terrain[10][10];

        entity = new Avatar(new Location(5,5));

    }

    @Override
    public ActionMap updateValidActions() {

        return entity.interactWith( this );
    }

    public AbstractAction terrainBeInteractedToBy(Entity entity, Location location) {
        int x = location.getX();
        int y = location.getY();
        return entity.interactWith(terrains[y][x]);
    }

}

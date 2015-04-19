package game.model.game_world;

import game.Game;
import game.model.MainModel;
import game.model.behavior.AnimateInteractable;
import game.model.behavior.InanimateInteractable;
import game.model.entity.Avatar;
import game.model.entity.Entity;

import javax.swing.*;

public class GameWorld extends MainModel {

    AnimateInteractable[][] entities;
    InanimateInteractable[][] itemsAndAreaEffects;
    Terrain[][] terrains;

    Entity entity;

    public GameWorld(Game g, Terrain[][] t){
        super(g);

        terrains = t;
        entity = new Avatar(5,5);

    }

    public GameWorld(Game g){
        super(g);

        terrains = new Terrain[10][10];

        entity = new Avatar(5,5);

    }

    @Override
    public ActionMap updateValidActions() {
        return null;
    }
}

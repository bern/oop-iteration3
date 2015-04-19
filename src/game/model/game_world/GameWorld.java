package game.model.game_world;

import game.Game;
import game.model.MainModel;
import game.model.behavior.EntityInteractable;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;

public class GameWorld extends MainModel {

    private int length;
    private int width;

    private Entity[][] entities;
    private EntityInteractable[][] itemsAndAreaEffects;
    private Terrain[][] terrains;

    private Entity currentEntity;

    public GameWorld(Game g, Terrain[][] t, Entity e){
        super(g);
        setWidth(t[0].length);
        setLength(t.length);
        setCurrentEntity( e );
        setTerrains( t );
        itemsAndAreaEffects = new EntityInteractable[length][width];

    }

    @Override
    public ActionMap updateValidActions() {
        // entity look at the map around you! can you even move brah?! what can you with things around you?
        return currentEntity.interactWith( this );
    }

    public AbstractAction terrainBeInteractedToBy(Entity entity, Location location) {
        // entity interact with terrains... CAN YOU MOVE ON THEM?
        int x = location.getX();
        int y = location.getY();
        return entity.interactWith(terrains[y][x]);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Entity[][] getEntities() {
        return entities;
    }

    public void setEntities(Entity[][] entities) {
        this.entities = entities;
    }

    public EntityInteractable[][] getItemsAndAreaEffects() {
        return itemsAndAreaEffects;
    }

    public void setItemsAndAreaEffects(EntityInteractable[][] itemsAndAreaEffects) {
        this.itemsAndAreaEffects = itemsAndAreaEffects;
    }

    public Terrain[][] getTerrains() {
        return terrains;
    }

    public void setTerrains(Terrain[][] terrains) {
        this.terrains = terrains;
    }

    public Entity getCurrentEntity() {
        return currentEntity;
    }

    public void setCurrentEntity(Entity currentEntity) {
        this.currentEntity = currentEntity;
    }
}

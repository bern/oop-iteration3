package game.model.game_world;

import game.Game;
import game.controller.PauseGameAction;
import game.model.MainModel;
import game.model.abilities.EffectBin;
import game.model.abilities.Projectile;
import game.model.abilities.ProjectileBin;
import game.model.abilities.TimedEffect;
import game.model.behavior.EntityInteractable;
import game.model.entity.Entity;
import game.model.game_world.terrain.Terrain;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class GameWorld extends MainModel {

    private int length;
    private int width;

    private Entity[][] entities;
    private EntityInteractable[][] itemsAndAreaEffects;
    private Terrain[][] terrains;
    
    private ProjectileBin projectiles;
    private EffectBin effects;

    private Entity currentEntity;

    public GameWorld(Game g, Terrain[][] t, Entity e){
        super(g);
        setWidth(t[0].length);
        setLength(t.length);
        setCurrentEntity( e );
        setTerrains( t );
        itemsAndAreaEffects = new EntityInteractable[length][width];
        
        projectiles = new ProjectileBin();
        effects = new EffectBin();

    }
    
    public void addProjectile(Projectile p) {
        projectiles.addProjectile(p);
    }
    
    public void addEffect(TimedEffect ef) {
        effects.addEffect(ef);
    }
    
    public Entity getEntityAt(Location l) {
        return entities[l.getX()][l.getY()];
    }

    @Override
    public ActionMap updateValidActions() {
        // entity look at the map around you! can you even move brah?! what can you with things around you?
        ActionMap validActions = currentEntity.updateValidActions(this);
        validActions.put("pause", new PauseGameAction(getGame()));
        return validActions;
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




    
    public void prepareForDrawAt(Location l, GameWorldView gmw) {
    	Terrain t = terrains[l.getY()][l.getX()];
    	t.prepareForDraw(l, gmw);
    }

    public Action entitiesBeInteractedWithBy(Entity entity, Location location) {
        int x = location.getX();
        int y = location.getY();
        return entity.interactWith(terrains[y][x]);
    }

    public AbstractAction terrainBeInteractedWithBy(Entity entity, Location location) {
        // entity interact with terrains... CAN YOU MOVE ON THEM?
        int x = location.getX();
        int y = location.getY();
        return entity.interactWith(terrains[y][x]);
    }
}

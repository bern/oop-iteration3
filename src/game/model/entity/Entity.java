package game.model.entity;

import game.model.behavior.EntityInteractable;
import game.model.entity.occupation.DefaultOccupation;
import game.model.entity.occupation.Occupation;
import game.model.entity.stat.StatContainer;
import game.model.game_world.Direction;
import game.model.game_world.GameWorld;
import game.model.game_world.terrain.Terrain;
import game.util.Location;

import javax.swing.*;


public abstract class Entity implements EntityInteractable {
    private Location location;
    private Direction facing;
    private Occupation occupation;

    public Entity(Location l) {
        setLocation(l);
        setFacing(Direction.DOWN);
        occupation = new DefaultOccupation();
    }
    public Entity(Location l, Occupation o) {
        setLocation(l);
        setFacing(Direction.DOWN);
        occupation = o;
    }
    
    public void takeDamage(int dmg) {
        occupation.getStatContainer().modCurrentHealth(dmg * -1);
    }
    
    public void healDamage(int amt) {
        occupation.getStatContainer().modCurrentHealth(amt);
    }
    
    public void modifyHealth(int amt) {
        occupation.getStatContainer().modCurrentHealth(amt);
    }

    public void moveTo(Location l) {
        setLocation(l);
    }

    public ActionMap updateValidActions(GameWorld gw){
        ActionMap allowedActions = new ActionMap();
        // entity look around yourself!
        // interact with terrains... CAN YOU MOVE ON THEM?
        interactWithTerrainsHelper( allowedActions, gw);
        // interact with entities
        return allowedActions;
    }

    public AbstractAction beInteractedWithBy(EntityInteractable ei){
        return ei.beInteractedWithBy( this );
    }

    public AbstractAction interactWith(Terrain t){
        return t.beInteractedWithBy( this );
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Direction getFacing() {
        return facing;
    }

    public void setFacing(Direction facing) {
        this.facing = facing;
    }


    // *************************************
    // HELPERS FOR INTERACTION
    // *************************************


    // just making things simpler... rings of operation and such
    private void interactWithTerrainsHelper( ActionMap allowedActions, GameWorld gw){
        allowedActions.put(
                "N",

                gw.terrainBeInteractedWithBy(this, location.north()));
        allowedActions.put(
                "S",
                gw.terrainBeInteractedWithBy(this, location.south()));
        allowedActions.put(
                "SW",
                gw.terrainBeInteractedWithBy(this, location.southwest()));
        allowedActions.put(
                "SE",
                gw.terrainBeInteractedWithBy(this, location.southeast()));
        allowedActions.put(
                "NW",
                gw.terrainBeInteractedWithBy(this, location.northwest()));
        allowedActions.put(
                "NE",
                gw.terrainBeInteractedWithBy(this, location.northeast()));
    }

    public StatContainer getStatContainer() {
        return occupation.getStatContainer();
    }

    protected Occupation getOccupation() {
        return occupation;
    }
}

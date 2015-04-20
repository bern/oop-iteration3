package game.model.entity;

import game.model.behavior.EntityInteractable;
import game.model.entity.occupation.DefaultOccupation;
import game.model.entity.occupation.Occupation;
import game.model.entity.stat.StatContainer;
import game.model.game_world.Direction;
import game.model.game_world.GameWorld;
import game.model.game_world.terrain.Terrain;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;


public abstract class Entity implements EntityInteractable {
    private Location location;
    private Direction facing;
    private Occupation occupation;
    
    private boolean sneaking = false;
    private boolean afraid = false;
    private boolean invisible = false;
    private boolean pacified = false;
    private boolean paralyzed = false;

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
    
    public void setAfraid(boolean afraid) { this.afraid = afraid; }
    public boolean isAfraid() { return afraid; }
    
    public void setPacified(boolean pacified) { this.pacified = pacified; }
    public boolean isPacified() { return pacified; }
    
    public void setParalyzed(boolean paralyzed) { this.paralyzed = paralyzed; }
    public boolean isParalyzed() { return paralyzed; }
    
    public void setInvisible(boolean invisible) { this.invisible = invisible; }
    public boolean isInvisible() { return invisible; }
    
    public void toggleSneaking() { if(sneaking) { sneaking = false; } else { sneaking = true; } }
    public boolean isSneaking() { return sneaking; }
    
    public void modSpeed(int speed) {
        occupation.getStatContainer().setMovement(occupation.getStatContainer().getMovement() + speed);
    }
    
    public void modStrength(int str) {
        occupation.getStatContainer().setStrength(occupation.getStatContainer().getStrength() + str);
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

    public abstract void prepareForDraw( GameWorldView g);


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


    // just making things simpler... rings of operation and such
    private void interactWithEntitiesHelper( ActionMap allowedActions, GameWorld gw){

        allowedActions.put(
                "N",
                gw.entitiesBeInteractedWithBy(this, location.north()));
        allowedActions.put(
                "S",
                gw.entitiesBeInteractedWithBy(this, location.south()));
        allowedActions.put(
                "SW",
                gw.entitiesBeInteractedWithBy(this, location.southwest()));
        allowedActions.put(
                "SE",
                gw.entitiesBeInteractedWithBy(this, location.southeast()));
        allowedActions.put(
                "NW",
                gw.entitiesBeInteractedWithBy(this, location.northwest()));
        allowedActions.put(
                "NE",
                gw.entitiesBeInteractedWithBy(this, location.northeast()));
    }

    public StatContainer getStatContainer() {
        return occupation.getStatContainer();
    }

    protected Occupation getOccupation() {
        return occupation;
    }
}

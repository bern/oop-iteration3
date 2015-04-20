package game.model.entity;

import game.model.behavior.Interactable;
import game.model.game_world.GameWorld;
import game.util.Location;

import javax.swing.*;


public abstract class Entity implements Interactable {

    private Location location;
    private Location facing;

    public Entity(Location l) {
        setLocation(l);
        setFacing(l.south());
    }


    public void moveTo(Location l) {
        setLocation(l);
    }
    public final AbstractAction beInteractedWithBy(Interactable ei){
        return ei.beInteractedWithBy(this);
    }

    public ActionMap interactWith(GameWorld gw){
        ActionMap allowedActions = new ActionMap();

        // entity look around yourself!

        // interact with terrains... CAN YOU MOVE ON THEM?
        interactWithTerrainsHelper( allowedActions, gw);

        // interact with entities


        return allowedActions;
    }



    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getFacing() {
        return facing;
    }

    public void setFacing(Location facing) {
        this.facing = facing;
    }





    // *************************************
    // HELPERS FOR INTERACTION
    // *************************************


    // just making things simpler... rings of operation and such
    private void interactWithTerrainsHelper( ActionMap allowedActions, GameWorld gw){
        allowedActions.put(
                "N",

                gw.terrainBeInteractedToBy(this, location.north()));
        allowedActions.put(
                "S",
                gw.terrainBeInteractedToBy(this, location.south()));
        allowedActions.put(
                "SW",
                gw.terrainBeInteractedToBy(this, location.southwest()));
        allowedActions.put(
                "SE",
                gw.terrainBeInteractedToBy(this, location.southeast()));
        allowedActions.put(
                "NW",
                gw.terrainBeInteractedToBy(this, location.northwest()));
        allowedActions.put(
                "NE",
                gw.terrainBeInteractedToBy(this, location.northeast()));

    }


}

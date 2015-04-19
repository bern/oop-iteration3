package game.model.entity;

import game.model.behavior.AnimateInteractable;
import game.model.behavior.InanimateInteractable;
import game.model.game_world.Location;
import game.model.game_world.MapElement;

public abstract class Entity implements AnimateInteractable, MapElement {
    private Location location;

    public Entity(Location location){
        this.location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    public String interactWith( AnimateInteractable i){
        return i.interactWith( this );
    }
    public String interactWith( InanimateInteractable i){
        return i.interactWith( this );
    }
}

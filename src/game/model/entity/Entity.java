package game.model.entity;

import game.model.behavior.AnimateInteractable;
import game.model.behavior.InanimateInteractable;
import game.model.game_world.Location;
import game.model.game_world.MapElement;

public abstract class Entity extends MapElement implements AnimateInteractable {

    public Entity(Location location){
        super(location);
    }

    public String interactWith( AnimateInteractable i){
        return i.interactWith( this );
    }
    public String interactWith( InanimateInteractable i){
        return i.interactWith( this );
    }
}

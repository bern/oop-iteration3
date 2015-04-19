package game.model.entity;

import game.model.behavior.AnimateInteractable;
import game.model.behavior.InanimateInteractable;

public abstract class Entity implements AnimateInteractable {

    public Entity(){
        super();
    }

    public String interactWith( AnimateInteractable i){
        return i.interactWith( this );
    }
    public String interactWith( InanimateInteractable i){
        return i.interactWith( this );
    }
}

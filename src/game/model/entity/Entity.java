package game.model.entity;

import game.model.behavior.AnimateInteractable;
import game.model.behavior.InanimateInteractable;

public abstract class Entity implements AnimateInteractable {

    private int x, y;

    public Entity( int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String interactWith( AnimateInteractable i){
        return i.interactWith( this );
    }
    public String interactWith( InanimateInteractable i){
        return i.interactWith( this );
    }
}

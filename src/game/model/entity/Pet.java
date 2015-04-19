package game.model.entity;

import game.model.item.Item;

public abstract class Pet extends Entity {

    public Pet(int x, int y) {
        super();
    }

    public String interactWith( Avatar e ){
        return "Mount with Avatar";
    }

    public String interactWith( Entity e ){
        return "Mount with Entity";
    }

    public String interactWith( Mount m){
        return "Mount with Mount";
    }
    public String interactWith( Item i){
        return "Mount with Item";
    }
}

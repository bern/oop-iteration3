package game.model.entity;


import game.model.item.Item;

public class Mount extends Entity {


    public Mount() {
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

package game.model.entity;

import game.model.item.Item;

public class Avatar extends Entity {

    public Avatar() {
        super();
    }

    public String interactWith( Entity e ){
        return "Avatar with Entity";
    }

    public String interactWith( Avatar e ) {
        return "Avatar with Avatar";
    }

    public String interactWith( Mount m){
        return "Avatar with Mount";
    }
    public String interactWith( Item i){
        return "Avatar with Item";
    }


}

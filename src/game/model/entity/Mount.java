package game.model.entity;


import game.model.item.MapItem;

public class Mount extends Entity {


    public Mount(int x, int y) {
        super(x, y);
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
    public String interactWith( MapItem i){
        return "Mount with Item";
    }
}

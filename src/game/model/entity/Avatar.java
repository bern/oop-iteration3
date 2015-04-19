package game.model.entity;

import game.model.item.MapItem;

/**
 * Created by parango on 4/19/15.
 */
public class Avatar extends Entity {


    public Avatar(int x, int y) {
        super(x, y);
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
    public String interactWith( MapItem i){
        return "Avatar with Item";
    }


}

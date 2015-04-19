package game.model.entity;

import game.model.game_world.Location;
import game.model.item.Item;

public class Avatar extends Entity {

    public Avatar(int x, int y) {
        super(new Location(x, y));
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

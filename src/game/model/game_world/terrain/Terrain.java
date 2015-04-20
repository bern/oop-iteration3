package game.model.game_world.terrain;


import game.model.behavior.EntityInteractable;
import game.util.Location;
import game.view.GameWorldView;

public abstract class Terrain implements EntityInteractable {
    Location location;

    public Terrain(Location l){
        setLocation(l);
    }

    public void setLocation(Location l) {
        this.location = l;
    }

    public Location getLocation() {
        return location;
    }
    
    public void prepareForDraw(Location l, GameWorldView gmw) {
    }


}

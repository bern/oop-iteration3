package game.model.game_world;


import game.model.behavior.EntityInteractable;
import game.util.Location;

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
}

package game.model.game_world.terrain;


import game.model.behavior.Interactable;
import game.util.Location;

public abstract class Terrain implements Interactable {
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

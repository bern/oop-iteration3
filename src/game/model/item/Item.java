package game.model.item;


import game.model.behavior.Interactable;
import game.util.Location;

public abstract class Item implements Interactable {
    private Location location;
    public Item(Location l) {
        this.location = l;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

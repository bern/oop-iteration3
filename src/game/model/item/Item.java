package game.model.item;


import game.model.game_world.Location;
import game.model.game_world.MapElement;

public abstract class Item implements MapElement {
    private Location location;

    public Item(Location location) {
        location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}

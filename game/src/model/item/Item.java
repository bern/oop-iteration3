package model.item;

import model.map.Location;
import model.map.MapPlaceable;

public class Item implements MapPlaceable{
    Location location;
    String name;

    public Item(String name, Location location) {
        this.name = name;
        this.location = location;
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

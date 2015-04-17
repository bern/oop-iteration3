package model.item;

import model.entity.Entity;
import model.map.Location;

public class TakeableItem  extends Item {
    public TakeableItem(String name, Location location) {
        super(name, location);
    }

    void addTo(Entity entity) {

    }
}

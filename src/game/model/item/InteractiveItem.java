package game.model.item;

import game.model.game_world.Location;

public abstract class InteractiveItem extends Item {

    public InteractiveItem(Location location) {
        super(location);
    }
}

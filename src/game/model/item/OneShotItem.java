package game.model.item;

import game.model.game_world.Location;

public abstract class OneShotItem extends Item {
    public OneShotItem(Location location) {
        super(location);
    }
}

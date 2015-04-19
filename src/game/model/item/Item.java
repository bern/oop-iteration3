package game.model.item;


import game.model.behavior.InanimateInteractable;
import game.model.game_world.Location;
import game.model.game_world.MapElement;

public abstract class Item extends MapElement implements InanimateInteractable {
    private Location location;

    public Item(Location location) {
        super(location);
    }
}

package game.model.game_world;

/**
 * Interface for getting and setting location for thing on a map.
 * If location is null, then the element is not currently on the map itself.
 */
public class MapElement {
    Location location;

    public MapElement(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public void setLocation(int x, int y) {location = new Location(x,y);}
}

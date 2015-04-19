package game.model.game_world;

/**
 * Interface for getting and setting location for thing on a map.
 * If location is null, then the element is not currently on the map itself.
 */
public interface MapElement {
    Location getLocation();
    void setLocation(Location location);
}

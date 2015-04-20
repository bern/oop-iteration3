/*
 * Iteration three son!
 */
package game.model.game_world;

/**
 *
 * @author Aidan
 */
public enum Direction {
    UP(-1,-1),
    UPLEFT(0,-1),
    UPRIGHT(-1,0),
    DOWNLEFT(1,0),
    DOWNRIGHT(0,1),
    DOWN(1,1);
    private int x;
    private int y;
    private Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
}

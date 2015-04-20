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
    UPLEFT(-1,0),
    UPRIGHT(0,-1),
    DOWNLEFT(0,1),
    DOWNRIGHT(1,0),
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

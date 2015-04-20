package game.model.item;


public abstract class MapItem {
    private int x, y;

    public MapItem(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

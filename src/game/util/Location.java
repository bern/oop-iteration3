package game.util;

/**
 * Created by parango on 4/19/15.
 */
public class Location {

    private int x, y;

    public Location( int x, int y){
        this.x = x;
        this.y = y;
    }

    public Location north(){
        return new Location(getX()-1,getY()-1);
    }
    public Location south(){
        return new Location(getX()+1,getY()+1);
    }
    public Location southwest() {
        return new Location(getX()+1, getY());
    }
    public Location southeast() {
        return new Location(getX(), getY()+1);
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}


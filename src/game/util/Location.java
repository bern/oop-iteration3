package game.util;

import game.model.game_world.Direction;

public class Location {

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
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
    public Location northwest() {
        return new Location(getX(), getY() - 1);
    }
    public Location northeast() {
        return new Location(getX() - 1, getY());
    }
    public Location dir(Direction d) {
        return new Location(getX() + d.getX(), getY() + d.getY());
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public String toString() {
    	return "x: " + x + "y: " + y;
    }


    public Location[] all() {
        return new Location[]{
                northwest(),
                north(),
                northeast(),
                southwest(),
                south(),
                southeast()
        };

    }
}


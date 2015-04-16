package model.map;

public class Location {
	
	private int x;
	private int y;
	
	public Location () {
		x = 0;
		y = 0;
	}
	
	public Location (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
}

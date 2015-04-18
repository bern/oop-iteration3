package model.map;

import java.util.HashMap;

public abstract class Tile {

	protected HashMap<Integer, Tile> neighbors;
	
	public Tile() {
		neighbors = new HashMap<Integer, Tile>();
	}
	
	public HashMap<Integer, Tile> getNeighbors() {
		return neighbors;
	}
	
}

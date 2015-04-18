package model.map;

import java.util.HashSet;

import utility.Direction;

public class HexTile extends Tile {
	
	public HexTile () {
		super();
	}
	
	public HexTile getNeighbor(int direction) {
		return (HexTile)(neighbors.get(direction));
	}

	public void setProperties(HashSet<Integer> directions, Tile[][] map, int r, int c) {
		for(Integer i : directions) {
			neighbors.put(i, map[r+Direction.DR[i]][c+Direction.DC[i]]);
		}
	}
	
}
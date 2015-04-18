package model.map;

import java.util.HashSet;

import utility.Direction;

public class HexTile extends Tile {
	
	private int r;
	private int c;
	
	public HexTile () {
		super();
	}
	
	public HexTile getNeighbor(int direction) {
		return (HexTile)(neighbors.get(direction));
	}

	public void setProperties(HashSet<Integer> directions, Tile[][] map, int r, int c) {
		this.r = r;
		this.c = c;
		for(Integer i : directions) {
			neighbors.put(i, map[r+Direction.DR[i]][c+Direction.DC[i]]);
		}
	}
	
	public String toString() {
		String ret = "HexTile at ("+r+","+c+")";
		ret += "\n***************\nNeighbors are:";
		for(int d : neighbors.keySet()) {
			ret += "\n"+d;
		}
		ret += "\n***************";
		return ret;
		
	}
	
}
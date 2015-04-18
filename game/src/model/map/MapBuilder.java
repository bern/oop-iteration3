package model.map;

import java.util.HashSet;

import utility.Direction;

public class MapBuilder {

	public HexTile[][] constructMainMap () {
		
		HexTile[][] map = new HexTile[10][10];
		
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[r].length; c++) {
				map[r][c] = new HexTile();
			}
		}
		
		for(int r = 0; r < map.length; r++) {
			HashSet<Integer> directions = directionsToConsider();
			for(int c = 0; c < map[r].length; c++) {
				if(r == 0) {
					directions.remove(Direction.NORTHEAST);
					directions.remove(Direction.NORTH);
				}
				if(c == 0) {
					directions.remove(Direction.NORTHWEST);
					if(directions.contains(Direction.NORTH))
						directions.remove(Direction.NORTH);
				}
				if(r == (map.length-1)) {
					directions.remove(Direction.SOUTHWEST);
					directions.remove(Direction.SOUTH);
				}
				if(c == (map[r].length-1)) {
					directions.remove(Direction.SOUTHEAST);
					if(directions.contains(Direction.SOUTH))
						directions.remove(Direction.SOUTH);
				}
				map[r][c].setProperties(directions, map, r, c);
			}
		}
		
		return map;
	}
	
	public HashSet<Integer> directionsToConsider() {
		HashSet<Integer> dset = new HashSet<Integer>();
		
		dset.add(Direction.NORTH);
		dset.add(Direction.NORTHEAST);
		dset.add(Direction.NORTHWEST);
		dset.add(Direction.SOUTH);
		dset.add(Direction.SOUTHEAST);
		dset.add(Direction.SOUTHWEST);
		
		return dset;
	}

}
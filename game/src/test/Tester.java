package test;

import model.map.HexTile;
import model.map.MapBuilder;

public class Tester {

	public static void main(String[] args) {
		MapBuilder mb = new MapBuilder();
		HexTile[][] map = mb.constructMainMap();
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map[r].length; c++) {
				System.out.println(map[r][c].toString());
			}
		}
	}
	
}

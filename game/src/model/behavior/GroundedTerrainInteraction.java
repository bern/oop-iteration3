package model.behavior;

import javax.swing.Action;

import model.map.*;

public class GroundedTerrainInteraction extends TerrainInteraction {
	
	public GroundedTerrainInteraction () {};
	
	public Action interactWith(Mountain m) {
		//return new NullAction();
		return null;
	}
	
	public Action interactWith(Water w) {
		//return new NullAction();
		return null;
	}
	
	public Action interactWith(River r) {
		//work with river to move avatar
		return null;
	}
	
	public Action interactWith(Terrain t) {
		//return new MoveAction();
		return null;
	}

}

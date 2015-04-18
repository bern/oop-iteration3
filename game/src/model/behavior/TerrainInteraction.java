package model.behavior;

import javax.swing.Action;

import model.map.Terrain;

public abstract class TerrainInteraction {
	public abstract Action interactWith(Terrain t);
}

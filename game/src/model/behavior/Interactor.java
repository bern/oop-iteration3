package model.behavior;

import javax.swing.Action;

import model.entity.Entity;
import model.item.Item;
import model.map.AreaEffect;
import model.map.Location;
import model.map.Terrain;

/*
 * Defines the Interactor interface
 * Attach this interface to anything that will be moving and triggering interactions
 * Good examples of Interactors include Entities, Projectiles, etc.
 */

public interface Interactor {

	public Action handleInteractionWith (Terrain t);
	
	public Action handleInteractionWith (Item i);
	
	public Action handleInteractionWith (AreaEffect ae);
	
	public Action handleInteractionWith (Entity e);
	
}

package model.behavior;

import model.map.Location;

/*
 * Defines the Interactor interface
 * Attach this interface to anything that will be moving and triggering interactions
 * Good examples of Interactors include Entities, Projectiles, etc.
 */

public interface Interactor {

	public void attemptInteractionWith (Location loc);
	
}

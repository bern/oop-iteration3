package model.behavior;

/*
 * Defines the Interactable interface
 * Attach this interface to anything that will contain a behavior
 * Interactables are triggered by Interactors and the INTERACTOR performs a behavior on the INTERACTOR
 */

public interface Interactable {
	
	public void interactWith (Interactor a);
	
}

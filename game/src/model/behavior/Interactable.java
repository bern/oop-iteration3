package model.behavior;

import javax.swing.Action;

/*
 * Defines the Interactable interface
 * Attach this interface to anything that will contain a behavior
 * Interactables are triggered by Interactors and the INTERACTOR performs a behavior on the INTERACTOR
 */

public interface Interactable {
	
	public Action interactWith (Interactor a);
	
}

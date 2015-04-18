package model.behavior;

import javax.swing.Action;

import model.map.*;

public abstract class AreaEffectInteraction {
	public abstract Action interactWith(AreaEffect ae);
}

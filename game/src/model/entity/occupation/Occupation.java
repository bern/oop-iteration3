package model.entity.occupation;

import model.item.Armory;
import model.item.Equipment;
import model.stat.StatContainer;

public abstract class Occupation {
	protected StatContainer statContainer;
	private Armory armory;

	public StatContainer getStatContainer () {
		return statContainer;
	}

	public void equip(Equipment item) {
		//TODO
	}
}

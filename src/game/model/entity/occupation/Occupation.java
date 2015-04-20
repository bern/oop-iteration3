package game.model.entity.occupation;


import game.model.entity.Armory;
import game.model.entity.stat.StatContainer;

public abstract class Occupation {
	protected StatContainer statContainer;
	private Armory armory;

	public Occupation() {
		armory = new Armory();
	}

	public Armory getArmory() {
		return armory;
	}

	public StatContainer getStatContainer () {
		return statContainer;
	}

}

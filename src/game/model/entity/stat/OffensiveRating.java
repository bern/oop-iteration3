package game.model.entity.stat;

import game.model.entity.Armory;

public class OffensiveRating extends DerivedStat {
	public OffensiveRating() {
		super();
	}

	public void update (StatContainer sc) {
		value = sc.getStrength() * sc.getLevel() + sc.getArmory().getWeaponRating();
	}

}

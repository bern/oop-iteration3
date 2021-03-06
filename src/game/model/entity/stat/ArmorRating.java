package game.model.entity.stat;

import game.model.entity.Armory;

public class ArmorRating extends DerivedStat {
	public ArmorRating() {
		super();
	}
	
	//TODO:
	//we need to make ArmorRating be based on equipped armor as well
	//how can we do this? should we have the entity pass in itself to its statcontainer?
	public void update (StatContainer sc) {
		value = sc.getHardiness() + sc.getArmory().getArmorRating();
	}
}

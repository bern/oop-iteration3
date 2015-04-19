package game.model.entity.stat;

public class OffensiveRating extends DerivedStat {
	
	public OffensiveRating () {
		super();
	}
	
	//TODO:
	//we need to make OffensiveRating be based on equipped weapon as well
	//how can we do this? should we have the entity pass in itself to its statcontainer?
	public void update (StatContainer sc) {
		value = sc.getStrength() * sc.getLevel();
	}

}

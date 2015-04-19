package game.model.entity.stat;

public class DefensiveRating extends DerivedStat {
	
	public DefensiveRating () {
		super();
	}
	
	public void update (StatContainer sc) {
		value = sc.getAgility() * sc.getLevel();
	}

}

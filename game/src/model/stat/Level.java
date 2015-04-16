package model.stat;

public class Level extends DerivedStat {

	private final int LEVELUP_AMOUNT = 500;
	
	public void update (StatContainer sc) {
		value = sc.getExperience() / LEVELUP_AMOUNT;
	}
	
}

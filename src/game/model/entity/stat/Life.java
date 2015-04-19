package game.model.entity.stat;

public class Life extends DerivedStat {
	
	public Life () {
		super();
	}

	public void update (StatContainer sc) {
		value = sc.getHardiness() * sc.getLevel();
	}
	
}

package game.model.entity.stat;

public class Mana extends DerivedStat {

	public Mana () {
		super();
	}
	
	public void update (StatContainer sc) {
		value = sc.getIntellect() * sc.getLevel();
	}
	
}

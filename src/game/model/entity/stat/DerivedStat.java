package game.model.entity.stat;

public abstract class DerivedStat extends Stat {

	public abstract void update (StatContainer sc);
	
	public DerivedStat () {
		super();
	}
	
}

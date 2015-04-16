package model.stat;

public class StatContainer {

	private PrimaryStat LivesLeft;
	private PrimaryStat Strength;
	private PrimaryStat Agility;
	private PrimaryStat Intellect;
	private PrimaryStat Hardiness;
	private PrimaryStat Experience;
	private PrimaryStat Movement;
	
	public StatContainer () {
		LivesLeft = new PrimaryStat();
		Strength = new PrimaryStat();
		Agility = new PrimaryStat();
		Intellect = new PrimaryStat();
		Hardiness = new PrimaryStat();
		Experience = new PrimaryStat();
		Movement = new PrimaryStat();
	}
	
	public int getLivesLeft () {
		return LivesLeft.getValue();
	}
	
	public int getStrength () {
		return Strength.getValue();
	}
	
	public int getAgility () {
		return Agility.getValue();
	}
	
	public int getIntellect () {
		return Intellect.getValue();
	}
	
	public int getHardiness () {
		return Hardiness.getValue();
	}
	
	public int getExperience () {
		return Experience.getValue();
	}
	
	public int getMovement () {
		return Movement.getValue();
	}
}

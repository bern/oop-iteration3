package model.stat;

public class StatContainer {

	private PrimaryStat livesLeft;
	private PrimaryStat strength;
	private PrimaryStat agility;
	private PrimaryStat intellect;
	private PrimaryStat hardiness;
	private PrimaryStat experience;
	private PrimaryStat movement;
	
	private DerivedStat level;
	private DerivedStat life;
	private DerivedStat mana;
	private DerivedStat offensiveRating;
	private DerivedStat defensiveRating;
	private DerivedStat armorRating;
	
	public StatContainer () {
		livesLeft = new PrimaryStat();
		strength = new PrimaryStat();
		agility = new PrimaryStat();
		intellect = new PrimaryStat();
		hardiness = new PrimaryStat();
		experience = new PrimaryStat();
		movement = new PrimaryStat();
		
		level = new Level();
		life = new Life();
		mana = new Mana();
		offensiveRating = new OffensiveRating();
		defensiveRating = new DefensiveRating();
		armorRating = new ArmorRating();
		
		updateAllDerived();
	}
	
	public int getLivesLeft () {
		return livesLeft.getValue();
	}
	
	public int getStrength () {
		return strength.getValue();
	}
	
	public int getAgility () {
		return agility.getValue();
	}
	
	public int getIntellect () {
		return intellect.getValue();
	}
	
	public int getHardiness () {
		return hardiness.getValue();
	}
	
	public int getExperience () {
		return experience.getValue();
	}
	
	public int getMovement () {
		return movement.getValue();
	}
	
	public int getLevel () {
		return level.getValue();
	}
	
	public int getLife () {
		return life.getValue();
	}
	
	public int getMana () {
		return mana.getValue();
	}
	
	public int getOffensiveRating () {
		return offensiveRating.getValue();
	}
	
	public int getDefensiveRating () {
		return defensiveRating.getValue();
	}
	
	public int getArmorRating () {
		return armorRating.getValue();
	}
	
	public void setLivesLeft (int value) {
		livesLeft.setValue(value);
	}
	
	public void setStrength (int value) {
		strength.setValue(value);
		offensiveRating.update(this);
	}
	
	public void setAgility (int value) {
		agility.setValue(value);
		defensiveRating.update(this);
	}
	
	public void setIntellect (int value) {
		intellect.setValue(value);
		mana.update(this);
	}
	
	public void setHardiness (int value) {
		hardiness.setValue(value);
		life.update(this);
	}
	
	public void setExperience (int value) {
		experience.setValue(value);
		level.update(this);
	}
	
	public void setMovement (int value) {
		movement.setValue(value);
	}
	
	public void updateAllDerived () {
		level.update(this);
		life.update(this);
		mana.update(this);
		offensiveRating.update(this);
		defensiveRating.update(this);
		armorRating.update(this);
	}
}

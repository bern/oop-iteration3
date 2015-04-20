package game.model.entity.stat;

import game.model.entity.Armory;

public class StatContainer {

	private PrimaryStat livesLeft;
	private PrimaryStat strength;
	private PrimaryStat agility;
	private PrimaryStat intellect;
	private PrimaryStat hardiness;
	private PrimaryStat experience;
	private PrimaryStat movement;
        
        private int currentHealth;
        private int currentMana;
	
	private DerivedStat level;
	private DerivedStat life;
	private DerivedStat mana;
	private DerivedStat offensiveRating;
	private DerivedStat defensiveRating;
	private DerivedStat armorRating;

	private Armory armory;
	
	public StatContainer (Armory armory) {
		this.armory = armory;

		livesLeft = new PrimaryStat();
		strength = new PrimaryStat();
		agility = new PrimaryStat();
		intellect = new PrimaryStat();
		hardiness = new PrimaryStat();
		experience = new PrimaryStat();
		movement = new PrimaryStat();
                
		currentHealth = 0;
		currentMana = 0;
		
		level = new Level();
		life = new Life();
		mana = new Mana();
		offensiveRating = new OffensiveRating();
		defensiveRating = new DefensiveRating();
		armorRating = new ArmorRating();
		
		updateAllDerived();
	}

	public Armory getArmory() {
		return armory;
	}
        
	public int getCurrentHealth() {
			return currentHealth;
	}

	public int getCurrentMana() {
			return currentMana;
	}

	public void modCurrentHealth(int mod) {
		int newHealth = currentHealth + mod;

		if(newHealth < 0) newHealth = 0;
		if(newHealth > getLife()) newHealth = getLife();
		currentHealth = newHealth;
	}

	public void modCurrentMana(int mod) {
		int newMana = currentMana + mod;

		if(newMana< 0) newMana = 0;
		if(newMana > getLife()) newMana = getMana();
		currentMana = newMana;
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
                currentMana = Math.min(currentMana, getMana());
	}
	
	public void setHardiness (int value) {
		hardiness.setValue(value);
		life.update(this);
                currentHealth = Math.min(currentHealth, getLife());
	}
	
	public void setExperience (int value) {
		experience.setValue(value);
		level.update(this);
                currentMana = Math.min(currentMana, getMana());
                currentHealth = Math.min(currentHealth, getLife());
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
		currentMana = Math.min(currentMana, getMana());
        currentHealth = Math.min(currentHealth, getLife());
	}
}

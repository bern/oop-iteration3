package game.model.entity.occupation;


import game.model.entity.stat.StatContainer;

public class CharacterOccupation extends Occupation {
	
	public CharacterOccupation () {
		super();
		statContainer = new StatContainer(getArmory());
		
		statContainer.setLivesLeft(3);
		statContainer.setStrength(10);
		statContainer.setAgility(10);
		statContainer.setIntellect(10);
		statContainer.setHardiness(10);
		statContainer.setExperience(10);
		statContainer.setMovement(10);
	}

	public int getDectionRating() {
		return statContainer.getAgility() * statContainer.getLevel();
	}

}

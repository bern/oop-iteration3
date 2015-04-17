package model.entity.occupation;

import model.stat.StatContainer;

public class CharacterOccupation extends Occupation {
	
	public CharacterOccupation () {
		statContainer = new StatContainer();
		
		statContainer.setLivesLeft(3);
		statContainer.setStrength(10);
		statContainer.setAgility(10);
		statContainer.setIntellect(10);
		statContainer.setHardiness(10);
		statContainer.setExperience(10);
		statContainer.setMovement(10);
	}

}

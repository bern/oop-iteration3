package model.occupation;

import model.skill.BargainSkill;
import model.skill.BindWoundSkill;
import model.skill.ObservationSkill;
import model.stat.StatContainer;

public class CharacterOccupation extends Occupation {
	
	BargainSkill bargainSkill;
	BindWoundSkill bindWoundSkill;
	ObservationSkill observationSkill;
	
	public CharacterOccupation () {
		statContainer = new StatContainer();
		
		statContainer.setLivesLeft(3);
		statContainer.setStrength(10);
		statContainer.setAgility(10);
		statContainer.setIntellect(10);
		statContainer.setHardiness(10);
		statContainer.setExperience(10);
		statContainer.setMovement(10);
		
		bargainSkill = new BargainSkill();
		bindWoundSkill = new BindWoundSkill();
		observationSkill = new ObservationSkill();
	}

}

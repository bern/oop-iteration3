/*
 * Iteration three son!
 */
package game.model.entity.occupation;

import game.model.entity.stat.StatContainer;

/**
 *
 * @author Aidan
 */
public class MountOccupation extends Occupation {
    public MountOccupation () {
		super();
		statContainer = new StatContainer(getArmory());
		
		statContainer.setLivesLeft(1);
		statContainer.setStrength(10);
		statContainer.setAgility(10);
		statContainer.setIntellect(10);
		statContainer.setHardiness(10);
		statContainer.setExperience(10);
		statContainer.setMovement(10);
	}
}

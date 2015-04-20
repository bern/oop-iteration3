/*
 * Iteration three son!
 */
package game.model.entity.occupation;

import game.model.entity.stat.StatContainer;

/**
 *
 * @author Aidan
 */
public class DefaultOccupation extends Occupation {
    public DefaultOccupation () {
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
}

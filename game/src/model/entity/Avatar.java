package model.entity;

import model.entity.occupation.CharacterOccupation;
import model.map.Location;
import model.behavior.*;

public class Avatar extends Entity {
	
    public Avatar(Location location, CharacterOccupation occupation) {
        super(location, occupation);
        behavior = new Behavior(new UniversalEntityInteraction(), new UniversalItemInteraction(), new UniversalAreaEffectInteraction(), new GroundedTerrainInteraction());
    }

}

package model.entity;

import model.entity.occupation.CharacterOccupation;
import model.map.Location;

public class Avatar extends Entity {
	
    public Avatar(Location location, CharacterOccupation occupation) {
        super(location, occupation);
    }
    
}

package model.entity;

import model.entity.occupation.CharacterOccupation;
import model.map.Location;

public class Avatar extends Entity {

    public Avatar(Location location, CharacterOccupation occupation) {
        super(location, occupation);
    }

    public void OnTalkKey() {
        throw new RuntimeException("Unimplemented method.");
    }

    public void onShopKey() {
        throw new RuntimeException("Unimplemented method");
    }
}

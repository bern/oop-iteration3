package game.model.item;

import game.model.entity.Entity;
import game.util.Location;

public class ModifyHealthItem extends OneShotItem {
    int health;

    public ModifyHealthItem(Location l, int health) {
        super(l);
        this.health = health;
    }

    @Override
    public void performAction(Entity i) {
        i.modifyHealth(health);
    }
}

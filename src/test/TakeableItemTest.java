package test;

import game.model.behavior.Interactable;
import game.model.entity.Avatar;
import game.model.item.Equipment;
import game.model.item.Item;
import game.model.item.TakeableItem;
import game.util.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class TakeableItemTest {

    @Test
    public void testInteractWith() throws Exception {
        Avatar avatar = new Avatar(new Location(0,0));
        Interactable item = new Equipment(new Location(0,0));

        avatar.interactWith(item);
    }
}
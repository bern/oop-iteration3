package model.behavior;

import model.entity.Avatar;
import model.entity.Entity;
import model.item.Item;
import model.item.TakeableItem;

public class TestItemInteraction {
	public static void main(String[] args){ 
		
		Entity a = new Avatar(null,null);
		Item i = new TakeableItem("poison",null);
		
		a.handleInteractionWith(i);
		
	}
}

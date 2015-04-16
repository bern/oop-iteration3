package models.items;

import java.util.ArrayList;

/*
 * inventory class, in charge of keeping track of equiping takeable items.
 * *****not finished******
 */
public class Inventory {
	Armory armory;
	ArrayList<TakeableItem> items;
	
	public Inventory() {
		
	}
	
	public boolean addItem(TakeableItem item) {
		items.add(item);
		return true;
	}
	
	public boolean removeItem(TakeableItem item) {
		
		if (items.contains(item)) {
			items.remove(item);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean equipItem(TakeableItem item) {
		return true;
	}
	
	public ArrayList<TakeableItem> getItems() {
		return items;
	}
}

package model.item;

import java.util.ArrayList;

/*
 * inventory class, in charge of keeping track of equiping takeable items.
 * *****not finished******
 */
public class Inventory {
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
	
	public ArrayList<TakeableItem> getItems() {
		return items;
	}
}

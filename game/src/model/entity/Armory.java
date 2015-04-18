package model.entity;

import java.util.ArrayList;

import model.item.TakeableItem;

public class Armory {
	private ArrayList<TakeableItem> items;
	
	public static final int MAX_SIZE = 6;
	
	
	public Armory() {
		items = new ArrayList<TakeableItem>();
	}
	
	
	public boolean useItem(TakeableItem item) {
		return true;
	}
	
	public boolean equipItem(TakeableItem item) {
		items.add(item);
		return true;
	}
	
	public boolean unEquipItem(TakeableItem item) {
		if (items.contains(item)) {
			items.remove(item);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean hasItem(TakeableItem item) {
		return items.contains(item);
	}
	
	public ArrayList<TakeableItem> getItems() {
		return items;
	}
}

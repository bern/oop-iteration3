package model.entity;

import java.util.ArrayList;
import java.util.List;

import model.item.TakeableItem;


public class Inventory {
	
	private ArrayList<TakeableItem> items;
	
	public Inventory() {
		items = new ArrayList<TakeableItem>();
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
	
	public boolean hasItem(TakeableItem item) {
		return items.contains(item);
	}
	
	public ArrayList<TakeableItem> getItems() {
		return items;
	}
	

}

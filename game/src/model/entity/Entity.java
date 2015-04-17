package model.entity;

import model.entity.occupation.Occupation;
import model.item.Armory;
import model.item.Inventory;
import model.item.TakeableItem;
import model.map.Location;
import model.map.MapPlaceable;

public class Entity implements MapPlaceable {
	Location location;
	Occupation occupation;
	Inventory inventory;
	
	public Entity(Location location, Occupation occupation) {
		this.location = location;
		this.occupation = occupation;
	}
	
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;
	}

	public Occupation getOccupation() {
		return occupation;
	}
	
	public void getLocation(Location location) {
		this.location = location;
	}
	
	public void getOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public void addIteam(TakeableItem item) {
		inventory.addItem(item);
	}
}

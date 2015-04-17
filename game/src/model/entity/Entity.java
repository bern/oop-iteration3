package model.entity;

import model.item.Inventory;
import model.map.Location;
import model.occupation.*;

public class Entity {
	Location location;
	Occupation occupation;
	Inventory inventory;
	
	public Entity () {
		location = new Location();
		occupation = new Smasher();
	}
	
	public Entity(Occupation occupation) {
		this.occupation = occupation;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Occupation getOccupation() {
		return occupation;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
}

package model.entities;

import model.map.Location;

public class Entity {
	Location location;
	Occupation occupation;
	
	public Entity(Location location) {
		
	}
	
	public Location getLocation() {
		return location;
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
}

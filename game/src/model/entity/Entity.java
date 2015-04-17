package model.entity;

import model.map.Location;
import model.occupation.Occupation;

public class Entity {
	Location location;
	Occupation occupation;
	
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

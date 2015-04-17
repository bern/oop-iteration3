package model.entity;

<<<<<<< HEAD
import model.item.Inventory;
import model.map.Location;
import model.occupation.*;
=======
import model.entity.occupation.Occupation;
import model.item.Inventory;
import model.item.TakeableItem;
import model.map.Location;
import model.map.MapPlaceable;
>>>>>>> 9a39a32fb0883f0f61a723f6d2a9722dd040e09e

public class Entity implements MapPlaceable {
	Location location;
<<<<<<< HEAD
	Occupation occupation;
	Inventory inventory;
	
	public Entity () {
		location = new Location();
		occupation = new Smasher();
	}
	
	public Entity(Occupation occupation) {
=======
	model.entity.occupation.Occupation occupation;
	Inventory inventory;

	public Entity(Location location, Occupation occupation) {
		this.location = location;
>>>>>>> 9a39a32fb0883f0f61a723f6d2a9722dd040e09e
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
	
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public void addIteam(TakeableItem item) {
		inventory.addItem(item);
	}
}

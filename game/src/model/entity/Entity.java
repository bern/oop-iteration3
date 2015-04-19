package model.entity;

import javax.swing.Action;

import model.behavior.*;
import model.entity.occupation.*;
import model.item.Item;
import model.item.TakeableItem;
import model.map.AreaEffect;
import model.map.Location;
import model.map.MapPlaceable;
import model.map.Terrain;
import model.stat.StatContainer;

public abstract class Entity implements MapPlaceable, Interactable, Interactor {
	protected Location location;
	protected Occupation occupation;
	protected Inventory inventory;
	protected Behavior behavior;
	
	public Entity () {
		location = new Location(0,0);
		occupation = new Smasher();
	}
	
	public Entity(Location location, Occupation occupation) {
		this.location = location;
		this.occupation = occupation;
	}
	
	public Location getLocation() {
		return location;
	}

	public StatContainer getStatContainer() {
		return occupation.getStatContainer();
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

	public void addItem(TakeableItem item) {
		inventory.addItem(item);
	}
	
	//interactable stub
	public Action interactWith(Interactor a) {
		return a.handleInteractionWith(this);
	}
	
	//rule
	//interactor stub
	public Action handleInteractionWith(Item i) {
		return behavior.interactWith(i);
	}
	
	public Action handleInteractionWith(AreaEffect ae) {
		return behavior.interactWith(ae);
	}
	
	public Action handleInteractionWith(Terrain t) {
		return behavior.interactWith(t);
	}
	
	public Action handleInteractionWith(Entity e) {
		return behavior.interactWith(e);
	}
}

package model.entities;

import model.stats.StatContainer;

public abstract class Occupation {
	StatContainer statContainer;
	
	public StatContainer getStatContainer() {
		return statContainer;
	}
	
	public void takeDamage(int damage) {
		
	}
	
	public void shop() {
		
	}
}

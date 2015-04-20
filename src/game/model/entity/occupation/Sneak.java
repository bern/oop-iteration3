package game.model.entity.occupation;

public class Sneak extends CharacterOccupation {

	public Sneak () {
		super();
		
		statContainer.setAgility(20);
	}

	@Override
	public int getDectionRating() {
		return super.getDectionRating();	//TODO: work in the sneak detection ability into this.
	}
}

package game.model.game_world;

import game.util.Location;
import game.view.GameWorldView;

import java.awt.image.BufferedImage;

public interface Drawable {

	//public BufferedImage getDrawable();
	public void prepareForDraw(Location l, GameWorldView gmw);
	
}

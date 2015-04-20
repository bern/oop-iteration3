package game.model.game_world.terrain;


import java.awt.Graphics2D;

import game.model.behavior.Interactor;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }

    @Override
    public String toString(){
        return "Grass";
    }
    
    @Override
    public void prepareForDraw(Location l, GameWorldView gmw) {
    	gmw.drawGameObject(this, l);
    }
}

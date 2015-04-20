package game.model.game_world.terrain;


import game.model.behavior.Interactor;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class River  extends Terrain{
    public River(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Interactor i) {
        return null;
    }

    @Override
    public String toString(){
        return "River";
    }
    
    @Override
    public void prepareForDraw(Location l, GameWorldView gmw) {
    	gmw.drawGameObject(this, l);
    }

}

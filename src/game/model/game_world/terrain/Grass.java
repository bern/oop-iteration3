package game.model.game_world.terrain;



import game.controller.MoveToAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class Grass extends Terrain {

    public Grass(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        System.out.println(getLocation().getX()+" " +getLocation().getY());
        return new MoveToAction(i , getLocation());
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new MoveToAction(a , getLocation());
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

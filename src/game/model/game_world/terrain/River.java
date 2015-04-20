package game.model.game_world.terrain;

import game.controller.MoveToAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class River  extends Terrain{
    public River(Location l) {
        super(l);
    }


    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new MoveToAction(i , getLocation().southwest());

    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {

        return new  MoveToAction(a , getLocation().southwest().southwest());
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

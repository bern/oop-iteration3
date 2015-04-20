package game.model.entity;

import game.controller.DenyMoveAction;
import game.model.behavior.EntityInteractable;
import game.model.entity.occupation.CharacterOccupation;
import game.model.game_world.terrain.Terrain;
import game.model.item.TakeableItem;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class Avatar extends Entity {

    public Avatar(Location l, CharacterOccupation occupation) {
        super(l, occupation);
    }

    //Add Item to inventory
    public void addTakeable(TakeableItem item) {
        //TODO.
    }

    /** Return the rating it has for detecting things (traps)*/
    public int getDetectingRating() {
        return ((CharacterOccupation)getOccupation()).getDectionRating();
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new DenyMoveAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new DenyMoveAction();
    }



    @Override
    protected CharacterOccupation getOccupation() {
        return (CharacterOccupation)super.getOccupation();
    }

    @Override
    public void prepareForDraw(GameWorldView g) {
        g.drawGameObject( this );
    }

    @Override
    public AbstractAction beInteractedWithBy(EntityInteractable ei){
        return ei.beInteractedWithBy( this );
    }
    @Override
    public AbstractAction interactWith(Terrain t){
        return t.beInteractedWithBy( this );
    }


}

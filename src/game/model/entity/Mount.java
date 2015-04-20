package game.model.entity;


import game.controller.MountAction;
import game.model.behavior.EntityInteractable;
import game.model.game_world.terrain.Terrain;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;

public class Mount extends Entity {

    Avatar mountedAvatar;

    public Mount(Location l) {
        super(l);
    }

    public void mount(Avatar avatar) {
        setMountedAvatar(avatar);
    }

    public Avatar getMountedAvatar() {
        return mountedAvatar;
    }

    public void setMountedAvatar(Avatar mountedAvatar) {
        this.mountedAvatar = mountedAvatar;
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return new MountAction(a, this);
    }

    @Override
    public AbstractAction beInteractedWithBy(EntityInteractable ei){
        return ei.beInteractedWithBy( this );
    }
    @Override
    public AbstractAction interactWith(Terrain t){
        return t.beInteractedWithBy( this );
    }



    @Override
    public void prepareForDraw(GameWorldView g) {
        g.drawGameObject( this );
    }
}

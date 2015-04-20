package game.model.entity;


import game.model.behavior.Interactable;
import game.model.behavior.Interactor;
import game.util.Location;

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
    public AbstractAction interactWith(Interactable e) {
        return e.beInteractedWithBy( this );
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return null;
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return null;
    }
}

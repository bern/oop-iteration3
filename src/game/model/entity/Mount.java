package game.model.entity;


<<<<<<< Updated upstream
import game.model.item.Item;
=======
import game.util.Location;

import javax.swing.*;
>>>>>>> Stashed changes

public class Mount extends Entity {

    Avatar mountedAvatar;

    public Mount(Location l) {
        super(l);
    }

    @Override
    public AbstractAction interactWith(Entity e) {
        return null;
    }

    @Override
    public AbstractAction interactWith(Mount m) {
        return null;
    }

<<<<<<< Updated upstream
    public Mount() {
        super();
=======
    @Override
    public AbstractAction interactWith(Npc n) {
        return null;
>>>>>>> Stashed changes
    }

    @Override
    public AbstractAction interactWith(Avatar n) {
        return null;
    }

    public void mount(Avatar avatar) {
        setMountedAvatar(avatar);
    }

    public Avatar getMountedAvatar() {
        return mountedAvatar;
    }
<<<<<<< Updated upstream
    public String interactWith( Item i){
        return "Mount with Item";
=======

    public void setMountedAvatar(Avatar mountedAvatar) {
        this.mountedAvatar = mountedAvatar;
>>>>>>> Stashed changes
    }
}

package game.model.entity;


import game.util.Location;

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
}

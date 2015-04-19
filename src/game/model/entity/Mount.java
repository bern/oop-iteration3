package game.model.entity;


import game.util.Location;

public class Mount extends Entity {

    Avataar mountedAvataar;

    public Mount(Location l) {
        super(l);
    }

    public void mount(Avataar avataar) {
        setMountedAvataar(avataar);
    }

    public Avataar getMountedAvataar() {
        return mountedAvataar;
    }

    public void setMountedAvataar(Avataar mountedAvataar) {
        this.mountedAvataar = mountedAvataar;
    }
}

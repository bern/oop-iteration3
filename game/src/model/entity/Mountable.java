package model.entity;

public interface Mountable {
    //Take in an entity and attach set it's listeners to mount.
    void mount(Entity entity);
    Entity dismount();
}

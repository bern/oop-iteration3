package game.model.item;


import game.controller.NullAction;
import game.model.behavior.Interactable;
import game.model.behavior.Interactor;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class Item implements Interactable {
    private Location location;
    public Item(Location l) {
        //this.location = l;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new NullAction();
    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar i) {
        return new NullAction();
    }

}

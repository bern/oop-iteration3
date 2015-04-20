package game.model.behavior;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;

import javax.swing.*;

public interface EntityInteractable {
    AbstractAction beInteractedWithBy(Entity i);
    AbstractAction beInteractedWithBy(Avatar i);
    AbstractAction beInteractedWithBy(Mount i);
}

package game.model.behavior;

import game.model.entity.Avatar;
import game.model.entity.Entity;

import javax.swing.*;

public interface EntityInteractable {
    AbstractAction beInteractedWithBy(Entity i);
    AbstractAction beInteractedWithBy(Avatar a);
}

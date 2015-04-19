package game.model.behavior;

import game.model.entity.Character;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.entity.Npc;

import javax.swing.*;

public interface EntityInteractable {
    AbstractAction interactWith(Entity e);
    AbstractAction interactWith(Mount m);
    AbstractAction interactWith(Npc n);
    AbstractAction interactWith(Character n);
}

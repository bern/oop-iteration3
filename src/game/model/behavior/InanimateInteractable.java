package game.model.behavior;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;

public interface InanimateInteractable {
    String interactWith(AnimateInteractable i);
    String interactWith(Entity e);
    String interactWith(Avatar a);
    String interactWith(Mount m);
}

package game.model.behavior;

import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.entity.Mount;
import game.model.item.Item;

public interface AnimateInteractable{
    String interactWith(AnimateInteractable i);
    String interactWith(InanimateInteractable i);
    String interactWith(Entity e);
    String interactWith(Avatar a);
    String interactWith(Mount m);
    String interactWith(Item i);
}

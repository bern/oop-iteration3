package game.model.behavior;

import javax.swing.*;

public interface Interactable {
    AbstractAction interactWith(Interactable e);
}

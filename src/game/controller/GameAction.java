package game.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class GameAction extends AbstractAction {

    @Override
    public abstract void actionPerformed(ActionEvent e);

}

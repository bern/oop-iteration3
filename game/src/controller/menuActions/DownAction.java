package controller.menuActions;

import java.awt.event.ActionEvent;

import model.menu.GameMenu;
import controller.GameAction;

public class DownAction extends GameAction{
    GameMenu gameMenu;

    public DownAction(GameMenu m) {
        gameMenu = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("down action");
        gameMenu.down();
    }
}
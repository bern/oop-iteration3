package controller.menuActions;

import java.awt.event.ActionEvent;

import model.menu.GameMenu;
import controller.GameAction;

public class UpAction extends GameAction {
    GameMenu gameMenu;

    public UpAction(GameMenu m) {
        gameMenu = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("up action");
        gameMenu.up();
    }
}
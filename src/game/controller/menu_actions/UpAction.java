package game.controller.menu_actions;

import game.controller.GameAction;
import game.model.menu.GameMenu;

import java.awt.event.ActionEvent;


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

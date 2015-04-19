package game.controller.menu_actions;

import game.controller.GameAction;
import game.model.menu.GameMenu;

import java.awt.event.ActionEvent;

public class SelectAction extends GameAction{

    GameMenu gameMenu;

    public SelectAction(GameMenu m) {
        gameMenu = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("select action");
        gameMenu.select();
    }
}

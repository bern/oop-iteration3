package controller.menuActions;

import java.awt.event.ActionEvent;

import model.menu.GameMenu;
import controller.GameAction;

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
package game.controller.menu_actions;

import game.controller.GameAction;
import game.model.menu.GameMenu;

import java.awt.event.ActionEvent;

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

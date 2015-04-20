/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.controller.menu_actions;

import game.controller.GameAction;
import game.model.menu.GameMenu;
import java.awt.event.ActionEvent;

/**
 *
 * @author Aidan
 */
public class BackAction extends GameAction{

    GameMenu gameMenu;

    public BackAction(GameMenu m) {
        gameMenu = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("back action");
        gameMenu.back();
    }
}


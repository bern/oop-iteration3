/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.model.menu;

import game.Game;
import game.controller.menu_actions.DownAction;
import game.controller.menu_actions.SelectAction;
import game.controller.menu_actions.UpAction;
import game.util.KeyBindings;
import javax.swing.ActionMap;

/**
 *
 * @author Aidan
 */
public class KeyBindingMenu extends GameMenu {

    String[] options;

    public KeyBindingMenu(Game g){
        super(g);
        setTitle("Rebind Keys");
        setSubtitle("Select which key to edit:");
        options = KeyBindings.getInstance().getBindingNames();
        super.setOptions(options);

    }

    @Override
    public void select() {
        String[] split = getSelectedOption().split(" = ");
        getGame().setBinding(split[0]);
        setSubtitle("Press a key now.");
        getGame().update((GameMenu) getGame().getModel());
    }
    
    public void back() {
        getGame().mainMenu();
    }

    @Override
    public void updateOptions() {
        options = KeyBindings.getInstance().getBindingNames();
        super.setOptions(options);
    }
}
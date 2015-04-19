package game.model.menu;

import game.Game;

/**
 * Created by parango on 4/19/15.
 */
public class PauseMenu extends GameMenu {

    String[] options;
    String[] occupations;

    public PauseMenu(Game g){
        super(g);
        setTitle("Y U NO CONTINUE?");
        options = new String[]{ "Continue", "Save Game", "Controls", "Main Menu"};
        super.setOptions(options);

    }

    @Override
    public void select() {

        switch(getSelectedIndex()){
            case 0:
                getGame().continueGame();
                break;
            case 1:
                getGame().saveGame();
                break;
            case 2:
                getGame().controls();
                break;
            case 3:
                getGame().mainMenu();
                break;
        }
    }
}

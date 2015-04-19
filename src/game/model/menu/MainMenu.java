package game.model.menu;

import game.Game;

public class MainMenu extends GameMenu {

    String[] options;

    public MainMenu(Game g){
        super(g);
        setTitle("GAME 3");
        setSubtitle("Main Menu");
        options = new String[]{ "New Game", "Load Game", "Controls"};
        super.setOptions(options);

    }

    @Override
    public void select() {

        switch(getSelectedIndex()){
            case 0:
                getGame().newGame();

                break;
            case 1:
                getGame().loadGame();
                break;
            case 2:
                getGame().controls();
                break;
        }
    }
}

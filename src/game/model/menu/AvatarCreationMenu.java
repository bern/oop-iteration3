package game.model.menu;

import game.Game;


public class AvatarCreationMenu extends GameMenu {

    String[] options;
    String[] occupations;

    public AvatarCreationMenu(Game g){
        super(g);
        setTitle("CREATE YOUR AVATAR!");
        setSubtitle("Choose your occupation:");
        options = new String[]{ "Smasher", "Summoner", "Sneak", "Back"};
        super.setOptions(options);

    }

    @Override
    public void select() {

        switch(getSelectedIndex()){
            case 0:
                getGame().startGame();
                break;
            case 1:
                getGame().startGame();
                break;
            case 2:
                getGame().startGame();
                break;
            case 3:
                getGame().mainMenu();
                break;
        }
    }
}

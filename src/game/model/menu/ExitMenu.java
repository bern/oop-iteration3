package game.model.menu;

import game.Game;




public class ExitMenu extends GameMenu {

    String[] options;
    String[] occupations;

    public ExitMenu(Game g){
        super(g);
        setTitle("ARE YOU SURE?");
        setSubtitle(" plz dont do dis");
        options = new String[]{ "Yes", "No"};
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
        }
    }

	@Override
	public void updateOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}
}

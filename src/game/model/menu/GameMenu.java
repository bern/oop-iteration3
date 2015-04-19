package game.model.menu;

import game.Game;
import game.controller.menu_actions.DownAction;
import game.controller.menu_actions.SelectAction;
import game.controller.menu_actions.UpAction;
import game.model.MainModel;

import javax.swing.*;

public abstract class GameMenu extends MainModel {


    private String title;
    private String subtitle;
    private String[] options;
    private int selectedOption;

    public GameMenu(Game g){
        super(g);
        title = "";
        subtitle = "";
        options = new String [] {"option1","option2" };
        selectedOption = 0;

    }

    public String getTitle(){
        return title;
    }

    public String getSubtitle(){
        return subtitle;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    protected void setOptions(String[] o){
        options = o;
    }

    public String[] getOptions(){
        return  options;
    }

    public String getSelectedOption(){
        return options[selectedOption];
    }

    public int getSelectedIndex(){
        return selectedOption;
    }

    public void up(){
        if (selectedOption == 0) {
            selectedOption = options.length-1;
        } else {
            selectedOption -=1;
        }

    }

    public void down(){
        if (selectedOption == options.length-1) {
            selectedOption = 0;
        } else {
            selectedOption +=1;
        }
    }

    public abstract void select();


    @Override
    public ActionMap updateValidActions() {
        ActionMap actionMap = new ActionMap();
        actionMap.put("S", new DownAction(this));
        actionMap.put("N", new UpAction(this));
        actionMap.put("select", new SelectAction(this));
        return  actionMap;

    }

}

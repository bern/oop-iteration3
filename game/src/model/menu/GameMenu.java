package model.menu;

import javax.swing.*;

import controller.menuActions.DownAction;
import controller.menuActions.SelectAction;
import controller.menuActions.UpAction;
import model.MainModel;
import application.Game;

public abstract class GameMenu extends MainModel {

    private String[] options;
    private int selectedOption;

    public GameMenu(Game g){
        super(g);
        options = new String [] {"option1","option2" };
        selectedOption = 0;
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
package model;

import javax.swing.ActionMap;

import application.Game;

public abstract class MainModel{

    Game game;

    public MainModel( Game g){
        game = g;
    }

    public Game getGame(){
        return game;
    };


    public abstract ActionMap updateValidActions();
}
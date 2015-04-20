package game.controller;

import game.Game;

import java.awt.event.ActionEvent;

/**
 * Created by parango on 4/20/15.
 */
public class PauseGameAction extends GameAction {
    private Game game;
    public PauseGameAction(Game g) {
        game = g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("pause game view");
        game.pauseGame();
    }
}

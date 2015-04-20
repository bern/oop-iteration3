package game.controller;

import game.model.item.Trap;

import java.awt.event.ActionEvent;

public class TriggerTrapAction extends GameAction {
    Trap trap;

    public TriggerTrapAction(Trap trap) {
        this.trap = trap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        trap.performAction();
    }
}

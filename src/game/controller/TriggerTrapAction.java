package game.controller;

import game.model.entity.Avatar;
import game.model.item.Trap;

import java.awt.event.ActionEvent;

public class TriggerTrapAction extends GameAction {
    Trap trap;
    Avatar avatar;

    public TriggerTrapAction(Trap trap, Avatar avatar) {
        this.trap = trap;
        this.avatar = avatar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        trap.performAction(avatar);
    }
}

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public abstract class GameAction extends AbstractAction {

    @Override
    public abstract void actionPerformed(ActionEvent e);

}
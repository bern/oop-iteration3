package game.controller;

import game.model.entity.Avataar;
import game.model.entity.Mount;

import java.awt.event.ActionEvent;


public class MountAction extends GameAction{
    Avataar avataar;
    Mount mount;

    public MountAction( Avataar a, Mount m) {
        this.avataar = a;
        this.mount = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        mount.mount(avataar);
    }
}
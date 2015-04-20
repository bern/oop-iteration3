package game.controller;

import game.model.entity.Avatar;
import game.model.entity.Mount;

import java.awt.event.ActionEvent;


public class MountAction extends GameAction{
    Avatar avatar;
    Mount mount;

    public MountAction( Avatar a, Mount m) {
        this.avatar = a;
        this.mount = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        mount.mount(avatar);
    }
}
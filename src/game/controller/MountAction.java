package game.controller;

import game.model.entity.Character;
import game.model.entity.Mount;

import java.awt.event.ActionEvent;


public class MountAction extends GameAction{
    Character character;
    Mount mount;

    public MountAction( Character a, Mount m) {
        this.character = a;
        this.mount = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        mount.mount(character);
    }
}
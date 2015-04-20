package game;

import game.util.LoaderSaver;

public class RunGame {
    public static void main(String[] args) {
        new LoaderSaver().loadTerrains();
        new Game().start();

    }
}

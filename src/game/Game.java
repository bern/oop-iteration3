package game;


import game.model.MainModel;
import game.model.game_world.GameWorld;
import game.model.menu.AvatarCreationMenu;
import game.model.menu.GameMenu;
import game.model.menu.MainMenu;
import game.util.LoaderSaver;
import game.view.GameWorldView;
import game.view.menu_view.MenuView;

import javax.swing.*;

public class Game {

    private static Game instance = null;
    private MainModel model;
    private GameWorld activeWorld;
    private GameWorld pausedWorld;
    private JFrame frame;
    private JComponent view;
    private LoaderSaver loaderSaver;
    
    public static Game getInstance() {
        if(instance != null) return instance;
        instance = new Game();
        return instance;
    }

    private Game (){
        initializeJFrame(new JFrame("Dave The Destroyer"));
        initializeLoaderSaver();
    }

    public void start(){ //main Game loop
        mainMenu();
        Boolean running = true;
        while (running) {
            update();
            render();
            try {
                Thread.sleep(60);
            } catch ( InterruptedException e){
                running = false;

            }
        }
    }

    public void mainMenu(){
        MainMenu m = new MainMenu( this );
        update(m);
    }

    public void newGame(){
        AvatarCreationMenu m = new AvatarCreationMenu( this );
        update(m);

    }
    public void startGame(){
    	GameWorld m = loaderSaver.loadNewGameWorld( this);
        //GameWorld m = new GameWorld( this );
        activeWorld = m;
        update(m);
    }

    public void pauseGame(){   // only an action in GameWorld should access this method
        try {
            pausedWorld = (GameWorld) model;
        } catch ( ClassCastException e ){
            System.out.println(" Y U TRY AND SAVE WRONG MODEL?");
        }
    }
    public void continueGame(){
        update( pausedWorld );
        pausedWorld = null;
    }

    public void loadGame(){
        GameWorld m = loaderSaver.loadNewGameWorld( this);
        //GameWorld m = new GameWorld( this );
        update( m );
    }

    public void saveGame(){
        if(pausedWorld != null){
            loaderSaver.saveGameWorld( pausedWorld );
        }

    }

    public void controls(){
        // TODO
    }
    
    public GameWorld getActiveWorld() {
        return activeWorld;
    }

    private ComponentInputMap loadInputMap( JComponent view ){
        return loaderSaver.loadDefaultMenuInputMap( view );
    }

    private void update(){
        view.setActionMap( model.updateValidActions() );
    }

    private void render(){
        frame.repaint();
    }


    private void update(GameMenu m){
        setModel( m );
        setView(new MenuView(m));
    }

    private void update(GameWorld m){
        setModel(m);
        setView(new GameWorldView(m));
    }

    private void setView(JComponent v) {
        if (view != null)
            frame.remove(view);
        this.view = v;
        view.setInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW, loadInputMap(v));
        frame.add(view);
        frame.revalidate();
    }

    private void setModel(MainModel model) {
        this.model = model;
    }
    private void initializeLoaderSaver(){
        loaderSaver = new LoaderSaver();
    }

    private void initializeJFrame(JFrame f) {
        this.frame = f;
        frame.setSize(640, 480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

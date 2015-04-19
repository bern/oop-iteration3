package application;

import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import view.MenuView;
import application.display.MapView;
import model.MainModel;
import model.map.Map;
import model.menu.GameMenu;
import model.menu.MainMenu;

public class Game {

    MainModel model;
    JComponent view;
    ActionMap actionMap;
    ComponentInputMap inputMap;
    JFrame frame;

    public Game (){

        configureJFrame();
        updateModel();
        initialize();
        initializeActions();
        updateView();

    }

    private void initialize(){
       
        actionMap = new ActionMap();
        inputMap = new ComponentInputMap(view);
    }

    private void initializeActions(){
        inputMap.put(KeyStroke.getKeyStroke("W"), "N");
        inputMap.put(KeyStroke.getKeyStroke("X"), "S");
        inputMap.put(KeyStroke.getKeyStroke("Q"), "NW");
        inputMap.put(KeyStroke.getKeyStroke("E"), "NE");
        inputMap.put(KeyStroke.getKeyStroke("Z"), "SW");
        inputMap.put(KeyStroke.getKeyStroke("V"), "SE");
        inputMap.put(KeyStroke.getKeyStroke("S"), "select");
        actionMap = model.updateValidActions();

    }

    private void updateView(){
        view.setActionMap(actionMap);
        view.setInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
    }

    public  void updateModel(){
    	MainMenu m = new MainMenu(this);
    	model = m;
    	view = new MenuView(m);
        updateModel( m );
    }

    public void updateModel( Map m){
        model = m;
        if (view != null)
            frame.remove(view);
        view  = new MapView( m );
        frame.add(view);
        frame.revalidate();
    }

    public void updateModel( GameMenu m){
        model = m;
        if (view != null)
            frame.remove(view);
        view = new MenuView( m );
        frame.add(view);
        frame.revalidate();



    }

    private void configureJFrame() {
    	frame = new JFrame("Dave The Destroyer");
        frame.setSize(640, 480);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void start(){ //main dave_the_destroyer.Game loop
        Boolean running = true;
        while (running) {
            view.repaint();
            try {
                Thread.sleep(60);
            } catch ( InterruptedException e){
                running = false;

            }
        }
    }
}
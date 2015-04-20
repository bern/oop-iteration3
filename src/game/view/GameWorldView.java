package game.view;


import game.model.game_world.GameWorld;
import game.model.game_world.terrain.Dirt;
import game.model.game_world.terrain.Grass;
import game.model.game_world.terrain.Mountain;
import game.model.game_world.terrain.River;
import game.model.game_world.terrain.Terrain;
import game.model.game_world.terrain.Water;
import game.util.Location;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class GameWorldView  extends JComponent {
    private GameWorld map;
    private boolean isMapLoaded;
    private BufferedImage[][] mapImages;
    private static int MAX_ROWS = 60;
    private static int MAP_COLMS = 60;
    private static int X_OFFSET = 25;
    private static int Y_OFFSET = 15;
    private int centerX;
    private int centerY;
    
    private Graphics2D g2d;

    public GameWorldView (GameWorld m){
    	map = m;
    	loadMap();
    	
    	centerX = getWidth()/2;
        centerY = 0;
    	
    }

    @Override
    public void paint( Graphics g){
    	
    	
        super.paint(g);

        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        drawBackground(g2d);
        drawMap(g2d);
        int w = getWidth()/2;
        int h = getHeight()/2;



    }

    private void drawBackground( Graphics2D g ) {
        

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void loadMap() {
    	GameWorldParser rl = new GameWorldParser();
    	mapImages = rl.readGameWorld();
    }
    
    public void drawMap(Graphics2D g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

       
        

        int i = 0, j = 0;
        
        for (int row = 0; row < MAX_ROWS; row++) {

            for (int col = 0; col < MAP_COLMS; col++){
            	
            	
            	
            	
            	Location l = new Location(row,col);
            	map.prepareForDrawAt(l,this);
            	
            	
            	//drawGameObject(g2d, t,centerX + changeInX, centerY + changeInY);
            	
//            	if (s == "Mountain") {
//
//            		g2d.drawImage(ImageResources.mountain.getImage(), centerX + changeInX, centerY + changeInY, null);
//            	} else if (s == "Grass" ) {
//            		g2d.drawImage(ImageResources.grass.getImage(), centerX + changeInX, centerY + changeInY, null);
//            	} else if (s == "Dirt" ) {
//            		g2d.drawImage(ImageResources.dirt.getImage(), centerX + changeInX, centerY + changeInY, null);
//            	} else if (s == "River" ) {
//            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
//            	} else if (s == "Water" ) {
//            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
//            	}
                
                ++i;
            }
            centerX = centerX - X_OFFSET;
            centerY = centerY + Y_OFFSET;

        }
        
        centerX = getWidth()/2;
        centerY = 0;

    }
    
   
    public void drawGameObject( Grass g, Location l){

    	int row = l.getX();
    	int col = l.getY();
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.grass.getImage(), centerX + changeInX, centerY + changeInY, null);
    }
    
    public void drawGameObject( Water w, Location l){

    	int row = l.getX();
    	int col = l.getY();
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
    }

    public void drawGameObject( Mountain m, Location l){
    	int row = l.getX();
    	int col = l.getY();
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
	
    	g2d.drawImage(ImageResources.mountain.getImage(), centerX + changeInX, centerY + changeInY, null);
    }
    
    public void drawGameObject( Dirt d, Location l){

    	int row = l.getX();
    	int col = l.getY();
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.dirt.getImage(), centerX + changeInX, centerY + changeInY, null);
    }
    
    public void drawGameObject( River r, Location l){

    	int row = l.getX();
    	int col = l.getY();
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.dirt.getImage(), centerX + changeInX, centerY + changeInY, null);
    }

}

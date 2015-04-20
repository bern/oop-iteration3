package game.view;


import game.model.game_world.GameWorld;
import game.model.game_world.terrain.Grass;
import game.model.game_world.terrain.Terrain;
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
    

    public GameWorldView (GameWorld m){
    	map = m;
    	loadMap();
    }

    @Override
    public void paint( Graphics g){
    	

        super.paint(g);

        drawBackground(g);
        drawMap(g);
        int w = getWidth()/2;
        int h = getHeight()/2;



    }

    private void drawBackground( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void loadMap() {
    	GameWorldParser rl = new GameWorldParser();
    	mapImages = rl.readGameWorld();
    }
    
    public void drawMap(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

       
        int centerX = getWidth()/2;
        int centerY = 0;
        
        int changeInX = X_OFFSET;
        int changeInY = Y_OFFSET;
        
        int i = 0, j = 0;
        
        for (int row = 0; row < MAX_ROWS; row++) {

        	i = 0;
            for (int col = 0; col < MAP_COLMS; col++){
            	changeInX = X_OFFSET * col;
            	changeInY = Y_OFFSET * col;
            	
            	Location l = new Location(row,col);
            	String s = map.getTerrainAtLocation(l);
            	
            	
            	//drawGameObject(g2d, t,centerX + changeInX, centerY + changeInY);
            	
            	if (s == "Mountain") {
            		g2d.drawImage(ImageResources.mountain.getImage(), centerX + changeInX, centerY + changeInY, null);
            	} else if (s == "Grass" ) {
            		g2d.drawImage(ImageResources.grass.getImage(), centerX + changeInX, centerY + changeInY, null);
            	} else if (s == "Dirt" ) {
            		g2d.drawImage(ImageResources.dirt.getImage(), centerX + changeInX, centerY + changeInY, null);
            	} else if (s == "River" ) {
            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
            	} else if (s == "Water" ) {
            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
            	}
                
                ++i;
            }
            centerX = centerX - X_OFFSET;
            centerY = centerY + Y_OFFSET;

        }
        
       





    }
    
   
//    private void drawGameObject( Graphics2D g2d, Grass g, int x, int y){
//    	terrain.prepareForDraw(this);
//    	
//    	///terrain
//    	gameWorldView.draw(this);
//    	
//    	
//    	g2d.drawImage(ImageResources.grass.getImage(), x, y, null);
//    }

}

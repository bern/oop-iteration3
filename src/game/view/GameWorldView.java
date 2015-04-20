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

import java.util.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class GameWorldView  extends JComponent {
    private GameWorld map;
    private boolean isMapLoaded;
    private BufferedImage[][] mapImages;
    private static int MAX_ROWS = 60;
    private static int MAX_COLMS = 60;
    private  int X_OFFSET = 25;
    private  int Y_OFFSET = 15;
    private int centerX;
    private int centerY;
    
    private Graphics2D g2d;

    public GameWorldView (GameWorld m){
    	map = m;
    	loadMap();
    	
    	centerX = getWidth()/2;
        centerY = getHeight()/2;
    	
    }

    @Override
    public void paint( Graphics g){
    	
    	centerX = getWidth()/2;
        centerY = getHeight()/2;
        
        super.paint(g);

        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        drawBackground(g2d);
        drawMap(g2d);



    }

    private void drawBackground( Graphics2D g ) {
        

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void loadMap() {
    	GameWorldParser rl = new GameWorldParser();
    	mapImages = rl.readGameWorld();
    }
    
    public void drawMap(Graphics2D g2d) {
        


       
    	X_OFFSET = getWidth()/2;
		Y_OFFSET = getHeight()/2;
    	
    	Location EL = new Location(32,11);
    	int eR = EL.getX();
    	int eC = EL.getY();
    	
    	
    	
    	map.prepareForDrawAt(EL,this);
    	
    	printTileNeighbors(EL);

//    	
    	
//    	//NW
//    	X_OFFSET = 0;
//    	Y_OFFSET = 30;
//    	
//    	l = new Location(eR,eC+1);
//    	map.prepareForDrawAt(l,this);
//    	
//    	//SE
//    	X_OFFSET = 0;
//    	Y_OFFSET = 30;
//    	
//    	l = new Location(eR,eC+1);
//    	map.prepareForDrawAt(l,this);
//    	
//    	//SW
//    	X_OFFSET = 0;
//    	Y_OFFSET = 30;
//    	
//    	l = new Location(eR,eC+1);
//    	map.prepareForDrawAt(l,this);
        
//        int i = 0, j = 0;
//        
//        for (int row = 0; row < MAX_ROWS; row++) {
//
//            for (int col = 0; col < MAP_COLMS; col++){
//            	
//            	
//            	
//            	
//            	Location l = new Location(row,col);
//            	map.prepareForDrawAt(l,this);
//            	
//            	
//            	//drawGameObject(g2d, t,centerX + changeInX, centerY + changeInY);
//            	
////            	if (s == "Mountain") {
////
////            		g2d.drawImage(ImageResources.mountain.getImage(), centerX + changeInX, centerY + changeInY, null);
////            	} else if (s == "Grass" ) {
////            		g2d.drawImage(ImageResources.grass.getImage(), centerX + changeInX, centerY + changeInY, null);
////            	} else if (s == "Dirt" ) {
////            		g2d.drawImage(ImageResources.dirt.getImage(), centerX + changeInX, centerY + changeInY, null);
////            	} else if (s == "River" ) {
////            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
////            	} else if (s == "Water" ) {
////            		g2d.drawImage(ImageResources.water.getImage(), centerX + changeInX, centerY + changeInY, null);
////            	}
//                
//                ++i;
//            }
//            centerX = centerX - X_OFFSET;
//            centerY = centerY + Y_OFFSET;
//
//        }
        
        centerX = getWidth()/2;
        centerY = 0;

    }
    
   
    public void drawGameObject( Grass g, Location l){

    	int row = 1;;
    	int col = 1;
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.grass.getImage(), changeInX, changeInY, null);
    }
    
    public void drawGameObject( Water w, Location l){

    	int row = 1;;
    	int col = 1;
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.water.getImage(), changeInX, changeInY, null);
    }

    public void drawGameObject( Mountain m, Location l){
    	int row = 1;;
    	int col = 1;
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
	
    	g2d.drawImage(ImageResources.mountain.getImage(), changeInX, changeInY, null);
    }
    
    public void drawGameObject( Dirt d, Location l){

    	int row = 1;;
    	int col = 1;
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.dirt.getImage(), changeInX, changeInY, null);
    }
    
    public void drawGameObject( River r, Location l){

    	int row = 1;;
    	int col = 1;
    	int changeInX = X_OFFSET * col;
    	int changeInY = Y_OFFSET * col;
    	
    	g2d.drawImage(ImageResources.dirt.getImage(), changeInX, changeInY, null);
    }
    
    
    public void printTileNeighbors(Location tileLocation) {
    	//System.out.println("start");
    	
    	Set<Location> visited = new HashSet<Location>();
    	Queue<Location> bfs = new LinkedList<Location>();
    	Queue<Integer> pixelLocationX = new LinkedList<Integer>();
    	Queue<Integer> pixelLocationY = new LinkedList<Integer>();
    	
    	Location currentLocation;
    	
    	visited.add(tileLocation);
    	bfs.add(tileLocation);
    	pixelLocationX.add(getWidth()/2);
    	pixelLocationY.add(getHeight()/2);
    	
    	int initialOffsetX = tileLocation.getX();
    	int initialOffsetY = tileLocation.getY();
    	
    	int N_X_OFFSET = 0;
    	int N_Y_OFFSET = -30;
    	
    	int S_X_OFFSET = 0;
    	int S_Y_OFFSET = 30;
    	
    	int NE_X_OFFSET = 25;
    	int NE_Y_OFFSET = -15;
    	
    	int SE_X_OFFSET = 25;
    	int SE_Y_OFFSET = 15;
    	
    	int NW_X_OFFSET = -25;
    	int NW_Y_OFFSET = -15;
    	
    	int SW_X_OFFSET = -25;
    	int SW_Y_OFFSET = 15;
    	int i = 0;
    	while (!bfs.isEmpty() && i < 91) {
    		
    		
    		
    		
    		++i;
    		currentLocation = bfs.remove();
    		
    		//System.out.println("new node: " + currentLocation.toString() );
    		
    		int eR = currentLocation.getX();
        	int eC = currentLocation.getY();
        	int pixX = pixelLocationX.remove();
        	int pixY = pixelLocationY.remove();
        

        	
        	Location n = new Location(eR-1,eC-1);
        	
        	if (!visited.contains(n) && isValidLocation(n)) {
        		//System.out.println("added n" + n.toString() );
        		
        		
        		X_OFFSET = (pixX+N_X_OFFSET);
        		Y_OFFSET = (pixY+N_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
            	//north
        		//N_X_OFFSET += N_X_OFFSET;
        		//N_Y_OFFSET += N_Y_OFFSET;
            	
        		map.prepareForDrawAt(n,this);
        		visited.add(n);
            	bfs.add(n);
        	}
        	
        	
        	
        	//south
        	
        	Location s = new Location(eR+1,eC+1);
        	
        	if (!visited.contains(s) && isValidLocation(s)) {
        		//System.out.println("added s" + s.toString());
        		X_OFFSET = (pixX+S_X_OFFSET);
        		Y_OFFSET = (pixY+S_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
        		//S_X_OFFSET += S_X_OFFSET;
        		//S_Y_OFFSET += S_Y_OFFSET;
        		
        		map.prepareForDrawAt(s,this);
        		
        		visited.add(s);
            	bfs.add(s);
        	}
        	
        	
        	//NE
        	
        	Location ne = new Location(eR-1,eC);
        	
        	if (!visited.contains(ne) && isValidLocation(ne)) {
        		//System.out.println("added ne" + ne.toString());
        		
        		X_OFFSET = (pixX+NE_X_OFFSET);
        		Y_OFFSET = (pixY+NE_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
        		//NE_X_OFFSET += NE_X_OFFSET;
        		//NE_Y_OFFSET += NE_Y_OFFSET;
        		
        		map.prepareForDrawAt(ne,this);
        		
        		visited.add(ne);
            	bfs.add(ne);
        	}
        	
        	//SE
        	
        	Location se = new Location(eR,eC+1);
        	
        	if (!visited.contains(se) && isValidLocation(se)) {
        		//System.out.println("added se" + se.toString());
        		X_OFFSET = (pixX+SE_X_OFFSET);
        		Y_OFFSET = (pixY+SE_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
        		//SE_X_OFFSET += SE_X_OFFSET;
        		//SE_Y_OFFSET += SE_Y_OFFSET;
        		
        		map.prepareForDrawAt(se,this);
        		
        		visited.add(se);
            	bfs.add(se);
        	}
        	

        	
        	//NW
        	
        	Location nw = new Location(eR,eC-1);
        	
        	if (!visited.contains(nw) && isValidLocation(nw)) {
        		//System.out.println("added nw" + nw.toString());
        		X_OFFSET = (pixX+NW_X_OFFSET);
        		Y_OFFSET = (pixY+NW_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
        		//NW_X_OFFSET += NW_X_OFFSET;
        		//NW_Y_OFFSET += NW_Y_OFFSET;
        		
        		map.prepareForDrawAt(nw,this);
        		
        		visited.add(nw);
            	bfs.add(nw);
        	}

        	
        	
        	//SW
        	
        	
        	Location sw = new Location(eR+1,eC);
        	
        	if (!visited.contains(sw) && isValidLocation(sw)) {
        		//System.out.println("added sw" + sw.toString());
        		X_OFFSET = (pixX+SW_X_OFFSET);
        		Y_OFFSET = (pixY+SW_Y_OFFSET);
        		
        		pixelLocationX.add(X_OFFSET);
            	pixelLocationY.add(Y_OFFSET);
        		//SW_X_OFFSET += SW_X_OFFSET;
        		//SW_Y_OFFSET += SW_Y_OFFSET;
        		
        		map.prepareForDrawAt(sw,this);
        		
        		visited.add(sw);
            	bfs.add(sw);
        	}
    	}
    	//System.out.println("end");
    	
    }
    
    boolean isValidLocation(Location location) {
    	int x = location.getX();
    	int y = location.getY();
    	if (x < MAX_ROWS && x >= 0 && y < MAX_COLMS && y >= 0){
    		return true;
    	} else {
    		return false;
    	}
    }
}

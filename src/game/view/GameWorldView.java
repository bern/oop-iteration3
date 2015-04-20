package game.view;


import game.model.entity.*;
import game.model.game_world.GameWorld;
import game.model.game_world.terrain.*;
import game.util.Location;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;



public class GameWorldView  extends JComponent {
    private GameWorld map;
    private static int MAX_ROWS = 60;
    private static int MAX_COLMS = 60;
    private int pixelX;
    private int pixelY;
    private int centerX;
    private int centerY;
    
    public int getPixelX() {
		return pixelX;
	}

	public void setPixelX(int pixelX) {
		this.pixelX = pixelX;
	}

	public int getPixelY() {
		return pixelY;
	}

	public void setPixelY(int pixelY) {
		this.pixelY = pixelY;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	private Graphics2D g2d;

    public GameWorldView (GameWorld m){
    	map = m;  	
    }

    @Override
    public void paint(Graphics g){
    	super.paint(g);
    	
    	g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
    	
        setCenterX(getWidth()/2);
        setCenterY(getHeight()/2);

        setPixelX(centerX);
        setPixelY(centerY);
        
        drawBackground(g2d);
        drawMap(g2d);
    }

    private void drawBackground( Graphics2D g ) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void drawMap(Graphics2D g2d) {
    	//get Entity Location
		Entity entity = map.getCurrentEntity();
    	Location EL = entity.getLocation();
    	int eR = EL.getX();
    	int eC = EL.getY();
    	
    	map.prepareForDrawAt(EL, this);
		setPixelX(getCenterX());
		setPixelY(getCenterY());
		entity.prepareForDraw(this);

    	
    	printTileNeighbors(EL);
    }
    
   
    public void drawGameObject( Grass g, Location l){
    	g2d.drawImage(ImageResources.grass.getImage(), pixelX, pixelY, null);
    }
    
    public void drawGameObject( Water w, Location l){
    	g2d.drawImage(ImageResources.water.getImage(), pixelX, pixelY, null);
    }

    public void drawGameObject( Mountain m, Location l){
    	g2d.drawImage(ImageResources.mountain.getImage(), pixelX, pixelY, null);
    }
    
    public void drawGameObject( Dirt d, Location l){
    	g2d.drawImage(ImageResources.dirt.getImage(), pixelX, pixelY, null);
    }
    
    public void drawGameObject( River r, Location l){
    	g2d.drawImage(ImageResources.river.getImage(), pixelX, pixelY, null);
    }

	public void drawGameObject( Avatar a ){
		g2d.drawImage(ImageResources.avatar.getImage(), pixelX, pixelY, null);
	}
	public void drawGameObject(Npc npc) {
	}

	public void drawGameObject(Mount mount) {
	}

	public void drawGameObject(Pet pet) {
	}


    
    
    /*
     * this method uses BFS to find near by tiles, print them, and not reprinting them.
     */
    
    public void printTileNeighbors(Location tileLocation) {
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
    	
    	while (!bfs.isEmpty() && i < 127) {
    		++i;
    		currentLocation = bfs.remove();
    		
    		int eR = currentLocation.getX();
        	int eC = currentLocation.getY();
        	int pixX = pixelLocationX.remove();
        	int pixY = pixelLocationY.remove();
        

        	//north
        	Location n = new Location(eR-1,eC-1);
        	
        	if (!visited.contains(n) && isValidLocation(n)) {
        		setPixelX(pixX+N_X_OFFSET);
        		setPixelY(pixY+N_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);

        		map.prepareForDrawAt(n,this);
        		visited.add(n);
            	bfs.add(n);
        	}
        	
        	
        	
        	//south
        	Location s = new Location(eR+1,eC+1);
        	
        	if (!visited.contains(s) && isValidLocation(s)) {
        		setPixelX(pixX+S_X_OFFSET);
        		setPixelY(pixY+S_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);
        		
        		map.prepareForDrawAt(s,this);
        		
        		visited.add(s);
            	bfs.add(s);
        	}
        	
        	
        	//NE
        	Location ne = new Location(eR-1,eC);
        	
        	if (!visited.contains(ne) && isValidLocation(ne)) {
        		setPixelX(pixX+NE_X_OFFSET);
        		setPixelY(pixY+NE_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);

        		
        		map.prepareForDrawAt(ne,this);
        		
        		visited.add(ne);
            	bfs.add(ne);
        	}
        	
        	//SE
        	Location se = new Location(eR,eC+1);
        	
        	if (!visited.contains(se) && isValidLocation(se)) {
        		
        		setPixelX(pixX+SE_X_OFFSET);
        		setPixelY(pixY+SE_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);
        		
        		
        		map.prepareForDrawAt(se,this);
        		
        		visited.add(se);
            	bfs.add(se);
        	}
        	

        	
        	//NW
        	Location nw = new Location(eR,eC-1);
        	
        	if (!visited.contains(nw) && isValidLocation(nw)) {
        		setPixelX(pixX+NW_X_OFFSET);
        		setPixelY(pixY+NW_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);
        		
        		
        		map.prepareForDrawAt(nw,this);
        		
        		visited.add(nw);
            	bfs.add(nw);
        	}

        	
        	
        	//SW
        	Location sw = new Location(eR+1,eC);
        	
        	if (!visited.contains(sw) && isValidLocation(sw)) {
        		setPixelX(pixX+SW_X_OFFSET);
        		setPixelY(pixY+SW_Y_OFFSET);
        		
        		pixelLocationX.add(pixelX);
            	pixelLocationY.add(pixelY);
        		
        		map.prepareForDrawAt(sw,this);
        		
        		visited.add(sw);
            	bfs.add(sw);
        	}
    	}
    	
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

	public static int getMagicNumberFromRadius (int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		sum = sum*6;
		sum++;
		return sum;
	}


}

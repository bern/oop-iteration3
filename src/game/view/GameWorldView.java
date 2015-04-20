package game.view;


import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.model.game_world.GameWorld;
import game.model.game_world.terrain.*;
import game.util.ImageResources;
import game.util.Location;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;



public class GameWorldView  extends JComponent {
    private GameWorld map;
    private ImageResources imageResources;
    private int brushX;
    private int brushY;
    

    public GameWorldView (GameWorld m){
    	map = m;
        imageResources = new ImageResources();

    }

    @Override
    public void paint( Graphics g){
        super.paint(g);
        drawBackground(g);
        drawMap(g);

    }

    private void drawBackground( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void drawMap(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        brushX = getWidth()/2;
        brushY = getHeight()/2-32;

        Entity e = map.getCurrentEntity();
        int radius = 2;

        for(int r = 0; r<= radius; r++) {
            drawTerrain(g2d, e.getLocation(), r);
        }
        brushX = getWidth()/2;
        brushY = getHeight()/2-32;
        g2d.drawImage(imageOf( e ), brushX, brushY, null);



    }

    private void drawTerrain( Graphics g, Location l, int radius){
        Graphics2D g2d = (Graphics2D) g;
        Location root = new Location(l);


        Terrain t = map.getTerrainAtLocation(root);
        g2d.drawImage(imageOf(t), brushX, brushY, null);
        root = moveBrushAndLocationTo(4, root);

        for(int i = 0; i<6 ; i++){
            for(int j = 0; j<radius; j++){
                t = map.getTerrainAtLocation( root );
                g2d.drawImage(imageOf(t), brushX, brushY, null);
                root = moveBrushAndLocationTo(i, root);
            }
        }


    }

    private Location moveBrushAndLocationTo( int i, Location l ){

        switch ( i ){
            case 0:
                brushY -= 16;
                brushX -= 25;
                return l.northwest();
            case 1:
                brushY -= 32;
                return l.north();
            case 2:
                brushY -= 16;
                brushX += 25;
                return l.northeast();
            case 3:
                brushY += 16;
                brushX += 25;
                return l.southeast();
            case 4:
                brushY += 32;
                return l.south();
            case 5:
                brushY += 16;
                brushX -= 25;
                return l.southwest();
            default:
                return l.north();

        }
    }




    public BufferedImage imageOf(Water w){
        return imageResources.getImage( w );
    }
    public BufferedImage imageOf(Mountain m){
        return imageResources.getImage( m );
    }
    public BufferedImage imageOf(River r){
        return imageResources.getImage( r );
    }
    public BufferedImage imageOf(Dirt d){
        return imageResources.getImage( d );
    }
    public BufferedImage imageOf(Grass g) {
        return imageResources.getImage( g );
    }
    public BufferedImage imageOf(Terrain t) {
        return t.drawOn(this);
    }
    public BufferedImage imageOf(Entity t) {
        return t.drawOn(this);
    }
    public BufferedImage imageOf(Avatar a) {
        return imageResources.getImage(a);
    }
}

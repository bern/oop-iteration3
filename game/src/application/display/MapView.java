package application.display;

//import dave_the_destroyer.model.Map;

import javax.imageio.ImageIO;
import javax.swing.*;

import model.map.Map;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MapView  extends JComponent {
	Map map;

    public MapView (Map m){
        
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
    
    public void drawMap(Graphics g) {
    	 Graphics2D g2d = (Graphics2D) g;
         g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                 RenderingHints.VALUE_ANTIALIAS_ON);
         BufferedImage img;
		try {
			img = ImageIO.read(new File("resources/HorizontalHex.png"));
			int centerX = getWidth()/2;
			int centerY = getHeight()/2 - 100;
			
			int xOffset = 25;
			int yOffset = 15;
			
			for (int row = 0; row < 10; row++) {
				
				for (int col = 0; col < 10; col++){
					xOffset = 25 * col;
					yOffset = 15 * col;
					g2d.drawImage(img, centerX + xOffset, centerY + yOffset, null);
				}
				centerX = centerX - 25;
				centerY = centerY + 15;
			}
			
			
//			//0,0
//			g2d.drawImage(img,centerX , centerY, null);
//			//0,1
//			g2d.drawImage(img,centerX+25 , centerY+15, null);
//			//1,0
//			g2d.drawImage(img, centerX-25, centerY+15, null);
//			//1,1
//			g2d.drawImage(img, centerX, centerY+30, null);
//			
//			//0,2
//			g2d.drawImage(img,centerX+50 , centerY+30, null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
    }


}
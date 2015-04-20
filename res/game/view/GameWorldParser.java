package game.view;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class GameWorldParser {
	BufferedImage water;
	BufferedImage mountain;
	BufferedImage grass;
	BufferedImage dirt;
	BufferedImage arrow;
	
	public GameWorldParser() {
		initTileImages();
	}
	
	public void initTileImages() {
		try {
			water = ImageIO.read(new File("res/water.png"));
			mountain = ImageIO.read(new File("res/mountain.png"));
			grass = ImageIO.read(new File("res/grass.png"));
			dirt = ImageIO.read(new File("res/dirt.png"));
			arrow = ImageIO.read(new File("res/river.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public BufferedImage[][] readGameWorld() {
		BufferedImage[][] map = new BufferedImage[65][65]; 
		

		
		try{
			FileInputStream fstream = new FileInputStream("res/map/terrain1.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader( new InputStreamReader(in));
			String line = "";
			int row = 0, col = 0;
			
			while((line  = br.readLine()) !=null){
	
				for (col = 0; col < line.length(); ++col) {
					if (line.charAt(col) == 'W'){
						map[row][col] = water;
					} else if (line.charAt(col) == 'G'){
						map[row][col] = grass;
					} else if (line.charAt(col) == 'M'){
						map[row][col] = mountain;
					} else if (line.charAt(col) == 'D'){
						map[row][col] = dirt;
					} else if (line.charAt(col) == 'R'){
						map[row][col] = water;
					}
					
				}
				
				++row;
					


				}
				
			
			in.close();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error reading file");
		}
		
		return map;
	}
}

package game.util;


import game.model.entity.Avatar;
import game.model.game_world.terrain.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ImageResources {

    private HashMap<String, String> paths;
    private HashMap<String, BufferedImage> images;

    public ImageResources(){
        paths = new HashMap();
        images = new HashMap();

        try {
            BufferedReader br =  new BufferedReader(
                    new InputStreamReader(
                            getClass().getResourceAsStream("/imagePaths.csv")));
            String line;
            while( (line = br.readLine()) != null ){
                String[] splits = line.split(",");
                paths.put(splits[0],splits[1]);

            }

            br.close();
        }
        catch (Exception ex) {
            System.out.println("Your paths failed to load");
            ex.printStackTrace();
        }
    }

    public void loadImage(String id) {
        if(!images.containsKey(id)){
            System.out.println("loading "+id);
            BufferedImage image = null;
            try {
                image = ImageIO.read(getClass().getResource(paths.get(id)));
            } catch (Exception ex) {
                System.out.println( ex );
                System.out.println("ERROR HERE: " + paths.get(id));
            }
            images.put(id, image);
        }
    }



    public BufferedImage getImage( Water w){
        String id = "water";
        loadImage(id);
        return images.get(id);
    }

    public BufferedImage getImage( Mountain m){
        String id = "mountain";
        loadImage(id);
        return images.get(id);
    }

    public BufferedImage getImage( River m){
        String id = "river";
        loadImage(id);
        return images.get(id);
    }

    public BufferedImage getImage( Grass m){
        String id = "grass";
        loadImage(id);
        return images.get(id);
    }

    public BufferedImage getImage( Dirt m){
        String id = "dirt";
        loadImage(id);
        return images.get(id);
    }

    public BufferedImage getImage( Avatar m){
        String id = "avatar";
        loadImage(id);
        return images.get(id);
    }
}

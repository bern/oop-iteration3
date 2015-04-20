package game.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum ImageResources {
  water("res/Water.png"),
  mountain("res/Mountain.png"),
  grass("res/Grass.png"),
  dirt("res/Dirt.png"),
  arrow("res/HorizontalHex.png");
  


  private BufferedImage image = null;

  ImageResources(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public BufferedImage getImage() {
    return image;
  }
}
  
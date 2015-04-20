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
  river("res/HorizontalHex.png"),
  potion("res/item/P_Red01.png"),
  sword("res/item/W_Sword001.png"),
  armor("res/item/A_Armor04.png"),
  bow("res/item/W_Bow02.png"),
  arrow("res/item/S_Bow04.png"),
  smasher("res/smasher.png"),
  summoner("res/summoner.png"),
  sneak("res/sneak.png"),
  mount("res/hotairballoon.png");
  


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
  
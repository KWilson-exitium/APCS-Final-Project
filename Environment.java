import java.io.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Environment extends Map{
   Map level = new Map();
   //This block handles Items
   /*int[] itemXY(){
      int[] xy = new int[2];
      xy[0] = 30;
      xy[1] = 80;
      return xy[]; 
   }*/
   boolean keyGet(Scanner ConfigReader){
      boolean gotKey = false;
      while(ConfigReader.hasNext()){
         if(ConfigReader.next().equals("ITEM")){
            gotKey = true;
         }
      }
      return gotKey;
   }
  
   public boolean isWall(int x, int y, String direction) throws IOException{
      BufferedImage room = ImageIO.read(new File(level.getX() + "," + level.getY() + ".png"));   
      int[][] walls = convertImage(room);   
      boolean blocked = false;
      if(direction.equals("UP")) {
         if(walls[y-1][x] == -3584){blocked = true;}
      }
      if(direction.equals("DOWN")) {
         if(walls[y+1][x] == -3584){blocked = true;}
      }
      if(direction.equals("LEFT")) {
         if(walls[y][x-1] == -3584){blocked = true;}
      }
      if(direction.equals("RIGHT")) {
         if(walls[y][x+1] == -3584){blocked = true;}
      }
      return true;      
   } 
    
   static int[][] convertImage(BufferedImage image) {
      int width = image.getWidth();
      int height = image.getHeight();
      int[][] result = new int[height][width];
   
      for (int row = 0; row < height; row++) {
         for (int col = 0; col < width; col++) {
            result[row][col] = image.getRGB(col, row);
         }
      }
   
      return result;
   }
}
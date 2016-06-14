import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;


public class Map{
   void drawRoom(int x, int y, Graphics g)throws IOException{
      BufferedImage roomToDraw = ImageIO.read(new File(x + "," + y + ".png"));
      g.drawImage(roomToDraw , 0 , 0 , null);
   }
   void update(double delta, long lastTime , double ns){
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      while(delta >= 1){
         tick();
         delta--;
      }
      delta += (now - lastTime) / ns;
      lastTime = now;
   }
   void tick(){
      
   }
}
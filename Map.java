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
}
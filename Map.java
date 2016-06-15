import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.*;
import java.util.*;

public class Map{
   int xNum;
   int yNum;
   void drawRoom(int x, int y, Graphics g)throws IOException{
      BufferedImage roomToDraw = ImageIO.read(new File(x + "," + y + ".png"));
      g.drawImage(roomToDraw , 0 , 0 , null);
      xNum=x;
      yNum=y;
   }
   int getX(){return xNum;}
   int getY(){return yNum;}
}
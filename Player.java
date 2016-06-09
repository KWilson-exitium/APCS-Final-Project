import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;

public class Player{
   void drawAt(int xPos , int yPos , String fetchedFile , Graphics g) throws IOException{
      BufferedImage toDraw = ImageIO.read(new File(fetchedFile));
      g.drawImage(toDraw , xPos , yPos , null);
      
   }
}
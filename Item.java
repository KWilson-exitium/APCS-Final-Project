/*-----///Kev's code-(11010110)///////-----------*/

package events;

import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public abstract class Item implements KeyListener, Movable{
   private int currentX;
   private int currentY;
   
   String getName(Scanner ConfigReader){
      String name = "WhiteKey"; 
       
      return name;
   }
   int[] getStats(Scanner ConfigReader){
      int[] statList = new int[3];
      
      return statList;
   }
   boolean isKey(Scanner ConfigReader){
      boolean key = false;
      if (Environment.keyGet(ConfigReader)){
         key = true;
      }
      return key;
   }
   void drawAt(int xPos , int yPos , String fetchedFile , Scanner ConfigReader , Graphics g) throws IOException{
      BufferedImage toDraw = ImageIO.read(new File(fetchedFile));
      g.drawImage(toDraw , xPos , yPos , null);
      
   }
   void moveItem(KeyEvent e , boolean isHeld , KeyTest holdTest){
      while(isHeld){
         if(holdTest.key("E")){
            Movable.move(1 , currentX , currentY);
         }
      }
   }
}

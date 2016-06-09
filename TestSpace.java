import java.util.*;
import java.awt.*;
import java.io.*;
public class TestSpace{
   void main(String[] args)throws FileNotFoundException , IOException{
      DrawingPanel gameWindow = new DrawingPanel(800,500);
      Graphics g = gameWindow.getGraphics();
      Scanner Console;
      //ItemTest(Console , g);
   }
   void ItemTest(Scanner Console, Graphics g)throws IOException{
      //System.out.println(Item.getName());
      Console = new Scanner(new File("0,0_config.txt"));
      ArrayList<Item> itemLister = new ArrayList();
      int itemCount = 0;
      while(Console.hasNext()){
         if(Console.next().eqauls("ITEM")){
            itemLister<Item>.new(Kevin = new Item());
            itemCount++;
         }
      }
      Kevin.drawAt(30 , 80 , "Bacon.jpg", Console , g);
      //Item.moveWith(true);
      //Item.move(1 , 30 , 80);  
   }
   void PlayerTest(Graphics g){
      
   }
   void MapTest(Scanner Console , Graphics g)throws IOException{
      
   } 
}

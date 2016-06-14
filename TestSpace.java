import java.util.*;
import java.awt.*;
import java.io.*;
public class TestSpace{
   long lastTime;
   double amountOfTicks = 60.0;
   double ns = 1000000000;
   double delta = 0;
   long timer = System.currentTimeMillis();
   public static void main(String[] args)throws FileNotFoundException , IOException{
      DrawingPanel gameWindow = new DrawingPanel(800,500);
      Graphics g = gameWindow.getGraphics();
      Scanner Console;
      KeyTest keyPressed = new KeyTest();
      Map Layout = new Map();
      MapTest(g , Layout , false , keyPressed);
      //ItemTest(Console , g);
   }
   /*void ItemTest(Scanner Console, Graphics g)throws IOException{
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
   }*/
   void PlayerTest(Graphics g){
      
   }
   public static void MapTest(Graphics g , Map Layout , boolean endMet , KeyTest keyPressed)throws IOException{
      int x = 0;
      int y = 1;
      lastTime = System.nanoTime();
      while(!endMet){
         Layout.update(delta , lastTime , ns);
         if (keyPressed.key("W")){
            y--;
         }
         Layout.drawRoom(x , y , g);
         if(x == 0 && y == 0){
            endMet = true;
         }
      }
   }
}

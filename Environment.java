import java.io.*;
import java.util.*;

public class Environment{
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
   //This block handles Map Generation
   
}
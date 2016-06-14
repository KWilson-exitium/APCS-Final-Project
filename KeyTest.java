import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class KeyTest extends JFrame implements ActionListener, KeyListener{
   public KeyTest() {this.addKeyListener(this);}  
   String let;
   public void keyPressed(KeyEvent e){
      if(e.getKeyCode() == KeyEvent.VK_W) {
         let = "W";
      }
      if(e.getKeyCode() == KeyEvent.VK_A) {
         let = "A";
      }
      if(e.getKeyCode() == KeyEvent.VK_S) {
         let = "S";
      }
      if(e.getKeyCode() == KeyEvent.VK_D) {
         let = "D";
      }
      if(e.getKeyCode() == KeyEvent.VK_E) {
         let = "E";
      }
   }   
   public boolean key(String button) {    
      boolean pressed = false;
      if(button.equals(let)) {
         pressed = true;
      }     
      return pressed;
   }
   public void actionPerformed(ActionEvent e) {
   }
   public void keyReleased(KeyEvent e){
   }

   public void keyTyped(KeyEvent e){
   
   }
}
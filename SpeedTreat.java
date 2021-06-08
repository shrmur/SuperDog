import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SpeedTreat extends powerUP
{

   //Instance data
   // Author: Ahnaf Nibir
   private int x;
   private int y;
   private int myX;
   private int myY;
   private int height;
   private int width;
   // no-arg constructors
   // Author: Ahnaf Nibir
   public SpeedTreat()
   {
      myX=50;
      myY=250;
      height=25;
      width=25;
   
   }
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   // Ahnaf Nibir
   public int getX() 
   { 
      return myX;
   }
   
   // Ahnaf Nibir
   // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- myY
   
   public int getY()      
   { 
      return myY;
   }
   
   // Ahnaf Nibir
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- treat height
   
   public int getHeight()
   {
      return height;
   }
   
   // Ahnaf Nibir
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   public int getWidth()
   {
      return width;
   }
   
   // draw
   // Author: Ahnaf Nibir
   public void draw(Graphics g) 
   {
      ImageIcon icon = new ImageIcon("SpeedTreat.png"); //Image from: https://bit.ly/3p4Rpxm
      g.drawImage(icon.getImage(), myX, myY, height, width, null);
   
   }

}
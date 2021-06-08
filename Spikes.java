import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Spikes extends Ground
{
   //graphics data
   // Author: Ahnaf Nibir
   private int myX;
   private int myY;
   private int height;
   private int width;
   
   //ground data
   // Author: Ahnaf Nibir
   private boolean isHarmful = true;
   
   //default constructor
   // Author: Ahnaf Nibir
   public Spikes()
   {
      myX=100;
      myY=350;
      height=55;
      width=50;
   }
   
   //4-arg constructor
   // Author: Ahnaf Nibir
   public Spikes(int x, int y, int z, int a)
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   
   //methods
   // Author: Ahnaf Nibir
   
   // Pre-condition:
   // Post-Condition: current X value is returned 
   // @param- n/a
   // @return- myX is returned 

   public int getX() 
   { 
      return myX;
   }
   
   // Pre-condition:
   // Post-Condition: current Y value is returned 
   // @param- n/a
   // @return- myY is returned 
   public int getY()      
   { 
      return myY;
   }
   
   // Pre-condition:
   // Post-Condition: current height value is returned 
   // @param- n/a
   // @return- height is returned 
   public int getHeight()
   {
      return height;
   }
   
   // Pre-condition:
   // Post-Condition: current width value is returned 
   // @param- n/a
   // @return- width is returned 
   public int getWidth()
   {
      return width;
   }

   //draw
   // Author: Ahnaf Nibir
   public void draw(Graphics g) 
   {
      ImageIcon spikes = new ImageIcon("abc.png"); //Image from: Created by Ahnaf Nibir
      g.drawImage(spikes.getImage(), myX, myY, height, width, null);
   
   }
}
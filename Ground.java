import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
     public class Ground
{
   //graphics data
   // Author: Ahnaf Nibir
   private int myX;
   private int myY;
   private int height;
   private int width;
   
   //ground data
   // Author: Ahnaf Nibir
   private boolean isHarmful = false;
   
   //default constructor
   // Author: Ahnaf Nibir

   public Ground()
   {
      myX=0;
      myY=370;
      height=35;
      width=585;
   }
  
   //4-arg constructor
   // Author: Ahnaf Nibir

   public Ground(int x, int y, int z, int a)
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
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
   // Pre-condition:
   // Post-Condition: Ground is drawn on the map
   // @param- graphics g
   // @return- n/a
    public void draw(Graphics g) 
   {
      g.setColor(new Color(115, 46, 0));
      g.fillRect(myX, myY, width, height);
   
   }
   
   
   
}
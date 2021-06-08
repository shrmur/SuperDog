import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Platform extends Ground
{
   //graphics data
   // Author: Ahnaf Nibir
   private int startX;
   private int startY;
   private int height;
   private int width;
   
   //Platform is not harmful
   // Author: Ahnaf Nibir
        
   private boolean isHarmful = false;
  
  
  //default constructor
  // Author: Ahnaf Nibir
   public Platform()
   {
   
   }
  
   
   //4-arg constructor
   // Author: Ahnaf Nibir
  
   public Platform(int x, int y, int h,int w)
   {
      startX=x;
      startY=y;
      width=w;
      height=h;
   }
   
  
   
      // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- startX
   public int getX() 
   { 
      return startX;
   }
      // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- startY
   public int getY()      
   { 
      return startY;
   }
      // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- platform height
   public int getHeight()
   {
      return height;
   }
      // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- platform width
   public int getWidth()
   {
      return width;
   }
   
      //draw method
      // Author: Ahnaf Nibir
   
   public void draw(Graphics g) 
   {
      g.setColor(new Color(168, 50, 50));
      g.fillRect(startX, startY, width, height);
   
   }
}
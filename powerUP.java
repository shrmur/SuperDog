import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
     //author:Shrish Murugapandi

public abstract class powerUP
{
   private int x;
   private int y;
   private int myX;
   private int myY;
   private int height;
   private int width;
     //author:Shrish Murugapandi

   public powerUP()
   {
      myX=50;
      myY=250;
      height=13;
      width=13;
   
   }
        //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
    public int getX() 
   { 
      return myX;
   }
        //author:Shrish Murugapandi
   //author:Aidan Comi
   // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- myY
   public int getY()      
   { 
      return myY;
   }
        //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- powerUP height
   public int getHeight()
   {
      return height;
   }
        //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- powerUP width
   public int getWidth()
   {
      return width;
   }
        //author:Shrish Murugapandi

  public void draw(Graphics g) 
   {
      ImageIcon icon = new ImageIcon("icon2.png"); 
      g.drawImage(icon.getImage(), myX, myY, height, width, null);
   
   }
}
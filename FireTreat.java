import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FireTreat extends powerUP
{
   private int x;
   private int y;
   private int myX;
   private int myY;
   private int height;
   private int width;
     //author:Shrish Murugapandi

   public FireTreat()
   {
      myX=50;
      myY=250;
      height=25;
      width=25;
   
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
   // @return- treat height

   public int getHeight()
   {
      return height;
   }
        //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   public int getWidth()
   {
      return width;
   }
         //author:Shrish Murugapandi

   public void draw(Graphics g) 
   {
      ImageIcon icon = new ImageIcon("FireTreat.png"); //Image from: https://bit.ly/3p4Rpxm
      g.drawImage(icon.getImage(), myX, myY, height, width, null);
   
   }

}
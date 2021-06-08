import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnemyCat extends Enemy
{  
   // Author: Ahnaf Nibir
   //private instance data fields
   private int x;
   private int y;
   private int myX;
   private int myY;
   private int height;
   private int width;
   private int speed=10;

   //constructors 
   //no-arg constructor
   // Author: Ahnaf Nibir
   public EnemyCat()
   {
      myX=50;
      myY=325;
      height=45;
      width=45;
   }
   //4-arg constructor
   // Author: Ahnaf Nibir
   private boolean isHarmful = true;

   public EnemyCat(int x, int y, int z, int a)
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX   
   public int getX() 
   { 
      return myX;
   }
   
   // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- myY
   public int getY()      
   { 
      return myY;
   }
   
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- cat height
   public int getHeight()
   {
      return height;
   }
   
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   public int getWidth()
   {
      return width;
   }
   
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets X value to parameter
   // @param- integer x is parameter
   // @return- n/a

   public void setX(int x)
   {
      myX = x;
   } 
   
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets Y value to parameter
   // @param- integer Y is parameter
   // @return- n/a

   public void setY(int y)
   {
      myY=y;
   } 
   
   // Pre-condition: height has to be an integer 
   // Post-Condition: sets height value to parameter
   // @param- integer y is parameter
   // @return- n/a

   public void setHeight(int h)
   {
      height = h;
   }
   
   // Pre-condition: y has to be an integer 
   // Post-Condition: sets width value to parameter
   // @param- integer Y is parameter
   // @return- n/a
   public void setWidth(int w)
   {
      width = w;
   }

   
   
   //draw
   // Author: Ahnaf Nibir
   public void draw(Graphics g) 
   {
      ImageIcon enemy = new ImageIcon("EnemyCat.png"); //Image from https://bit.ly/3yGZ6Oq
      g.drawImage(enemy.getImage(), myX, myY, height, width, null);
   
   }
   
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Enemy
{
   //private instance data fields
   private int x;
   private int y;
   private int myX;
   private int myY;
   private int height;
   private int width;
   private int speed=5;
    
      //author:Sayemum 

   //constructors 
   //no-arg constructor
   public Enemy()
   {
      myX=50;
      myY=325;
      height=45;
      width=45;
   }
     //author:Sayemum 

   //4-arg constructor
   public Enemy(int x, int y, int z, int a)
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   
   //methods
   //accesor methods
    
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   public int getX() 
   { 
      return myX;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- myY
   public int getY()      
   { 
      return myY;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- enemy height
   public int getHeight()
   {
      return height;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- enemy width
   public int getWidth()
   {
      return width;
   }
   
   
   // modifier methods
   
   //author:Sayemum 
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets X value to parameter
   // @param- integer x is parameter
   // @return- n/a
   public void setX(int x)
   {
      myX = x;
   } 
   
   //author:Sayemum 
   // Pre-condition: Y has to be an integer 
   // Post-Condition: sets Y value to parameter
   // @param- integer Y is parameter
   // @return- n/a
   public void setY(int y)
   {
      myY=y;
   }
   
   //author:Sayemum 
   // Pre-condition: h has to be an integer 
   // Post-Condition: sets height value to parameter
   // @param- integer h is parameter
   // @return- n/a
   public void setHeight(int h)
   {
      height = h;
   }
   
   //author:Sayemum 
   // Pre-condition: w has to be an integer 
   // Post-Condition: sets width value to parameter
   // @param- integer w is parameter
   // @return- n/a
   public void setWidth(int w)
   {
      width = w;
   }
      
   //abstract methods
   //public abstract void isHurt();
   
   
   //author:Sayemum 
   // Pre-condition:
   // Post-Condition: enemy is drawn
   // @param- graphics g is parameter
   // @return- n/a
   public void draw(Graphics g) 
   {
      ImageIcon enemy = new ImageIcon("Enemy.png"); 
      g.drawImage(enemy.getImage(), myX, myY, height, width, null);
   
   }
   
}
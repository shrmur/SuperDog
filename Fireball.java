import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fireball
{
   //graphics data
   private int myX;
   private int myY;
   private int height;
   private int width;
   
   //4-arg constructor
     //author:Sayemum 

   public Fireball(int x, int y)
   {
      myX=x;
      myY=y;
      height=10;
      width=40;
   }
   
   //Getter methods
   
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
   // @return- fireball height
   public int getHeight()
   {
      return height;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- fireball width
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
   // Pre-condition: paramter is an enemy
   // Post-Condition: enemy collided with fireball and enemy dies/goes off screen
   // @param- enemy object is the paramter 
   // @return- n/a
   public void collidedWithEnemy(Enemy enemy)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int StopLeftX=enemy.getX();
      int StopLeftY=enemy.getY();
      int StopRightX=enemy.getX()+enemy.getWidth();
      int StopRightY=enemy.getY();
   
      int SbottomRightX=enemy.getX()+enemy.getWidth();
      int SbottomRightY=enemy.getY()+enemy.getHeight();
      int SbottomLeftX=enemy.getX();
      int SbottomLeftY=enemy.getY()+enemy.getHeight();
   // if the dog collides at all
      if((topLeftX<=StopRightX&&topRightX>=SbottomLeftX&&topLeftY<=SbottomLeftY&&bottomLeftY>=StopLeftY))
      {
         enemy.setX(1000);
         enemy.setY(1000);
      
      }
   }
   
}
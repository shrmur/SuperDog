import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnemyTurtle extends Enemy
{
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
   

   public EnemyTurtle() //Author: Aidan
   {
      myX=50;
      myY=325;
      height=45;
      width=45;
   }
   //4-arg constructor
   public EnemyTurtle(int x, int y, int z, int a) //Author: Aidan
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   
   public void attack() //Author: Aidan
   {
      System.out.println("TURTLE ATTACK!!");
   }
   //author:Aidan Comi
   // Pre-condition: 
   // Post-Condition: returns current X value
   // @param-
   // @return- myX
   public int getX() 
   { 
      return myX;
   }
   //author:Aidan Comi
   // Pre-condition: 
   // Post-Condition: returns current Y value
   // @param-
   // @return- myY
   public int getY()      
   { 
      return myY;
   }
      //author:Aidan Comi
  //author:Aidan Comi
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- turtle height
   public int getHeight()
   {
      return height;
   }
      //author:Aidan Comi
   // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- turtle width
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
      //author:Aidan Comi
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets Y value to parameter
   // @param- integer Y is parameter
   // @return- n/a 
   public void setY(int y)
   {
      myY=y;
   }
      //author:Aidan Comi
// Pre-condition: height has to be an integer 
   // Post-Condition: sets height value to parameter
   // @param- integer h is parameter
   // @return- n/a
   public void setHeight(int h)
   {
      height = h;
   }
      //author:Aidan Comi
// Pre-condition: y has to be an integer 
   // Post-Condition: sets width value to parameter
   // @param- integer w is parameter
   // @return- n/a
   public void setWidth(int w)
   {
      width = w;
   }
   
   
   
   //draw
   public void draw(Graphics g) 
   {
      ImageIcon enemy = new ImageIcon("EvilTurtle.png"); //Image from: https://shutr.bz/3c4Q83N
      g.drawImage(enemy.getImage(), myX, myY, height, width, null);
   
   }
   
}
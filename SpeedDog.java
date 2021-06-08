import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SpeedDog extends Dog
{
//private instance data fields
// Author: Ahnaf Nibir
   private int myX;
   private int myY;
   private int height;
   private int width;
   private int rightEdge=600;
   private int bottomEdge=438;
   private boolean endOfLevel=false;
   private double gravity =0.0;
   private boolean jumping=false;
   private boolean falling=true;
   private double maxheight=80;
   private int counter=0;
   
   private boolean intersect=true;
   //constructors 
   // Author: Ahnaf Nibir
   
   //no-arg constructor
   // Author: Ahnaf Nibir
   public SpeedDog()
   {
      myX=25;// was 50
      myY=325;// was 325
      height=35;
      width=35;
   }
   
   //4-arg constructor
   // Author: Ahnaf Nibir
   public SpeedDog(int x, int y, int z, int a)
   {
      //super(x, y, z, a);
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   
   
   //methods
   //accesor methods
   // Pre-condition:
   // Post-Condition:
   // @param-n/a
   // @return- X value
    public int getX() 
   { 
      return myX;
   }
   //author:Shrish Murugapandi
   // Pre-condition:
   // Post-Condition:
   // @param-n/a
   // @return- Y value

   public int getY()      
   { 
      return myY;
   }
   // Pre-condition:
   // Post-Condition: sets x value equal to integer
   // @param- input integer
   // @return- n/a 

   public void setX(int x)
   {
      myX = x;
   } 
   //author:Shrish Murugapandi
   // Author: Ahnaf Nibir
   // Pre-condition:
   // Post-Condition: draws image of speed dog
   // @param- graphics g
   // @return- n/a 
   public void draw(Graphics g) 
   {
      ImageIcon dog = new ImageIcon("SpeedDoggo.png"); //Image from: https://bit.ly/3fvWETi     
      g.drawImage(dog.getImage(), myX, myY, height, width, null);
   }   
   
      
   //Sprint methods
   // Author: Ahnaf Nibir
   // Pre-condition:
   // Post-Condition: sets speed of Speed dog to 30
   // @param- n/a
   // @return- n/a 
   public void sprintRight()
   {
      setX(getX()+30);
   
      if(getX() >= rightEdge - width)     //hits the right edge
      {
          
         setX(rightEdge - width);
         endOfLevel=true;
      }
   }
    // Pre-condition:
   // Post-Condition: sets speed of Speed dog to 30
   // @param- n/a
   // @return- n/a 

   public void sprintLeft()
   {
      setX(getX()-30);
   
      if(getX() <=0)     //hits the left edge
      {
         setX(0); 
      }
   }
   // Pre-condition:
   // Post-Condition: sets mY to the value of paramter
   // @param- integer y
   // @return- n/a 

   public void setY(int y)
   {
      myY=y;
   } 
   // Pre-condition:
   // Post-Condition: sets height to the value of paramter
   // @param- integer y
   // @return- n/a 

   public void setHeight(int y)
   {
      height=y;
   } 
   // Pre-condition:
   // Post-Condition: sets width to the value of paramter
   // @param- integer y
   // @return- n/a
   public void setWidth(int y)
   {
      width=y;
   } 

  //author:Shrish Murugapandi, Ahnaf Nibir
   // Pre-condition: a key has to be clicked
   // Post-Condition: once either the up,left,or right key is clicked the speed dog then sprints
   // @param- Keyevent e
   // @return- n/a
   public void keyPressed(KeyEvent e)
   {
      int key= e.getKeyCode();
      // right                   
      if(key == KeyEvent.VK_RIGHT)
      {
         sprintRight();
         System.out.println("riiiiggghhhtt");
      }
      // jump
      if(key == KeyEvent.VK_UP)
      {   
         
         jumping=true;  
         falling=false; 
         gravity=10;
         System.out.println("uppppppppppp");
      
      
      // left    
      }
      if(key == KeyEvent.VK_LEFT)
      {
         sprintLeft();
         System.out.println("leeeeeeeeefffffffffttttt");
      
      }
     
      
      
         
     
   }
}
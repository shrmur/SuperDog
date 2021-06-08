import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FireDog extends Dog
{

//private instance data fields
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
   private boolean isCatAlive=true;
   
   private int numOfFireballs = 0;
   private boolean isInvincible = false;
   private boolean isThrowingFireball = false;
   private static final int INVINCIBILITY_TIME = 10;
   private static final int FIREBALL_TIME = 1;
   
   //constructors 
   //no-arg constructor
 
   //author:Sayemum 
  public FireDog()
   {
      myX=25;// was 50
      myY=325;// was 325
      height=35;
      width=35;
   }
   
    
   //4-arg constructor
   
   //author:Sayemum 
   public FireDog(int x, int y, int z, int a)
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
   // @return- dog height
   public int getHeight()
   {
      return height;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns current width value
   // @param-
   // @return- width
   public int getWidth()
   {
      return width;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns level status value
   // @param-
   // @return- level status boolean is returned 
   public boolean getLevelStatus()
   {
   
      return endOfLevel;
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: returns invincibility status value
   // @param-
   // @return- invincibility status boolean is returned 
   public boolean getInvincibleStatus()
   {
      return isInvincible;
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
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets Y value to parameter
   // @param- integer Y is parameter
   // @return- n/a
   public void setY(int y)
   {
      myY=y;
   } 
   
   //author:Sayemum 
   // Pre-condition:
   // Post-Condition: dog is drawn
   // @param- graphics g is parameter
   // @return- n/a
   public void draw(Graphics g) 
   {
      ImageIcon dog = new ImageIcon("FireDog.png"); //Image from: https://bit.ly/3fvWETi    
      g.drawImage(dog.getImage(), myX, myY, height, width, null);
   }   
   
   //author:Sayemum 
   // Pre-condition:
   // Post-Condition: cat status is returned
   // @param- 
   // @return- the cat status value
   public boolean getCatStatus()
   {
      return isCatAlive;
   }
   
   //author:Sayemum 
   // Pre-condition: paramter is a cat 
   // Post-Condition: cat collided with dog and dog dies/returns to spawn
   // @param- enemy cat object is the paramter 
   // @return- n/a
   public void collidedWithEnemyCat(EnemyCat cat)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int StopLeftX=cat.getX();
      int StopLeftY=cat.getY();
      int StopRightX=cat.getX()+cat.getWidth();
      int StopRightY=cat.getY();
   
      int SbottomRightX=cat.getX()+cat.getWidth();
      int SbottomRightY=cat.getY()+cat.getHeight();
      int SbottomLeftX=cat.getX();
      int SbottomLeftY=cat.getY()+cat.getHeight();
   // if the dog collides at all
      if((topLeftX<=StopRightX&&topRightX>=SbottomLeftX&&topLeftY<=SbottomLeftY&&bottomLeftY>=StopLeftY))
      {
         if (isInvincible == true)
         {
            isCatAlive=true;
         }
         else
         {
            setX(25);
            setY(325);
         }
      
      }
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: fireball will be thrown
   // @param- 
   // @return- n/a
   private void throwFireball()
   {
      
      if (isThrowingFireball == false)
      {
         System.out.println("Throwing Fireball");
         isThrowingFireball = true;
         
         Fireball fireball = new Fireball(getX(), getY());
         
         int currentLevel = DogPanel.getCurrentLevel();
         if (currentLevel == 1) {
            one lvl1 = DogPanel.getLvl1();
            for (Enemy e : one.getEnemies())
            {
               fireball.collidedWithEnemy(e);
            }
         }
         else if (currentLevel == 2) {
            two lvl2 = DogPanel.getLvl2();
            for (Enemy e : two.getEnemies())
            {
               fireball.collidedWithEnemy(e);
            }
         }
         else if (currentLevel == 3) {
            three lvl3 = DogPanel.getLvl3();
            for (Enemy e : three.getEnemies())
            {
               fireball.collidedWithEnemy(e);
            }
         }
         else if (currentLevel == 4) {
            four lvl4 = DogPanel.getLvl4();
            for (Enemy e : four.getEnemies())
            {
               fireball.collidedWithEnemy(e);
            }
         }
         
         isThrowingFireball = false;
      }
      
   }
   
   //author:Sayemum 
   // Pre-condition: 
   // Post-Condition: invincibility for the dog is activated
   // @param- 
   // @return- n/a
   private void goInvincible()
   {
      if (isInvincible == false)
      {
         System.out.println("Invincibility On");
         isInvincible = true;
      }
   }
   
   //author:Sayemum 
   // Pre-condition: input is recieved by user through keys up,left,and right
   // Post-Condition:  dog moves
   // @param- n/a
   // @return- n/a
   public void keyPressed(KeyEvent e)
   {
      int key= e.getKeyCode();
                         
      if(key == KeyEvent.VK_RIGHT)
      {
         moveRight();
      }
      
      if(key == KeyEvent.VK_UP)
      {   
         
         jumping=true;  
         falling=false; 
         gravity=10;
      
           
      }
      if(key == KeyEvent.VK_LEFT)
      {
         moveLeft();
      }
      
      if (key == KeyEvent.VK_Z)
      {
         goInvincible();
      }
      
      if (key == KeyEvent.VK_X)
      {
         throwFireball();
      }
   }
}
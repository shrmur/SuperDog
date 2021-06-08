import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dog
{
//private instance data fields

   private int myX;
   private int myY;
   private int height;
   private int width;
   private int rightEdge=600;
   private int bottomEdge=438;
   private boolean endOfLevel=false;
   private double gravity=0.0;
   private boolean jumping=false;
   private boolean falling=true;
   private double maxheight=80;
   private int counter=0;
   private boolean intersect=true;
   private boolean treatcollided=false;
   private boolean speedtreatcollided=false;
   
   //constructors 
   //no-arg constructor
   public Dog() //author:Shrish Murugapandi
   {
      myX=25;// was 50
      myY=325;// was 325
      height=35;
      width=35;
   }
   //4-arg constructor
   //author:Shrish Murugapandi
   public Dog(int x, int y, int z, int a)
   {
      myX=x;
      myY=y;
      height=z;
      width=a;
   }
   //methods
   //accesor methods
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
  //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns current height value
   // @param-
   // @return- dog height

   public int getHeight()
   {
      return height;
   }
   //author:Shrish Murugapandi
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
   // Pre-condition: 
   // Post-Condition: returns level status value
   // @param-
   // @return- level status boolean is returned 
   public boolean getLevelStatus()
   {
   
      return endOfLevel;
   }
  // modifier methods 
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets X value to parameter
   // @param- integer x is parameter
   // @return- n/a
   public void setX(int x)
   {
      myX = x;
   } 
   //author:Shrish Murugapandi
   // Pre-condition: x has to be an integer 
   // Post-Condition: sets Y value to parameter
   // @param- integer Y is parameter
   // @return- n/a

   public void setY(int y)
   {
      myY=y;
   } 
   //author:Shrish Murugapandi
// Pre-condition: height has to be an integer 
   // Post-Condition: sets height value to parameter
   // @param- integer y is parameter
   // @return- n/a

   public void setHeight(int y)
   {
      height=y;
   } 
   //author:Shrish Murugapandi
// Pre-condition: y has to be an integer 
   // Post-Condition: sets width value to parameter
   // @param- integer Y is parameter
   // @return- n/a

   public void setWidth(int y)
   {
      width=y;
   } 

//author:Shrish Murugapandi
// Pre-condition:
   // Post-Condition: dog is drawn
    // @param- graphics g is parameter
   // @return- n/a

//draw
   public void draw(Graphics g) 
   {
      ImageIcon dog = new ImageIcon("Dog.png"); //Image from: https://bit.ly/3fvWETi     
      g.drawImage(dog.getImage(), myX, myY, height, width, null);
   
   }   
   // Pre-condition: paramter is a speed treat 
   // Post-Condition: speed treat collided with dog and dog transforms
   // @param- speed treaat treat is the paramter 
   // @return- n/a

   //author:Shrish Murugapandi
 public void collidedWithSpeedTreat(SpeedTreat treat)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int StopLeftX=treat.getX();
      int StopLeftY=treat.getY();
      int StopRightX=treat.getX()+treat.getWidth();
      int StopRightY=treat.getY();
   
      int SbottomRightX=treat.getX()+treat.getWidth();
      int SbottomRightY=treat.getY()+treat.getHeight();
      int SbottomLeftX=treat.getX();
      int SbottomLeftY=treat.getY()+treat.getHeight();
   // if the dog collides at all
      if((topLeftX<=StopRightX&&topRightX>=SbottomLeftX&&topLeftY<=SbottomLeftY&&bottomLeftY>=StopLeftY))
      {
         speedtreatcollided=true;   
         //System.out.println("yes");   
      }
   }

   //author:Shrish Murugapandi
    // Pre-condition: paramter is a ground object 
   // Post-Condition:
   // @param- Ground object is the paramter 
   // @return- n/a

   public void collideGround(Ground ground)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int PtopLeftX=ground.getX();
      int PtopLeftY=ground.getY();
      int PtopRightX=ground.getX()+ground.getWidth();
      int PtopRightY=ground.getY();
   
      int PbottomRightX=ground.getX()+ground.getWidth();
      int PbottomRightY=ground.getY()+ground.getHeight();
      int PbottomLeftX=ground.getX();
      int PbottomLeftY=ground.getY()+ground.getHeight();
   // if the dog collides at all
      if((topLeftX<=PtopRightX&&topRightX>=PbottomLeftX&&topLeftY<=PbottomLeftY&&bottomLeftY>=PtopLeftY))
      {
      //make the falling false whenever on top of ground
      
      if(getY()+getHeight()>ground.getY()) 
         {
            falling=false;
            // if the dog is ever not on ground make the dog fall
            if(getX()+getWidth()<=ground.getX()||getX()>=ground.getX()+ground.getWidth())
            {
               falling=true;
            
            }
            
         }      
         
         
          }
   
   
   }
   //author:Shrish Murugapandi
 // Pre-condition: paramter is an integer 
   // Post-Condition: gravity is equal to the parameter
   // @param- int x is the paramter 
   // @return- n/a

   public void setGravity(int x)
   {
      gravity=x;
   }
    // Pre-condition:  
   // Post-Condition: gravity is on, as the dog falls he accelerates , and as he jumps he slows down due to gravity
   // @param- n/a 
   // @return- n/a

   public void enableGravity()
   {
      if(falling)
      {
         gravity+=0.4;
         setY(myY+(int)gravity);
      }
      
   
      if(jumping)
      {
         gravity-=0.4;
         
         setY(myY-(int)gravity);
         
         if(gravity<=0.0)
         {
            falling=true;
            jumping=false;
         }
      
      }
        
         
      if(!falling&&!jumping)
      {
         gravity=0.0;
         jumping=false;
         falling=true;
      }
                
   
   }
   //author:Shrish Murugapandi
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
         setX(25);
         setY(325);
      
      }
   }
   //author:Shrish Murugapandi
   // Pre-condition: paramter is a fire treat 
   // Post-Condition: fire treat collided with dog and dog transforms
   // @param- firetreat treat is the paramter 
   // @return- n/a

   public void collidedWithFireTreat(FireTreat treat)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int StopLeftX=treat.getX();
      int StopLeftY=treat.getY();
      int StopRightX=treat.getX()+treat.getWidth();
      int StopRightY=treat.getY();
   
      int SbottomRightX=treat.getX()+treat.getWidth();
      int SbottomRightY=treat.getY()+treat.getHeight();
      int SbottomLeftX=treat.getX();
      int SbottomLeftY=treat.getY()+treat.getHeight();
   // if the dog collides at all
      if((topLeftX<=StopRightX&&topRightX>=SbottomLeftX&&topLeftY<=SbottomLeftY&&bottomLeftY>=StopLeftY))
      {
         treatcollided=true;   
         //System.out.println("yes");   
      }
   }
  //author:Shrish Murugapandi
   // Pre-condition: dog collides with treat
   // Post-Condition:  dog collided with treat
   // @param-n/a 
   // @return- treatcollided boolean is returned 

   public boolean getTreatCollidedinfo()
   {
      return treatcollided;
   } 
  //author:Shrish Murugapandi
  // Pre-condition: dog collides with treat
   // Post-Condition: dog collided with treat
   // @param- n/a
   // @return- speedtreatcollided boolean is returned 


   public boolean getSpeedTreatCollidedinfo()
   {
      return speedtreatcollided;
   } 
//author:Shrish Murugapandi
    // Pre-condition: 
   // Post-Condition: dog collides with spike and returns to spawn
   // @param- Spike spike is the paramter
   // @return- n/a

   public void collidedWithSpike(Spikes spike)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int StopLeftX=spike.getX();
      int StopLeftY=spike.getY();
      int StopRightX=spike.getX()+spike.getWidth();
      int StopRightY=spike.getY();
   
      int SbottomRightX=spike.getX()+spike.getWidth();
      int SbottomRightY=spike.getY()+spike.getHeight();
      int SbottomLeftX=spike.getX();
      int SbottomLeftY=spike.getY()+spike.getHeight();
   // if the dog collides at all
      if((topLeftX<=StopRightX&&topRightX>=SbottomLeftX&&topLeftY<=SbottomLeftY&&bottomLeftY>=StopLeftY))
      {
         setX(25);
         setY(325);
      
      }
   }

   //author:Shrish Murugapandi
   // Pre-condition:dog is going to collide with platform 
   // Post-Condition: dog collided with platform
   // @param-  platform is the parameter
   // @return-    
   public void hasCollided(Platform platform)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int PtopLeftX=platform.getX();
      int PtopLeftY=platform.getY();
      int PtopRightX=platform.getX()+platform.getWidth();
      int PtopRightY=platform.getY();
   
      int PbottomRightX=platform.getX()+platform.getWidth();
      int PbottomRightY=platform.getY()+platform.getHeight();
      int PbottomLeftX=platform.getX();
      int PbottomLeftY=platform.getY()+platform.getHeight();
   // if the dog collides at all
      if((topLeftX<=PtopRightX&&topRightX>=PbottomLeftX&&topLeftY<=PbottomLeftY&&bottomLeftY>=PtopLeftY))
      {
      //make the falling false whenever on top of platform
         if(getY()+getHeight()>platform.getY()) 
         {
            falling=false;
            // if the dog is ever not on platform make the dog fall
            if(getX()+getWidth()<=platform.getX()||getX()>=platform.getX()+platform.getWidth())
            {
               falling=true;
            
            }
            
         }  
      }
   }
   //author:Shrish Murugapandi
    // Pre-condition: dog is going to collide with turtle
   // Post-Condition: dog collided with turtle 
   // @param- turtle is the parameter
   // @return-n/a


   public void collidedWithEnemyTurtle(EnemyTurtle turtle)
   {
      int topLeftX=getX() ;
      int topLeftY=getY() ;
      int topRightX=getX()+getWidth();
      int topRightY=getY();
      
      int bottomRightX=getX()+getWidth();
      int bottomRightY=getY()+getHeight();
      int bottomLeftX=getX();
      int bottomLeftY=getY()+getHeight();
   
      int PtopLeftX=turtle.getX();
      int PtopLeftY=turtle.getY();
      int PtopRightX=turtle.getX()+turtle.getWidth();
      int PtopRightY=turtle.getY();
   
      int PbottomRightX=turtle.getX()+turtle.getWidth();
      int PbottomRightY=turtle.getY()+turtle.getHeight();
      int PbottomLeftX=turtle.getX();
      int PbottomLeftY=turtle.getY()+turtle.getHeight();
   // if the dog collides at all
      if((topLeftX<=PtopRightX&&topRightX>=PbottomLeftX&&topLeftY<=PbottomLeftY&&bottomLeftY>=PtopLeftY))
      {
      //make the falling false whenever on top of platform
         if(getY()+getHeight()>turtle.getY()) 
         {
            falling=false;
            // if the dog is ever not on platform make the dog fall
            if(getX()+getWidth()<=turtle.getX()||getX()>=turtle.getX()+turtle.getWidth())
            {
               falling=true;
            
            }
            
         }  
      }
   }
   //author:Shrish Murugapandi
    // Pre-condition: dog has to be created
   // Post-Condition:  dog moves 8 pixels to the right 
   // @param- n/a
   // @return- n/a

   //move methods
   public void moveRight()
   {
      setX(getX()+8);
   
      if(getX() >= rightEdge - width)     //hits the right edge
      {
          
         setX(rightEdge - width);
         endOfLevel=true;
      }
   }
   //author:Shrish Murugapandi
  // Pre-condition: dog has to be created
   // Post-Condition:  dog moves 8 pixels to the left 
   // @param- n/a
   // @return- n/a

   public void moveLeft()
   {
      setX(getX()-8);
   
      if(getX() <=0)     //hits the left edge
      {
         setX(0); 
      }
   
   }
   //author:Shrish Murugapandi
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
         System.out.println("right");
      }
      
      if(key == KeyEvent.VK_UP)
      {   
         
         jumping=true;  
         falling=false; 
         gravity=10;
         System.out.println("up");
      
           
      }
      if(key == KeyEvent.VK_LEFT)
      {
         moveLeft();
         System.out.println("left");
      
      }
   }

 
}

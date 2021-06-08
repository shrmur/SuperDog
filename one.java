import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class one
{
   //instance data
   private Dog dog;
   private FireDog firedog;
   private Ground ground;
   private Platform p; 
   private Platform p1;
   private Platform p2;
   private Platform p3;
   private Platform p4;
   private Platform p5;
   private Platform p6;
   private Platform p7;
   private Platform p8;
   private Platform p9;
   private Spikes spike1;
   private Spikes spike2;
   private Spikes spike3;
   private Spikes spike4;
   private Spikes spike5;
   private Spikes spike6;
   private Spikes spike7;
   private Spikes spike8;
   private Spikes spike9;
   private Sign sign;
   private Spikes spike10;
   private EnemyTurtle turtle;
   private EnemyCat cat;
   private static ArrayList<Enemy> enemies;
   private FireTreat fireTreat1; 
   private boolean hasCollided;
    //author:Shrish Murugapandi,Sayemum
  
   public one()
   {
      ground = new Ground();
      spike1 = new Spikes();
      sign = new Sign();
      spike2 = new Spikes(150,350,55,50);// 350 to 300 and 70 to 170
      spike3 = new Spikes(200,350,55,50);
      spike4 = new Spikes(250,350,55,50);
      spike5 = new Spikes(300,350,55,50);
      spike6= new Spikes(350,350,55,50);
      spike7= new Spikes(400,350,55,50);
      spike8= new Spikes(450,350,55,50);
      spike9= new Spikes(450,350,55,50);
      p= new Platform(60,310,10,300);//
      p1= new Platform(180,150,10,30);
      p2 = new Platform(230,250,10,20);
      p3 = new Platform(70,120,10,30);
      p4  = new Platform(90,160,10,50);
      p5  = new Platform(110,270,10,40);
      p6  = new Platform(270,200,10,30);
      p7 = new Platform(140, 75,10,160);
      p8 = new Platform(350,125,10,90);
      p9 = new Platform(475,300,10,50);
      dog= new Dog();
      turtle = new EnemyTurtle(160,40,40,40);
      cat = new EnemyCat(400,100,30,30);
      firedog = new FireDog();
      fireTreat1 = new FireTreat();
      enemies = new ArrayList<Enemy>();
      enemies.add(turtle);
      enemies.add(cat);
   }
     //author:Shrish Murugapandi
   // Pre-condition:
   // Post-Condition: Level is drawn will all the objects obejcts will be drawn and redrawn based off of their place on the map and whether they are colliding with objects 
   // @param- Graphics g is the paramter
   // @return- n/a
   public void draw(Graphics g) 
   {
      Image level;
      level = new ImageIcon("Level1.jpg").getImage(); //Image from: https://bit.ly/3vyikDW
      g.drawImage(level,0 , 0, 600 ,438 , null);
      ground.draw(g);
      spike1.draw(g);
      spike2.draw(g);
      spike3.draw(g);
      spike4.draw(g);
      spike5.draw(g); 
      spike6.draw(g);
      spike7.draw(g);
      spike8.draw(g);
      spike9.draw(g);
      p.draw(g);
      p1.draw(g);
      p2.draw(g);
      p3.draw(g);
      p5.draw(g);
      p4.draw(g);
      p6.draw(g);
      p7.draw(g);
      p8.draw(g);
      p9.draw(g);
      sign.draw(g);
      turtle.draw(g);
      cat.draw(g);
      collideFireTreat(dog,fireTreat1);
   
      if(dog.getTreatCollidedinfo()==false)
      {
         dog.draw(g);
         fireTreat1.draw(g);
      }
      dog.collideGround(ground);
      collidePlatform(dog,p);
      collidePlatform(dog,p1);
      collidePlatform(dog,p2);
      collidePlatform(dog,p3);
      collidePlatform(dog,p4);
      collidePlatform(dog,p5);
      collidePlatform(dog,p6);
      collidePlatform(dog,p7);
      collidePlatform(dog,p8);
      collidePlatform(dog,p9);     
      dog.collidedWithSpike(spike1);
      dog.collidedWithSpike(spike2);
      dog.collidedWithSpike(spike3);
      dog.collidedWithSpike(spike4);
      dog.collidedWithSpike(spike5);
      dog.collidedWithSpike(spike6);
      dog.collidedWithSpike(spike7);
      dog.collidedWithSpike(spike8);
      dog.collidedWithSpike(spike9);
      dog.collidedWithEnemyCat(cat);
      dog.collidedWithEnemyTurtle(turtle);
      
      
      
      
      if(dog.getTreatCollidedinfo()==true)
      { 
         firedog.setX(dog.getX());
         firedog.setY(dog.getY());
         firedog.setHeight(dog.getHeight());
         firedog.setWidth(dog.getWidth());
         firedog.draw(g);
      }
      firedog.collideGround(ground);
      collidePlatform(firedog,p);
      collidePlatform(firedog,p1);
      collidePlatform(firedog,p2);
      collidePlatform(firedog,p3);
      collidePlatform(firedog,p4);
      collidePlatform(firedog,p5);
      collidePlatform(firedog,p6);
      collidePlatform(firedog,p7);
      collidePlatform(firedog,p8);
      collidePlatform(firedog,p9);     
      firedog.collidedWithSpike(spike1);
      firedog.collidedWithSpike(spike2);
      firedog.collidedWithSpike(spike3);
      firedog.collidedWithSpike(spike4);
      firedog.collidedWithSpike(spike5);
      firedog.collidedWithSpike(spike6);
      firedog.collidedWithSpike(spike7);
      firedog.collidedWithSpike(spike8);
      firedog.collidedWithSpike(spike9);
      firedog.collidedWithEnemyCat(cat);
      firedog.collidedWithEnemyTurtle(turtle);
      
      
      
      
   
        
      
   }
        //author:Shrish Murugapandi
   // Pre-condition: dog has to have collided with the treat 
   // Post-Condition: returns true of false depending on if the dog has collided with the treat
   // @param- n/a
   // @return- true is returned when the dog has collided with treat , false is returned when the dog has not collided with the treat
   public boolean hasTreatCollidedWithDog()
   {
      if(dog.getTreatCollidedinfo()==true)
      {
         return true;  
      }
      else
      {
         return false;
      }
   }
   // Pre-condition: has to have collided with platform
   // Post-Condition: checks if dog has collided with platform
   // @param- dog and platform 
   // @return- n/a
      //author:Shrish Murugapandi

   public void collidePlatform(Dog dog, Platform platform)
   {  
   
      dog.hasCollided(platform);
   }
   //author:Shrish Murugapandi
 // Pre-condition: Dog has to have collided with firetreat
   // Post-Condition: checks if dog has collided with treat
   // @param- dog and treat 
   // @return- n/a

   public void collideFireTreat(Dog dog, FireTreat treat)
   {  
   
      dog.collidedWithFireTreat(treat);
   }
        //author:Sayemum
// Pre-condition: Dog has to have collided with cat
   // Post-Condition: checks if dog has collided with cat
   // @param- dog and cat 
   // @return- n/a

   public void collideCat(Dog dog, EnemyCat cat)
   {
      dog.collidedWithEnemyCat(cat);
   }
   // Pre-condition: Dog has to have collided with turtle
   // Post-Condition: checks if dog has collided with turtle
   // @param- dog and turtle 
   // @return- n/a

        //author:Sayemum
   public void collideTurtle(Dog dog, EnemyTurtle turtle)
   {
      dog.collidedWithEnemyTurtle(turtle);
   }
   
   // Pre-condition: 
   // Post-Condition: returns enemies in arraylist
   // @param-
   // @return- enemies arraylist
        //author:Sayemum
   public static ArrayList<Enemy> getEnemies()
   {
      return enemies;
   }
         //author:Shrish Murugapandi
  // Pre-condition: 
   // Post-Condition: returns enemies in arraylist
   // @param-
   // @return- enemies arraylist

   public Dog getDogType()
   {
      return dog;
   }
        //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: gets firedog from level
   // @param-
   // @return- returns firedog from level
   public FireDog getFireDog()
   {
      return firedog;
   }
     //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: the dog and fire dog key pressed functions are invoked
   // @param- key input
   // @return- n/a
     //keylistener 
   public void keyPressed(KeyEvent e)
   {
      dog.keyPressed(e);
      firedog.keyPressed(e);
   }
  

}
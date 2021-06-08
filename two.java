import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class two
{  
   //instannce data
   // Author: Ahnaf Nibir
   private Dog dog1;
   private Ground ground; 
   private Platform p1;
   private Platform p2;
   private Platform p3;
   private Platform p4;
   private Platform p5;
   private Platform p6;
   private Platform p7;
   private Spikes spike1;
   private Spikes spike2;
   private Spikes spike3;
   private Spikes spike4;
   private Spikes spike5;
   private Spikes spike6;
   private Sign sign;
   private EnemyTurtle turtle;
   private EnemyCat cat;
   private static ArrayList<Enemy> enemies;
   
   // level info 
   // Author: Ahnaf Nibir
   public two()
   {
      ground = new Ground();
      dog1=new Dog();
      p1= new Platform(100,310,10,50);
      p2 = new Platform(190,320,10,100);
      p3 = new Platform(280,270,10,70);
      p4  = new Platform(90,160,10,50);
      p5  = new Platform(270,200,10,30);
      p6 = new Platform(140, 75,10,160);
      p7 = new Platform(350,125,10,90);
      sign=new Sign();
      spike1 = new Spikes();
      spike2 = new Spikes(460,350, 55,50);
      spike3 = new Spikes(300,350,55,50);
      spike4= new Spikes(350,350,55,50);
      turtle = new EnemyTurtle(160,40,40,40);
      cat = new EnemyCat(400,95,30,30);
      enemies = new ArrayList<Enemy>();
      enemies.add(turtle);
      enemies.add(cat);
      
   }
   
   //draw
   // Author: Ahnaf Nibir
   // Pre-condition:
   // Post-Condition: Level is drawn will all the objects obejcts will be drawn and redrawn based off of their place on the map and whether they are colliding with objects 
   // @param- Graphics g is the paramter
   // @return- n/a
   public void draw(Graphics g) 
   {
      
      Image level;
      level = new ImageIcon("Level2.png").getImage(); //Image from: https://bit.ly/3pevsMp
      g.drawImage(level,0 , 0, 600 ,438 , null);
      dog1.draw(g);
      ground.draw(g);
      spike1.draw(g);
      spike2.draw(g);
      spike3.draw(g);
      spike4.draw(g);
      p1.draw(g);
      p2.draw(g);
      p3.draw(g);
      p5.draw(g);
      p4.draw(g);
      p6.draw(g);
      p7.draw(g);
      sign.draw(g);
      turtle.draw(g);
      cat.draw(g);
      
      dog1.collideGround(ground);
      
    
      collidePlatform(dog1,p1);
      collidePlatform(dog1,p2);
      collidePlatform(dog1,p3);
      collidePlatform(dog1,p4);
      collidePlatform(dog1,p5);
      collidePlatform(dog1,p6);
      collidePlatform(dog1,p7);
      dog1.collidedWithSpike(spike1);
      dog1.collidedWithSpike(spike2);
      dog1.collidedWithSpike(spike3);
      dog1.collidedWithSpike(spike4);
      dog1.collidedWithEnemyCat(cat);
      dog1.collidedWithEnemyTurtle(turtle);
   
        
           
      
   }
   
   //author:Sayemum Hassan
   // Pre-condition: has to have collided with platform
   // Post-Condition: checks if dog has collided with platform
   // @param- dog and platform 
   // @return- n/a
   public void collidePlatform(Dog dog1, Platform platform)
   {  
      dog1.hasCollided(platform);
   }
   
   //author:Sayemum Hassan
   // Pre-condition: Dog has to have collided with cat
   // Post-Condition: checks if dog has collided with cat
   // @param- dog and cat 
   // @return- n/a
   public void collideCat(Dog dog, EnemyCat cat)
   {
      dog.collidedWithEnemyCat(cat);
   }
   
   // author: Sayemum Hassan
   // Pre-condition: Dog has to have collided with turtle
   // Post-Condition: checks if dog has collided with turtle
   // @param- dog and turtle 
   // @return- n/a
   public void collideTurtle(Dog dog, EnemyTurtle turtle)
   {
      dog.collidedWithEnemyTurtle(turtle);
   }
   
   // author: Sayemum Hassan
   // Pre-condition: 
   // Post-Condition: returns enemies in arraylist
   // @param-
   // @return- enemies arraylist
   public static ArrayList<Enemy> getEnemies()
   {
      return enemies;
   }
   
   // author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: returns enemies in arraylist
   // @param-
   // @return- enemies arraylist
   public Dog getDogType()
   {
      return dog1;
   }
   
   //author:Shrish Murugapandi
   // Pre-condition: 
   // Post-Condition: the dog and fire dog key pressed functions are invoked
   // @param- key input
   // @return- n/a
   public void keyPressed(KeyEvent e)
   {
      dog1.keyPressed(e);
   }

   
}
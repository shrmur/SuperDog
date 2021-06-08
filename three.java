import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class three
{  
   // instance data
   private Dog dog1;
   private Ground ground; 
   private Platform platform1;
   private Platform platform2;
   private Platform platform3;
   private Platform platform4;
   private Platform platform5;
    private Platform platform6;
   private Platform platform7;
   private Platform platform8;
   private Spikes spike1;
   private Spikes spike2;
   private Spikes spike3;
   private Spikes spike4;
   private Sign sign;
   private EnemyTurtle turtle;
   private EnemyCat cat;
   private static ArrayList<Enemy> enemies;
 
   //level info
   public three() //Author: Aidan
   {
      ground = new Ground();
      dog1=new Dog();
      platform1= new Platform(200,200,10,50);
      platform2 = new Platform(300,100,10,50);
      platform3 = new Platform(100,250,10,50);
      platform4  = new Platform(250,150,10,50);
      platform5  = new Platform(50,300,10,50);
      platform6 = new Platform(350,250,10,50);
      platform7 = new Platform(400,200,10,50);
      platform8  = new Platform(450,150,10,50);
      sign=new Sign();
      spike1 = new Spikes();
      spike2 = new Spikes(200,350, 55,50);
      spike3 = new Spikes(350,350,55,50);
      spike4= new Spikes(500,350,55,50);
      turtle = new EnemyTurtle(270,110,40,40);
      cat = new EnemyCat(450,120,30,30);

      enemies = new ArrayList<Enemy>();
      enemies.add(turtle);
      enemies.add(cat);
     
      
   }
        //author:Aidan Comi
   // Pre-condition:
   // Post-Condition: Level is drawn with objects and collision boxes
   // @param- Graphics g is the paramter
   // @return- n/a
   public void draw(Graphics g) //Author: Aidan
   {
      
      Image level;
      level = new ImageIcon("Level3.jpeg").getImage(); //Image from: https://bit.ly/34uq5ip
      g.drawImage(level,0 , 0, 600 ,438 , null);
      dog1.draw(g);
      ground.draw(g);
      spike1.draw(g);
      spike2.draw(g);
      spike3.draw(g);
      spike4.draw(g);
      turtle.draw(g);
      platform1.draw(g);
      platform2.draw(g);
      platform3.draw(g);
      platform4.draw(g);
      platform5.draw(g);
      platform6.draw(g);
      platform7.draw(g);
      platform8.draw(g);
      sign.draw(g);
      cat.draw(g);
           dog1.collideGround(ground);
      collidePlatform(dog1,platform1);
      collidePlatform(dog1,platform2);
      collidePlatform(dog1,platform3);
      collidePlatform(dog1,platform4);
      collidePlatform(dog1,platform5);
      collidePlatform(dog1,platform6);
      collidePlatform(dog1,platform7);
      collidePlatform(dog1,platform8);

      dog1.collidedWithSpike(spike1);
      dog1.collidedWithSpike(spike2);
      dog1.collidedWithSpike(spike3);
      dog1.collidedWithSpike(spike4);
 dog1.collidedWithEnemyCat(cat);
 dog1.collidedWithEnemyTurtle(turtle);

           
      
   }
      // Pre-condition: dog has to have collided with platform
   // Post-Condition: checks if dog has collided with platform
   // @param- dog and platform 
   // @return- n/a
   public void collidePlatform(Dog dog1, Platform platform)
   {  
   
      dog1.hasCollided(platform);
   }
   // Pre-condition: Dog has to have collided with cat
   // Post-Condition: checks if dog has collided with cat
   // @param- dog and cat 
   // @return- n/a
   public void collideCat(Dog dog, EnemyCat cat)
   {
      dog.collidedWithEnemyCat(cat);
   }   
      // Post-Condition: checks if dog has collided with turtle
   // @param- dog and turtle 
   // @return- n/a
   public void collideTurtle(Dog dog, EnemyTurtle turtle)
   {
      dog.collidedWithEnemyTurtle(turtle);
   }
      // Pre-condition: 
   // Post-Condition: returns enemies in arraylist
   // @param-
   // @return- enemies arraylist
   public static ArrayList<Enemy> getEnemies()
   {
      return enemies;
   }
  // Pre-condition: 
   // Post-Condition: returns the type of dog on screen
   // @param-
   // @return- dog type
   public Dog getDogType()
   {
      return dog1;
   
   
   }
      // Pre-condition: 
   // Post-Condition: the dog and fire dog key pressed functions are invoked
   // @param- key input
   // @return- n/a
   public void keyPressed(KeyEvent e)
   {
      dog1.keyPressed(e);
   }

   
}
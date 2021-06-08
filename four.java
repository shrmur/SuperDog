import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class four
{

   //Instance Date
   // Author: Ahnaf Nibir , Aidan Comi
   private Dog dog1;
   private Ground ground;
   private Platform plat1;
   private Platform plat2;
   private Platform plat3;
   private Platform plat4;
   private Platform plat5;
   private SpeedTreat speedTreat;
   private Platform plat6;
   private SpeedDog speeddog;
   private Spikes spike1;
   private Spikes spike2;
   private Spikes spike3;
   private Spikes spike4;
   private Spikes spike5;
   private Spikes spike6;
   private Spikes spike7;
   private EnemyTurtle turtle;
   private Spikes spike8;
   private EnemyCat cat;
   private static ArrayList<Enemy> enemies;
   
   //level info 
   // Author: Ahnaf Nibir, Aidan Calmi
   public four()
   {
      
      dog1=new Dog();
      ground= new Ground();
      
      plat1 = new Platform(150,300,10,40);
      plat2 = new Platform(250,250,10,40);
      plat3 = new Platform(320,320,10,40);
      plat4 = new Platform(340,200,10,100);
      plat5 = new Platform(450,150,10,40);
      
      plat6 = new Platform(200,275,10,30);
      
      spike1 = new Spikes(150,350,55,50);
      spike2 = new Spikes(200,350, 55,50);
      spike3 = new Spikes(250,350, 55,50);
      spike4 = new Spikes(300,350, 55,50);
      spike5 = new Spikes(350,350, 55,50);
      spike6 = new Spikes(400,350, 55,50);
      spike7 = new Spikes(450,350, 55,50);
      turtle= new EnemyTurtle(350,180,40,40);
      spike8 = new Spikes(200,260, 30,15);
      cat = new EnemyCat(450,120,30,30);
      speedTreat= new SpeedTreat();
      speeddog=new SpeedDog();
      enemies = new ArrayList<Enemy>();
      enemies.add(turtle);
      enemies.add(cat);
      
   }
   //draw
   // Author: Ahnaf Nibir , Aidan Calmi 
   // Pre-condition:
   // Post-Condition: Level is drawn with objects and collision boxes
   // @param- Graphics g is the paramter
   // @return- n/a

   public void draw(Graphics g) 
   {
      
      Image level;
      level = new ImageIcon("Level4.jpg").getImage(); //Image from: https://bit.ly/2SFc4f4
      g.drawImage(level,0 , 0, 600 ,438 , null);
      //dog1.draw(g);
      ground.draw(g);   
      plat1.draw(g);
      plat2.draw(g);
      plat3.draw(g);
      plat4.draw(g);
      plat5.draw(g);
      plat6.draw(g);
      turtle.draw(g);
      spike1.draw(g);
      spike2.draw(g);
      spike3.draw(g);
      spike4.draw(g);
      spike5.draw(g);
      spike6.draw(g);
      spike7.draw(g);
      cat.draw(g);
   
      spike8.draw(g);
      
      collideSpeedTreat(dog1,speedTreat);
   
      
      if(dog1.getSpeedTreatCollidedinfo()==false)
      {
         dog1.draw(g);
         speedTreat.draw(g);
      }
   
      dog1.collideGround(ground);
      
      collidePlatform(dog1,plat1);
      collidePlatform(dog1,plat2);
      collidePlatform(dog1,plat3);
      collidePlatform(dog1,plat4);
      collidePlatform(dog1,plat5);
      collidePlatform(dog1,plat6);
            
      dog1.collidedWithSpike(spike1);
      dog1.collidedWithSpike(spike2);
      dog1.collidedWithSpike(spike3);
      dog1.collidedWithSpike(spike4);
      dog1.collidedWithSpike(spike5);
      dog1.collidedWithSpike(spike6);
      dog1.collidedWithSpike(spike7);
      dog1.collidedWithSpike(spike8);
         
      dog1.collidedWithEnemyCat(cat);
      dog1.collidedWithEnemyTurtle(turtle);
    
      if(dog1.getSpeedTreatCollidedinfo()==true)
      { 
         speeddog.setX(dog1.getX());
         speeddog.setY(dog1.getY());
         speeddog.setHeight(dog1.getHeight());
         speeddog.setWidth(dog1.getWidth());
         speeddog.draw(g);
      }
      
      speeddog.collideGround(ground);
      collidePlatform(speeddog,plat1);
      collidePlatform(speeddog,plat2);
      collidePlatform(speeddog,plat3);
      collidePlatform(speeddog,plat4);
      collidePlatform(speeddog,plat5);
      collidePlatform(speeddog,plat6);
      collideSpeedTreat(speeddog,speedTreat);
      
      speeddog.collidedWithSpike(spike1);
      speeddog.collidedWithSpike(spike2);
      speeddog.collidedWithSpike(spike3);
      speeddog.collidedWithSpike(spike4);
      speeddog.collidedWithSpike(spike5);
      speeddog.collidedWithSpike(spike6);
      speeddog.collidedWithSpike(spike7);
      speeddog.collidedWithSpike(spike8);
         
      speeddog.collidedWithEnemyCat(cat);
      speeddog.collidedWithEnemyTurtle(turtle);
    
   
   
           
      
   }
   
   public void collideSpeedTreat(Dog dog, SpeedTreat treat)
   {  
   
      dog.collidedWithSpeedTreat(treat);
   }

   public void collidePlatform(Dog dog1, Platform platform)
   {  
   
      dog1.hasCollided(platform);
   }
      
   public void collideCat(Dog dog, EnemyCat cat)
   {
      dog.collidedWithEnemyCat(cat);
   }
   
   public void collideTurtle(Dog dog, EnemyTurtle turtle)
   {
      dog.collidedWithEnemyTurtle(turtle);
   }
   
   public static ArrayList<Enemy> getEnemies()
   {
      return enemies;
   }
   
   public Dog getDogType()
   {
      return dog1;
   
   
   }
        //author:Shrish Murugapandi

   public SpeedDog getSpeedDogType()
   {
      return speeddog;
   
   
   }
     //author:Shrish Murugapandi

   public void keyPressed(KeyEvent e)
   {
      dog1.keyPressed(e);
      speeddog.keyPressed(e);
   }

   
}
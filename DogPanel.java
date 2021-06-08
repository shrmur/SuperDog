import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DogPanel extends JPanel
{

   private Timer t;
   private static one Lvl1=new one();
   private static two Lvl2=new two();
   private static three Lvl3= new three();
   private static four Lvl4 = new four();;
   private static int currentLevel=0;
   public DogPanel()
   {
   //instaniate dog and ground
      
      t = new Timer(10, new Listener());
      t.start();
      addKeyListener(new Key());
      setFocusable(true);
      currentLevel=1;
      
                  
   }
   //author:Shrish Murugapandi

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      if(currentLevel==1)
      {
         Lvl1.draw(g);
         repaint();
      }
      if(currentLevel==2)
      {
         repaint();
         Lvl2.draw(g);
      }
      if(currentLevel==3)
      {
         repaint();
         Lvl3.draw(g);
      }
      if(currentLevel==4)
      {
         repaint();
      
         Lvl4.draw(g);
      
      }
   }
   //Author:Sayemum 
   public static one getLvl1()
   {
      return Lvl1;
   }
   public static two getLvl2()
   {
      return Lvl2;
   }
   public static three getLvl3()
   {
      return Lvl3;
   }
   public static four getLvl4()
   {
      return Lvl4;
   }
   public static int getCurrentLevel()
   {
      return currentLevel;
   }
                          
   //author:Shrish Murugapandi

  //action listener 
   private class Listener implements ActionListener
   {//methods is performed with each timer
      public void actionPerformed(ActionEvent e)
      { 
      
         if(currentLevel==1)
         {
         
            Lvl1.getDogType().enableGravity(); 
            Lvl1.getFireDog().enableGravity();
         }
         else if(currentLevel==2)
         {
            Lvl2.getDogType().enableGravity();
         }
         else if(currentLevel==3)
         {
            Lvl3.getDogType().enableGravity(); 
         } 
         else
         {
            Lvl4.getDogType().enableGravity();
            Lvl4.getSpeedDogType().enableGravity();
         }
        
         repaint();
      
      }
   }
   //author:Shrish Murugapandi

   private class Key extends KeyAdapter
   { 
   
   
      public void keyPressed(KeyEvent e)
      {
         if(currentLevel==1)
         {
            Lvl1.getDogType().keyPressed(e);
           
            Lvl1.getFireDog().keyPressed(e);
            if (Lvl1.getDogType().getLevelStatus()==true)
            {
               currentLevel=2;
            }
         
         }
         
         if(currentLevel==2)
         {
            Lvl2.getDogType().keyPressed(e);
            if (Lvl2.getDogType().getLevelStatus()==true)
            {
            
               currentLevel=3;
            }
         
         }
         if(currentLevel==3)
         {
            Lvl3.getDogType().keyPressed(e);
            if (Lvl3.getDogType().getLevelStatus()==true)
            {
            
               currentLevel=4;
            }
         
         }
         if(currentLevel==4)
         {
            Lvl4.getSpeedDogType().keyPressed(e);
            Lvl4.getDogType().keyPressed(e);
            repaint();
         }
      
      }
   }
 
}


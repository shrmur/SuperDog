import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sign
{
   private int myX;
   private int myY;
   private int height;
   private int width;
   
   //author:Shrish Murugapandi
   public Sign()
   {
   myX=540;
   myY=335;
   height=40;
   width=40;
   }
   
   //author:Shrish Murugapandi
   // Pre-condition:
   // Post-Condition: Sign is drawn at the end of each level indicating to continue forward.
   // @param- Graphics g
   // @return- n/a
   public void draw(Graphics g) 
   {
      ImageIcon sign = new ImageIcon("sign.png"); //Image from: https://bit.ly/3fVx4WX
      g.drawImage(sign.getImage(), myX, myY, height, width, null);
   
   }

}
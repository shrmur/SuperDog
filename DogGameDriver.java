 import javax.swing.JFrame;
    public class DogGameDriver
   {
     //author:Shrish Murugapandi
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("SuperDog");
         frame.setSize(600, 438);    
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new DogPanel());
         frame.setVisible(true);
         
      }
   }

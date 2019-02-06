import javax.swing.*;      //importing javax.swing package
import java.awt.*;         //importing java.awt package
import java.awt.event.*;   //importing java.awt.event package

/**
 * Listener class called ResetListener for GUI JFrame called MyEventC 
 * @authors: Sira, Omar, Baha 
 * @version 1.0
 */

public class ResetListener extends JFrame
{
   private JButton jbReset;
   
   public ResetListener()
   {
      jbReset = new JButton ("Reset");
      ResetHandler rh = new ResetHandler();
      jbReset.addActionListener(rh);
      
      //not sure if need to include this?
      //setLayout(new FlowLayout());
      //add jbReset;
      //setTitle()
   }
   
   public static void main (String[] args)
   {
      ResetListener R1 = new ResetListener();
      R1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
   }
}
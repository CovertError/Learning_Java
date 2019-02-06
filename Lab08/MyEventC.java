import javax.swing.*;      //importing javax.swing package
import java.awt.*;         //importing java.awt package
import java.awt.event.*;   //importing java.awt.event package
import java.io.*;          //importing java.io package

/**
 * GUI JFrame called MyEventC that contains labels, text fields and buttons
 *  
 * 
 * @authors: Sira, 
 * @version 1.0
 */

public class MyEventC extends JFrame implements ActionListener 
{
   public JTextField jtfValue;
   public JButton jbPlus;
   public JButton jbSubtract;
   public JButton jbReset;
   public JButton jbQuit;
   int counter=0;

   public MyEventB()
   {
      setLayout(new BorderLayout(5,10));    //set JFrame's layout to BorderLayout with horizontal gap 5 and vertical gap 10

      JPanel jpNorth = new JPanel(new FlowLayout(FlowLayout.CENTER));  //create a JPanel with FlowLayout for the North of the JFrame's BorderLayout
      jpNorth.add(new JLabel("Current Value: ", JLabel.RIGHT));   //add components (labels and text fields) to the panel in the north (jpNorth panel)
      jtfValue = new JTextField("0", 5);      
      jpNorth.add(jtfValue);
      
      JPanel jpSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));  //create a JPanel with FlowLayout for the South of the JFrame's BorderLayout 
      jbPlus = new JButton("+");
      jbSubtract = new JButton("-");
      jbReset = new JButton("Reset");
      jbQuit = new JButton("Quit");
      jpSouth.add(jbPlus);  //add buttons to the panel in the south (jpSouth panel)
      jpSouth.add(jbSubtract);
      jpSouth.add(jbReset);
      jpSouth.add(jbQuit);
      
      add(jpNorth, BorderLayout.NORTH);  //add the jpNorth panel and its contents to the JFrame North area
      add(jpSouth, BorderLayout.SOUTH);  //add the jpSouth panel and its contents to the JFrame South area
      
      jbPlus.addActionListener(this);  //register listeners
      jbSubtract.addActionListener(this);
      jbReset.addActionListener(this);
      jbQuit.addActionListener(this); 
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getActionCommand().equals("+"))
      {     
         counter++;
         jtfValue.setText("" + counter);
      }
      
      else if (ae.getActionCommand().equals("-"))
      {
         counter--;
         jtfValue.setText("" + counter);   
      }
      
      else if(ae.getActionCommand().equals("Reset"))
      {
         counter = 0;
         jtfValue.setText("" + counter);   
      }
      
      else if (ae.getActionCommand().equals("Quit"))
      {
         System.exit(0);   
      }
      
    }
   
   
   /**
   * Main function that runs the class called MyEventB
   */
   public static void main(String[] args)
   {
      MyEventB frame = new MyEventB();
      frame.setTitle("Part 3 Using getActionCommand");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,100);
      frame.setLocationRelativeTo(null); //Centers the GUI on screen
      frame.setVisible(true);
    }  




}
 
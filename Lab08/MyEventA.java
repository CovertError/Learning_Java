import javax.swing.*;      //importing javax.swing package
import java.awt.*;         //importing java.awt package
import java.awt.event.*;   //importing java.awt.event package

/**
 * GUI JFrame called MyEventA that contains labels, text fields and buttons
 * @authors: Sira, Omar, Baha 
 * @version 1.0
 */

public class MyEventA extends JFrame implements ActionListener 
{
   public JTextField jtfValue; //attributes so constructor and methods can use the text field and button objects
   public JButton jbPlus;
   public JButton jbSubtract;
   public JButton jbReset;
   public JButton jbQuit;
   int counter=0;

   public MyEventA()
   {
      setLayout(new BorderLayout(5,20));    //set JFrame's layout to BorderLayout with horizontal gap 5 and vertical gap 20

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
    
    /**
    * Handling click events
    */
    public void actionPerformed(ActionEvent ae)
    {
      //return object on which the event occurred
      if(ae.getSource() == jbPlus)  //if user pressed "+" button, add 1 to the displayed value
      {     
         counter++;
         jtfValue.setText("" + counter);
      }
      
      else if (ae.getSource() == jbSubtract) //if user pressed "-" button, subtract 1 from the displayed value
      {
         counter--;
         jtfValue.setText("" + counter);   
      }
      
      else if(ae.getSource() == jbReset) //if user pressed "Reset" button, reset the displayed value to 0
      {
         counter = 0;
         jtfValue.setText("" + counter);   
      }
      
      else if (ae.getSource() == jbQuit) //if user pressed "Quit" button, halt/exit the program
      {
         System.exit(0);   
      }  
    }
   
   
   /**
   * Main function that runs the class called MyEventA
   */
   public static void main(String[] args)
   {
      MyEventA frame = new MyEventA();
      frame.setTitle("Part 2 Using getSource");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,100);
      frame.setLocationRelativeTo(null); //Centers the GUI on screen
      frame.setVisible(true);
    }  
}
 
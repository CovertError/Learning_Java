import javax.swing.*;      //importing javax.swing package
import java.awt.*;         //importing java.awt package
import java.awt.event.*;   //importing java.awt.event package

/**
 * GUI Menu called MyMenu 
 * @authors: Sira, Omar, Baha 
 * @version 1.0
 */

public class MyMenu extends JFrame
{
   public MyMenu()
   {
      super("MyMenu");
      setSize(250,500);
      setLocation(200,200);
      
      //create text area
      JTextArea textArea = new JTextArea(20, 15); 

      //create the menu bar 
      JMenuBar mbar = new JMenuBar();
      setJMenuBar(mbar);
      
      //create the menu and add to the menu bar
      JMenu mCount = new JMenu("Count");
      mbar.add(mCount);
      
      //create and add menu items to the menu
      JMenuItem mItemInc = new JMenuItem("Inc");
      JMenuItem mItemDec = new JMenuItem("Dec");
      JMenuItem mItemReset = new JMenuItem("Reset");
      JMenuItem mItemExit = new JMenuItem("Exit");
      mCount.add(mItemInc);
      mCount.add(mItemDec);
      mCount.add(mItemReset);
      mCount.add(mItemExit);
   }
   
   public static void main(String[] args)
   {
      MyMenu mymenu = new MyMenu();
      mymenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mymenu.setVisible(true);
   }

} 

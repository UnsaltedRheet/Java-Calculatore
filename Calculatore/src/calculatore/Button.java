/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author Nickno
 */
public class Button extends JPanel
{
      private int number;
      private JButton push;
      private JLabel label;
      
      //-----------------------------------------------------------------
      //  Constructor: Sets up the GUI.
      //-----------------------------------------------------------------
      public Button ()
      {
        count = 0;
        
        push = new JButton ();
        push.addActionListener (new ButtonListener());
        label = new JLabel ("Pushes: " + count);
        add (push);
        add (label);
        setPreferredSize (new Dimension(300, 40));
        setBackground (Color.cyan);
   }
}

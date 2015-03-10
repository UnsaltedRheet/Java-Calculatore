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
    private JButton push;
    private String name;
    //-----------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public Button ()
    {    
        push = new JButton ();
        push.addActionListener (new ButtonListener());
        add (push);
        
        setPreferredSize (new Dimension(300, 40));
        
   }
   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
       public void actionPerformed (ActionEvent event)
       {
            
       }
       
   }
}

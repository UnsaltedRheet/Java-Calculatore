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
    private JButton button;
    private String name;
    //-----------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public Button (String nm)
    {    
        name = nm;
        
        button = new JButton (name);
        button.addActionListener (new ButtonListener());
        add (button);
        
        setPreferredSize (new Dimension(65, 40));
        setBackground (new Color(240,180,158));
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatore;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nicholas & Rhett
 */
public class Calculatore
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("BOOBS!!!");
        //COMMENTS GO LIEK DIS BRUH
        
        JFrame frame = new JFrame ("WINDOW TITLE");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        // Set up first subpanel
         JPanel subPanel1 = new JPanel();
         subPanel1.setPreferredSize (new Dimension(150, 100));
         subPanel1.setBackground (Color.green);
         JLabel label1 = new JLabel ("One");
         subPanel1.add (label1);
         // Set up second subpanel
         JPanel subPanel2 = new JPanel();
         subPanel2.setPreferredSize (new Dimension(150, 100));
         subPanel2.setBackground (Color.red);
         JLabel label2 = new JLabel ("Two");
         subPanel2.add (label2);
        
        // Set up primary panel
         JPanel primary = new JPanel();
         primary.setBackground (Color.blue);
         primary.add (subPanel1);
         primary.add (subPanel2);
         frame.getContentPane().add(primary);
         frame.pack();
         frame.setVisible(true);
    }
    
}


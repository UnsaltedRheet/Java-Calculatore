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
    //just a test
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //System.out.println("BOOBS!!!");
        //COMMENTS GO LIEK DIS BRUH
        
        JFrame frame = new JFrame ("WINDOW TITLE");
        frame.setResizable(false);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        // Color palette
        // http://www.colourlovers.com/palette/723615/clairedelune
        // Note: I had to specify the background color of the JButton
        // in the button class itself. I'd like to either remove the
        // background color option entirely or set the default in the class
        // itself to fgColor
        // The colourlovers link shows the palette from dark to light
        Color bgColor = new Color(179,129,132);
        Color fgColor = new Color(240,180,158);
        
        // Set up output subpanel
         JPanel outputPanel = new JPanel();
         outputPanel.setPreferredSize (new Dimension(280, 60));
         outputPanel.setBackground (fgColor);
         JLabel label1 = new JLabel ("OUTPUT GOES HERE");
         JTextField txtbox;
         txtbox = new JTextField(20);
         outputPanel.add (txtbox);
         outputPanel.add (label1);
         
         
         // Set up second subpanel
         JPanel subPanel2 = new JPanel();
         subPanel2.setPreferredSize (new Dimension(280, 230));
         subPanel2.setBackground (fgColor);
         JLabel label2 = new JLabel ("Two");
         //subPanel2.add (label2);
         
         JButton push = new JButton ("This button");
         
         //subPanel2.add (push);
         subPanel2.add (new Button("Clear"));
         subPanel2.add (new Button("+/-"));
         subPanel2.add (new Button("%"));
         subPanel2.add (new Button("/"));
         subPanel2.add (new Button("1"));
         subPanel2.add (new Button("2"));
         subPanel2.add (new Button("3"));
         subPanel2.add (new Button("*"));
         subPanel2.add (new Button("4"));
         subPanel2.add (new Button("5"));
         subPanel2.add (new Button("6"));
         subPanel2.add (new Button("-"));
         subPanel2.add (new Button("7"));
         subPanel2.add (new Button("8"));
         subPanel2.add (new Button("9"));
         subPanel2.add (new Button("+"));
         subPanel2.add (new Button("<-"));
         subPanel2.add (new Button("0"));
         subPanel2.add (new Button("."));
         subPanel2.add (new Button("="));
        
        // Set up primary panel
         JPanel primary = new JPanel();
         primary.setBackground (bgColor);
         primary.setPreferredSize (new Dimension (300, 320));
         primary.add (outputPanel);
         primary.add (subPanel2);
         JLabel copyright = new JLabel ("© Nick and Rhett - 2015");
         primary.add (copyright);
         frame.getContentPane().add(primary);
         frame.pack();
         frame.setVisible(true);
         
    } 
         
   
    
}


/***************************************************************
* file: CS245Project.java
* author: Edgar Pineda, Josh Montgomery, Robert Gil
* class: CS 245 – Programming and Problem Solving
*
* assignment: Point and Click Game – v.1.0
* date last modified: 10/16/2017
*
* purpose: “Point-and-click” games are a common 
* type of game where the player typically uses a mouse to interact with the environment and solve puzzles.
*
****************************************************************/
package cs245.project;

import java.awt.Window;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author RobertDGil
 */
public class CS245Project {


    public static void main(String[] args) 
    {
       JFrame obj = new JFrame();
       obj.setLocationRelativeTo(null); //Centers frame on screen
       obj.add(new JLabel(new ImageIcon("background.jpeg")));
       obj.setVisible(true);
       
       
       File dir1 = new File (".");
        System.out.println("current directory: " + dir1.getAbsolutePath()); 
       System.out.print("TEST REPO");
    }
}

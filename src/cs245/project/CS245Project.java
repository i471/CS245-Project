/** *************************************************************
 * file: CS245Project.java
 * author: Edgar Pineda, Josh Montgomery, Robert Gil
 * class: CS 245 – Programming and Problem Solving
 *
 * assignment: Point and Click Game – v.1.1
 * date last modified: 10/16/2017
 *
 * purpose: “Point-and-click” games are a common
 * type of game where the player typically uses a mouse to interact with the environment and solve puzzles.
 *
 *************************************************************** */
package cs245.project;

import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class CS245Project {

    public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
       StartupScreen s = new StartupScreen();
       s.setLocationRelativeTo(null);
       s.setVisible(true);
       Thread.sleep(3000);
       s.setVisible(false); //Close startup screen
       
       JFrame obj = new JFrame();
       obj.add(new JLabel(new ImageIcon("background.jpeg")));
       obj.setMinimumSize(new Dimension(600, 400));
       obj.setLocationRelativeTo(null); //Centers frame on screen2
       obj.setVisible(true);

    }
}

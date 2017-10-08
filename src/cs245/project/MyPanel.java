/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author RobertDGil
 */
class MyPanel extends JPanel {
 private JToggleButton toggle;

 public MyPanel(){
 toggle = new JToggleButton("Toggle");
 setLayout(null);
Dimension size = toggle.getPreferredSize();
 toggle.setBounds(100, 100, size.width, size.height);
 add(toggle);
 }
 public Dimension getPreferredSize(){
 return new Dimension(250,250);
 }
public void paintComponent(Graphics g){
 super.paintComponent(g);
 try{
     BufferedImage pic = ImageIO.read(new File("src\\background.jpg"));
 }catch(IOException e){}
     Image pic = null;

 g.drawImage(pic,50,50, 100, 100, this);
 }
}

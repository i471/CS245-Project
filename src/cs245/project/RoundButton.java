/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

/**
 *
 * @author Josh
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Josh
 */
public class RoundButton extends JButton{

public RoundButton(String label) {
    super(label);
    Dimension size = getPreferredSize();
    size.width = size.height = Math.max(size.width,size.height);
    setPreferredSize(size);

    setContentAreaFilled(false);
  }

  protected void paintComponent(Graphics g) {
    if (getModel().isArmed()) {
      g.setColor(Color.lightGray);
    } else {
      g.setColor(getBackground());
    }
    g.fillOval(0, 0, getSize().width-1,getSize().height-1);

    super.paintComponent(g);
  }

  protected void paintBorder(Graphics g) {
    g.setColor(getForeground());
    g.drawOval(0, 0, getSize().width-1,     getSize().height-1);
  }

  Shape shape;
  public boolean contains(int x, int y) {
    if (shape == null || 
      !shape.getBounds().equals(getBounds())) {
      shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
    }
    return shape.contains(x, y);
  }

  public static void main(String[] args) {
    JButton button1 = new RoundButton("1");
    JButton button2 = new RoundButton("2");
    JButton button3 = new RoundButton("3");
    JButton button4 = new RoundButton("4");
    JButton button5 = new RoundButton("5");
    
    button1.setBackground(Color.red);
    button2.setBackground(Color.yellow);
    button3.setBackground(Color.blue);
    button4.setBackground(Color.magenta);
    button5.setBackground(Color.green);
    
    button1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button1.setBackground(Color.gray);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        button1.setBackground(Color.red);
    }
});
    button2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button2.setBackground(Color.gray);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        button2.setBackground(Color.yellow);
    }
});
    button3.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button3.setBackground(Color.gray);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        button3.setBackground(Color.blue);
    }
});
    button4.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button4.setBackground(Color.gray);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        button4.setBackground(Color.magenta);
    }
});
    button5.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        button5.setBackground(Color.gray);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        button5.setBackground(Color.green);
    }
});
    
    JFrame frame = new JFrame();
    frame.getContentPane().add(button1);
    frame.getContentPane().add(button2);
    frame.getContentPane().add(button3);
    frame.getContentPane().add(button4);
    frame.getContentPane().add(button5);
    frame.getContentPane().setLayout(new FlowLayout());
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
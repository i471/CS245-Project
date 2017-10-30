/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import static java.lang.Integer.max;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.*;
import java.awt.Color;
import static jdk.nashorn.internal.objects.NativeMath.random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ColorTrap extends javax.swing.JFrame implements MouseListener {
    
    HiyaGUI HG = new HiyaGUI();
    RoundButton b1 = new RoundButton("1");
    RoundButton b2 = new RoundButton("2");
    RoundButton b3 = new RoundButton("3");
    RoundButton b4 = new RoundButton("4");
    RoundButton b5 = new RoundButton("5");

    Random rand = new Random();

    Random random = new Random();

    Stack<Color> lifo;
    
    String answer;
    
    int numTries = 5;
    
    int points;// = HG.score;

    int[][][] XYCoordinates
            = {{{50, 100}, {250, 100}, {450, 100}, {150, 300}, {350, 300}},
            {{50, 300}, {250, 300}, {450, 300}, {150, 100}, {350, 100}},
            {{250, 260}, {490, 150}, {90, 75}, {50, 320}, {350, 300}},
            {{480, 190}, {90, 300}, {190, 113}, {50, 200}, {350, 320}}};

    public ColorTrap(int hgScore) {
        initComponents();
        addButtons();
        addMouseLis();
        addActionLis();
        points = hgScore;
        escapeKey();
    }
    
    public final void escapeKey() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void addButtons() {
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
    }

    public void addMouseLis() {

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
        });
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
        });
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
        });
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
        });

    }
    public void addActionLis() {
        b1.addActionListener(new java.awt.event.ActionListener() {public void actionPerformed(java.awt.event.ActionEvent evt) {b1ActionPerformed(evt);}});
        b2.addActionListener(new java.awt.event.ActionListener() {public void actionPerformed(java.awt.event.ActionEvent evt) {b2ActionPerformed(evt);}});
        b3.addActionListener(new java.awt.event.ActionListener() {public void actionPerformed(java.awt.event.ActionEvent evt) {b3ActionPerformed(evt);}});
        b4.addActionListener(new java.awt.event.ActionListener() {public void actionPerformed(java.awt.event.ActionEvent evt) {b4ActionPerformed(evt);}});
        b5.addActionListener(new java.awt.event.ActionListener() {public void actionPerformed(java.awt.event.ActionEvent evt) {b5ActionPerformed(evt);}});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        colorLabel.setText("colorLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 241, Short.MAX_VALUE)
                .addComponent(colorLabel)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(colorLabel)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        if(numTries == 0)
        {
            this.dispose();
            HighscoreFrame hsf = new HighscoreFrame(points);
            hsf.setLocationRelativeTo(null);
            hsf.setVisible(true);
           
        }
        super.paint(g);
        drawCircle(g);
        setLabelName();
        setLabelColor();
        System.out.println(points);
    }


    public void drawCircle(Graphics g) {
        int i = random.nextInt(4);
        int x = 75;
        int y = 75;

        b1.setBackground(Color.yellow);
        b1.setBounds(XYCoordinates[i][0][0], XYCoordinates[i][0][1], x, y);

        b2.setBackground(Color.RED);
        b2.setBounds(XYCoordinates[i][1][0], XYCoordinates[i][1][1], x, y);

        b3.setBackground(Color.BLUE);
        b3.setBounds(XYCoordinates[i][2][0], XYCoordinates[i][2][1], x, y);

        b4.setBackground(Color.GREEN);
        b4.setBounds(XYCoordinates[i][3][0], XYCoordinates[i][3][1], x, y);

        b5.setBackground(Color.MAGENTA);
        b5.setBounds(XYCoordinates[i][4][0], XYCoordinates[i][4][1], x, y);
    }

    public void setLabelName() {
        int r = random.nextInt(5);
        switch (r) {
            case 0:
                colorLabel.setText("RED");
                break;
            case 1:
                colorLabel.setText("YELLOW");              
                break;
            case 2:
                colorLabel.setText("GREEN");                
                break;
            case 3:
                colorLabel.setText("BLUE");                
                break;
            case 4:
                colorLabel.setText("MAGENTA");             
                break;
        }
    }
    
    public void setLabelColor() {
        int r = random.nextInt(5);
        switch (r) {
            case 0:
                colorLabel.setForeground(Color.red);
                answer = "RED";
                break;
            case 1:
                colorLabel.setForeground(Color.yellow);
                answer = "YELLOW";
                break;
            case 2:
                colorLabel.setForeground(Color.green);
                answer = "GREEN";
                break;
            case 3:
                colorLabel.setForeground(Color.blue);
                answer = "BLUE";
                break;
            case 4:
                colorLabel.setForeground(Color.magenta);
                answer = "MAGENTA";
                break;
        }
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(answer == "YELLOW")
            points = points + 100;
        --numTries;
        repaint();
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(answer == "RED")
            points = points + 100;
        --numTries;
        repaint();
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
       if(answer == "BLUE")
            points = points + 100;
        --numTries;
        repaint();
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                             
       if(answer == "GREEN")
            points = points + 100;
        --numTries;
        repaint();
    }

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(answer == "MAGENTA")
            points = points + 100;
        --numTries;
        repaint();
    }


    private void b1MouseEntered(java.awt.event.MouseEvent evt) {
        b1.getModel().setArmed(true);
    }

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {
        b2.getModel().setArmed(true);
    }

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {
        b3.getModel().setArmed(true);
    }

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {
        b4.getModel().setArmed(true);
    }

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {
        b5.getModel().setArmed(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorLabel;
    // End of variables declaration//GEN-END:variables

}

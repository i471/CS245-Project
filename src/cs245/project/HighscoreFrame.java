/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 *
 * @author RobertDGil
 */
public class HighscoreFrame extends javax.swing.JFrame {
    
    List<Score> scoreList = new ArrayList<Score>();
    /**
     * Creates new form HighscoreFrame
     */
   public HighscoreFrame(int score) 
   {
        initComponents();
        escapeKey();
        F1Key();
        highlightTextField();
        if(score != -1)
        {
            highScoreLabel1.setText(Integer.toString(score));
            initials.setVisible(false);
            previousScores.setVisible(false);
        }
        else
        {
            staticScores();
        }
    }

    public void highlightTextField()
    {
        init1TextField.selectAll();
    }
    
    public void staticScores()
    {
        init1TextField.setVisible(false);
        highScoreLabel1.setVisible(false);
        jButton2.setVisible(false);
        initials.setVisible(false);
        previousScores.setVisible(false);
        try 
        {
            readScores();
            displayScores();
            initials.setVisible(true);
            initials.setVerticalTextPosition(JLabel.TOP);
            previousScores.setVisible(true);
            previousScores.setVerticalTextPosition(JLabel.TOP);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(HighscoreFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void displayScores()
    {
        if(!scoreList.isEmpty())
        {
            String initOutput = "";
            String scoreOutput = "";
            for(int i = 0; i < scoreList.size() && i < 5; i ++)
            {
                initOutput += ("<html>" + scoreList.get(i).getInitials() + "<br><br>");
                scoreOutput +=("<html>" + scoreList.get(i).getScore() + "<br><br>");
                System.out.print(i);
            }
            initOutput += "</html>";
            scoreOutput += "</html>";
            initials.setText(initOutput);
            previousScores.setText(scoreOutput);
        }
        
    }
   
    public void readScores() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String initials = "";
            String playerScore =  "";

            while (line != null) 
            {
                initials = line;
                playerScore = br.readLine();
                Score score = new Score(initials, playerScore);
                scoreList.add(score);
                line = br.readLine();
            }
            String everything = sb.toString();
        } 
        finally 
        {
            br.close();
        }
    }
    
    public void saveScore() throws IOException
    {
        String fileName = "scores.txt";
        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.println(init1TextField.getText());
        printWriter.println(highScoreLabel1.getText());
        printWriter.close();
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
    public final void F1Key() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F1Frame obj = new F1Frame();
                //obj.add(new JLabel(new ImageIcon("background.jpeg")));
                obj.setMinimumSize(new Dimension(600, 400));
                obj.setLocationRelativeTo(null); //Centers frame on screen2
                obj.setVisible(true);
            }
        });
    }
    //
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        highScoreLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        init1TextField = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        previousScores = new javax.swing.JLabel();
        initials = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HIGHSCORES");

        jButton1.setText("End");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        highScoreLabel1.setText("Your Score");

        init1TextField.setText("Enter your Initials");
        jScrollPane1.setViewportView(init1TextField);
        init1TextField.getAccessibleContext().setAccessibleParent(init1TextField);

        jButton2.setText("Save Score");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(highScoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(initials, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)
                                .addComponent(jButton2)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highScoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousScores, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       JFrame obj = new JFrame();
       obj.add(new JLabel(new ImageIcon("background.jpeg")));
       obj.setMinimumSize(new Dimension(610, 439));
       obj.setLocationRelativeTo(null); //Centers frame on screen2
       this.setVisible(false);
       obj.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // makes text field unwritable
            this.dispose();
            JFrame obj = new JFrame();
            obj.add(new JLabel(new ImageIcon("background.jpeg")));
            obj.setMinimumSize(new Dimension(600, 400));
            obj.setLocationRelativeTo(null); //Centers frame on screen2
            obj.setVisible(true);
            init1TextField.setEditable(false);
            
            saveScore();
        } catch (IOException ex) {
            Logger.getLogger(HighscoreFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HighscoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighscoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighscoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighscoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighscoreFrame(-1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel highScoreLabel1;
    private javax.swing.JTextPane init1TextField;
    private javax.swing.JLabel initials;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel previousScores;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 *
 * @author RobertDGil
 */
public class JFrame extends javax.swing.JFrame {

    private HighscoreFrame highScore;
    private CreditFrame creditFrame;
    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        escapeKey();
        F1Key();
    }

    JFrame(String test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPlay = new javax.swing.JButton();
        jButtonHighscores = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jButtonPlay.setText("PLAY");
        jButtonPlay.setToolTipText("initiate Game Series");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay);
        jButtonPlay.setBounds(480, 220, 110, 23);

        jButtonHighscores.setText("HIGHSCORES");
        jButtonHighscores.setToolTipText("View High Scores");
        jButtonHighscores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHighscoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHighscores);
        jButtonHighscores.setBounds(480, 250, 110, 23);

        jButtonCredits.setText("CREDITS");
        jButtonCredits.setToolTipText("View Credits ");
        jButtonCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCredits);
        jButtonCredits.setBounds(480, 280, 110, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs245/project/BetterWolf.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed

        HiyaGUI h = new HiyaGUI();
        h.setMinimumSize(new Dimension(600, 400));
        h.setLocationRelativeTo(null); //Centers frame on screen2
        this.setVisible(false);
        h.setVisible(true);
      
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonHighscoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHighscoresActionPerformed
       HighscoreFrame obj = new HighscoreFrame(-1);
       obj.setMinimumSize(new Dimension(600, 400));
       obj.setLocationRelativeTo(null); //Centers frame on screen2
       this.setVisible(false);
       obj.setVisible(true);
    }//GEN-LAST:event_jButtonHighscoresActionPerformed

    private void jButtonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditsActionPerformed
        // TODO add your handling code here:
       CreditFrame obj = new CreditFrame();
       obj.setMinimumSize(new Dimension(600, 400));
       obj.setLocationRelativeTo(null); //Centers frame on screen2
       this.setVisible(false);
       obj.setVisible(true);
    }//GEN-LAST:event_jButtonCreditsActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCredits;
    private javax.swing.JButton jButtonHighscores;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

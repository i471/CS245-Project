/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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

        jButtonPlay = new javax.swing.JButton();
        jButtonHighscores = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonPlay.setText("PLAY");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay);
        jButtonPlay.setBounds(460, 280, 110, 23);

        jButtonHighscores.setText("HIGHSCORES");
        jButtonHighscores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHighscoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHighscores);
        jButtonHighscores.setBounds(460, 310, 110, 23);

        jButtonCredits.setText("CREDITS");
        jButtonCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCredits);
        jButtonCredits.setBounds(460, 340, 110, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs245/project/background.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

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
       HighscoreFrame obj = new HighscoreFrame();
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
    // End of variables declaration//GEN-END:variables
}

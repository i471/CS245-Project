/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.swing;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
 *ABC
 * @author User
 */
public class HiyaGUI extends javax.swing.JFrame {

    RandomNameGenerator rng = new RandomNameGenerator();
    
    int timeLoop = 0;
    public HiyaGUI(){
        
        initComponents();
        showDate();
        showTime();
        showName();
        
        }
        //Time to make methods
        
        
        // determines the size of name. We'll use this later for the lines 
        // under the letters. IDK how to use paint.need to read up. 
        public void setLines(){
            setNameSize(); 
        }
        // returns the length of the word converts to int.
        //nameSize.setText changes int to string if we want to show
        // how many nums there are in the word
        public double setNameSize(){
            int length = (rng.getName().length());
            // this is just to make sure im doing it correctly 
            nameSize.setText(Integer.toString(length));
                               //so we can print.
                                //set Text only prints strings
            return length;
        }
        // gets Random name. although we will change to not display later
        public void showName(){
            labelName.setText(rng.getName());
        }
        public void showDate(){
          Date d = new Date();
          String txtDate = new SimpleDateFormat("dd/MM/yyyy",Locale.US).format(new Date());
          date.setText("Date: " + txtDate);
        }
        public void showTime(){
            new Thread(){
            public void run(){
                while(timeLoop ==0){
                       
                Calendar cal = new GregorianCalendar();
                int seconds = cal.get(Calendar.SECOND);
                int minutes = cal.get(Calendar.MINUTE);
                int hour = cal.get(Calendar.HOUR);
                time.setText(hour + " : " +minutes+" : "+seconds);
                
                        }
                    }
                }.start();
            }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        nameSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonA.setText("A");
        jButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAMouseClicked(evt);
            }
        });
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBMouseClicked(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCMouseClicked(evt);
            }
        });
        jButtonC.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButtonCComponentHidden(evt);
            }
        });

        jButtonD.setText("D");
        jButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDMouseClicked(evt);
            }
        });

        jButtonF.setText("F");
        jButtonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFMouseClicked(evt);
            }
        });

        jButtonG.setText("G");
        jButtonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGMouseClicked(evt);
            }
        });

        jButtonH.setText("H");
        jButtonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHMouseClicked(evt);
            }
        });

        jButtonI.setText("I");
        jButtonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIMouseClicked(evt);
            }
        });

        jButtonJ.setText("J");
        jButtonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonJMouseClicked(evt);
            }
        });

        jButtonK.setText("K");
        jButtonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKMouseClicked(evt);
            }
        });

        jButtonL.setText("L");
        jButtonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLMouseClicked(evt);
            }
        });

        jButtonM.setText("M");
        jButtonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMMouseClicked(evt);
            }
        });

        jButtonN.setText("N");
        jButtonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNMouseClicked(evt);
            }
        });

        jButtonO.setText("O");
        jButtonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOMouseClicked(evt);
            }
        });

        jButtonP.setText("P");
        jButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPMouseClicked(evt);
            }
        });

        jButtonQ.setText("Q");
        jButtonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonQMouseClicked(evt);
            }
        });
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });

        jButtonR.setText("R");
        jButtonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRMouseClicked(evt);
            }
        });

        jButtonS.setText("S");
        jButtonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSMouseClicked(evt);
            }
        });

        jButtonT.setText("T");
        jButtonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTMouseClicked(evt);
            }
        });

        jButtonU.setText("U");
        jButtonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUMouseClicked(evt);
            }
        });

        jButtonV.setText("V");
        jButtonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVMouseClicked(evt);
            }
        });

        jButtonW.setText("W");
        jButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonWMouseClicked(evt);
            }
        });

        jButtonX.setText("X");
        jButtonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonXMouseClicked(evt);
            }
        });

        jButtonY.setText("Y");
        jButtonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonYMouseClicked(evt);
            }
        });

        jButtonZ.setText("Z");
        jButtonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZMouseClicked(evt);
            }
        });

        jButtonE.setText("E");
        jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEMouseClicked(evt);
            }
        });

        date.setText("Date:");

        time.setText("Time");

        labelName.setText("name");

        nameSize.setText("nameSize");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonO))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonB)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonP)
                    .addComponent(jButtonF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonI))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonJ)
                    .addComponent(jButtonT))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonY)
                .addGap(18, 18, 18)
                .addComponent(jButtonZ)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameSize)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB)
                    .addComponent(jButtonC)
                    .addComponent(jButtonD)
                    .addComponent(jButtonF)
                    .addComponent(jButtonG)
                    .addComponent(jButtonH)
                    .addComponent(jButtonI)
                    .addComponent(jButtonJ)
                    .addComponent(jButtonE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonL)
                        .addComponent(jButtonM)
                        .addComponent(jButtonN)
                        .addComponent(jButtonO)
                        .addComponent(jButtonP)
                        .addComponent(jButtonR)
                        .addComponent(jButtonS)
                        .addComponent(jButtonT)
                        .addComponent(jButtonK)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonV)
                    .addComponent(jButtonW)
                    .addComponent(jButtonX)
                    .addComponent(jButtonY)
                    .addComponent(jButtonZ)
                    .addComponent(jButtonU))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonAMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonA.setEnabled(false);
    }                                     

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonBMouseClicked(java.awt.event.MouseEvent evt) {                                      
           jButtonB.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonCComponentHidden(java.awt.event.ComponentEvent evt) {                                         

    }                                        

    private void jButtonCMouseClicked(java.awt.event.MouseEvent evt) {                                      
          jButtonC.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonDMouseClicked(java.awt.event.MouseEvent evt) {                                      
           jButtonD.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonFMouseClicked(java.awt.event.MouseEvent evt) {                                      
           jButtonF.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonGMouseClicked(java.awt.event.MouseEvent evt) {                                      
           jButtonG.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonHMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonH.setEnabled(false);// TODO add your handling code here:
    }                                     

    private void jButtonEMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonE.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonIMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonI.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonJMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonJ.setEnabled(false); // TODO add your handling code here:
    }                                     

    private void jButtonKMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonK.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonLMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonL.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonMMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonM.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonNMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonN.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonOMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonO.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonPMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonP.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonQMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonQ.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonRMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonR.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonSMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonS.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonTMouseClicked(java.awt.event.MouseEvent evt) {                                      
             jButtonT.setEnabled(false);  // TODO add your handling code here:
    }                                     

    private void jButtonUMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonU.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonVMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonV.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonWMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonW.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonXMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonX.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonYMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonY.setEnabled(false);        // TODO add your handling code here:
    }                                     

    private void jButtonZMouseClicked(java.awt.event.MouseEvent evt) {                                      
            jButtonZ.setEnabled(false);        // TODO add your handling code here:
    }                                     
    
    
    
    
    
     /* @param args the command line arguments
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
            java.util.logging.Logger.getLogger(HiyaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HiyaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HiyaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiyaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiyaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel date;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel nameSize;
    private javax.swing.JLabel time;
    // End of variables declaration                   
}

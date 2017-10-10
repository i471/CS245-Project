/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
 *
 * @author Team KickAss
 */
public class HiyaGUI extends javax.swing.JFrame {

    RandomNameGenerator rng = new RandomNameGenerator();
    private int numberOfGuesses = 0;
    private int score = 100;
    String answer = null;

    
    int timeLoop = 0;    // creates new form of HiyaGUI
    public HiyaGUI() {
       initComponents();
       showName();
       showNameSize();
       showDate();
       showTime();
       drawUnderscores();
    }
    
    @Override
    public void paint(Graphics g){  
       super.paint(g);
       drawHangManbase(g);
       
    }
    
  
    
    private void drawHangManbase(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(200,200,300,200);//Base Hori
        g.drawLine(200,200,200,215);//Base Left
        g.drawLine(300,200,300,215);//Base Right
        g.drawLine(250,200,250,75); //Base Vertical
        g.drawLine(250,75,400,75);  //Base ARM
        g.drawLine(400,75,400,100); //Base Rope 
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
    public void showDate(){
        String txtDate = new SimpleDateFormat("MM/dd/yyyy",Locale.US).format(new Date());
        date.setText("Date: " + txtDate);
        
    }
    public int showNameSize(){
        // gets length 
        int length = rng.getName().length();
        // makes length printable setText only prints String
        nameSize.setText(Integer.toString(length));
        return length;
    }
    
    public void showName(){
        name.setText(rng.getName());
    }
    
   
    public void drawUnderscores()
    {
        boolean gameWin = false; 
        String s ="";
        for(int i = 0; i < rng.getLength(); i++)
        {
            s += " _ ";
        }
        answerHidden.setText(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
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
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        answerHidden = new javax.swing.JLabel();
        jPanelHang = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nameSize = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jButtonA.setText("A");
        jButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAMouseClicked(evt);
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

        jButtonD.setText("D");
        jButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDMouseClicked(evt);
            }
        });

        jButtonE.setText("E");
        jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEMouseClicked(evt);
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

        date.setText("date");

        time.setText("time");

        nameSize.setText("nameSize");

        name.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(nameSize))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(nameSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonW))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonO))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jPanelHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonZ))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonP)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(answerHidden)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonF)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonJ)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time)
                            .addComponent(date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(answerHidden)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB)
                    .addComponent(jButtonC)
                    .addComponent(jButtonD)
                    .addComponent(jButtonE)
                    .addComponent(jButtonF)
                    .addComponent(jButtonG)
                    .addComponent(jButtonH)
                    .addComponent(jButtonI)
                    .addComponent(jButtonJ))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonK)
                    .addComponent(jButtonL)
                    .addComponent(jButtonM)
                    .addComponent(jButtonN)
                    .addComponent(jButtonO)
                    .addComponent(jButtonP)
                    .addComponent(jButtonQ)
                    .addComponent(jButtonR)
                    .addComponent(jButtonS)
                    .addComponent(jButtonT))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonU)
                    .addComponent(jButtonV)
                    .addComponent(jButtonW)
                    .addComponent(jButtonX)
                    .addComponent(jButtonY)
                    .addComponent(jButtonZ))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseClicked
        jButtonA.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("a")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonAMouseClicked

    private void jButtonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBMouseClicked
        jButtonB.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("b")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonBMouseClicked

    private void jButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCMouseClicked
        jButtonC.setEnabled(false);// TODO add your handling code here:
        if(isInWord("c")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonCMouseClicked

    private void jButtonDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDMouseClicked
        jButtonD.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("d")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonDMouseClicked

    private void jButtonEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEMouseClicked
        jButtonE.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("e")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonEMouseClicked

    private void jButtonFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFMouseClicked
        jButtonF.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("f")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonFMouseClicked

    private void jButtonGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGMouseClicked
        jButtonG.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("g")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonGMouseClicked

    private void jButtonHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHMouseClicked
        jButtonH.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("h")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonHMouseClicked

    private void jButtonIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIMouseClicked
        jButtonI.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("i")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonIMouseClicked

    private void jButtonJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJMouseClicked
        jButtonJ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("j")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonJMouseClicked

    private void jButtonKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKMouseClicked
        jButtonK.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("k")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonKMouseClicked

    private void jButtonLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLMouseClicked
        jButtonL.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("l")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonLMouseClicked

    private void jButtonMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMMouseClicked
        jButtonM.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("m")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonMMouseClicked

    private void jButtonNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNMouseClicked
        jButtonN.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("n")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonNMouseClicked

    private void jButtonOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOMouseClicked
        jButtonO.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("o")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonOMouseClicked

    private void jButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPMouseClicked
        jButtonP.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("p")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonPMouseClicked

    private void jButtonQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQMouseClicked
        jButtonQ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("q")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonQMouseClicked

    private void jButtonRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRMouseClicked
        jButtonR.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("r")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonRMouseClicked

    private void jButtonSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSMouseClicked
        jButtonS.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("s")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonSMouseClicked

    private void jButtonTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTMouseClicked
        jButtonT.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("t")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonTMouseClicked

    private void jButtonUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUMouseClicked
        jButtonU.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("u")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonUMouseClicked

    private void jButtonVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVMouseClicked
        jButtonV.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("v")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonVMouseClicked

    private void jButtonWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWMouseClicked
        jButtonW.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("w")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonWMouseClicked

    private void jButtonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXMouseClicked
        jButtonX.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("x")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonXMouseClicked

    private void jButtonYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonYMouseClicked
        jButtonY.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("y")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonYMouseClicked

    private void jButtonZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZMouseClicked
        jButtonZ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("z")){
            
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonZMouseClicked

  
    
     
  

    private boolean isInWord(String letter)
    {
        return (name.getText().contains(letter));
    }
    
    private void wrongGuess()
    {
        if(score != 0)
        {
            score -= 10;
            System.out.print("Score: " + score);
        }
        else{
            System.out.print("You Lose!");
        }
    }
    
    private void drawAnswer()
    {
        
    }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerHidden;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameSize;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}

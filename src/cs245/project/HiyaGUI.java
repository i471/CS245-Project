/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
/**
 *
 * @author Team KickAss
 */
public class HiyaGUI extends javax.swing.JFrame {

    RandomNameGenerator rng = new RandomNameGenerator();
    
    private int numberOfGuesses = 0;
    public int score = 100;
    String answer = null;
     ArrayList<String> answ = new ArrayList<String>();
    int nameLength = rng.getName().length();
    
    
    @Override
    public Component add(Component comp) {
        return super.add(comp); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void nextGame(int hgScore)
    {
       this.dispose();
       //this.setVisible(false);
       ColorTrap cTrap = new ColorTrap(score);
       cTrap.setLocationRelativeTo(null);
       cTrap.setMinimumSize(new Dimension(600, 400));
       cTrap.setVisible(true);
    }
    
    int timeLoop = 0;    // creates new form of HiyaGUI
    public HiyaGUI() {
       initComponents();
       escapeKey();
       showDate();
       showTime();
       showName();
       
       
       hangmanLabel.setText("HANGMAN");
       name.setVisible(false);
    }
    
    @Override
    public void paint(Graphics g){  
       super.paint(g);
       drawUnderscores(g);
       drawHangManbase(g);
       
    }
    
  
    
    private void drawHangManbase(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(200,200,300,200);//Hori
        g.drawLine(200,200,200,215);//Left
        g.drawLine(300,200,300,215);//Right
        g.drawLine(250,200,250,75); //Vertical
        g.drawLine(250,75,400,75);  //arm
        g.drawLine(400,75,400,100); //rope
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
    // just to test 
    public int showNameSize(){
        // gets length 
        int length = rng.getName().length();
        // makes length printable setText only prints String
        nameSize.setText(Integer.toString(length));
        return length;
    }
    // just to test 
    public void showName(){
        name.setText(rng.getName());
        
    }
    
   
    public void drawUnderscores(Graphics g)
    {
        String answStr = "";
       
        
        for(int i =0 ; i < nameLength; i++)
        {
            answ.add  ("   _____   ");
            answStr += "   _____   ";
        }
        
        jLabel1.setText(answStr);
    }
    
    public Integer[] getGuessIndex(char guess)
    {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        
        for(int i = 0; i < name.getText().length(); i ++)
        {
            if(guess == name.getText().charAt(i))
            {
                positions.add(i);
            }
        }
        
        Integer [] arr = new Integer[positions.size()];
        positions.toArray(arr);
        
        return arr;
        
    }

    public void drawAnswer(Integer arr[], String guess)
    {
        String setAnsw = "";
        int j = 0;
        for(int i = 0 ; i < name.getText().length(); i ++)
        {
            if(j < arr.length)
            {
                if(arr[j] == i)
                {
                    answ.set(i, "        " + guess + "       ");
                    //setAnsw += ("   " + guess + "    ");
                    j++;
                }
            }
        }
        
        for(int i = 0; i < answ.size(); i ++)
        {
            setAnsw += answ.get(i);
        }
       
        jLabel1.setText(setAnsw);
        
        if(playerWin())
        {
            System.out.print("You Win!");
            nextGame(score);
        }
        
    }
    
    public boolean playerWin()
    {
        boolean noUnderscores = true;
        
        for(int i = 0; i < answ.size(); i ++)
        {
            if(answ.get(i).equals("   _____   "))
            {
                noUnderscores = false;
            }
        }
        
        return noUnderscores;
    }
   
    

    private void drawHangman(Graphics g, int score)
    {
         switch(score)
         {

             case(90):  g.drawOval(350, 100, 100, 50); // head
             break;
             case (80): g.drawLine(400 , 150, 400, 200); // body
             break;
             case(70):  g.drawLine(400, 200, 375, 250); // left leg
             break;
             case (60): g.drawLine(400, 200, 425, 250); //  right leg
             break;
             case (50): g.drawLine(400, 175, 425, 150); //right arm
             break;
             case (40): g.drawLine(400, 175, 375, 150); // left arm
             break;
         }
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
        jButtonSkip = new javax.swing.JButton();
        hangmanLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonA.setText("A");
        jButtonA.setToolTipText("Guess this letter!");
        jButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAMouseClicked(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.setToolTipText("Guess this letter!");
        jButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBMouseClicked(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.setToolTipText("Guess this letter!");
        jButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCMouseClicked(evt);
            }
        });

        jButtonD.setText("D");
        jButtonD.setToolTipText("Guess this letter!");
        jButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDMouseClicked(evt);
            }
        });

        jButtonE.setText("E");
        jButtonE.setToolTipText("Guess this letter!");
        jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEMouseClicked(evt);
            }
        });

        jButtonF.setText("F");
        jButtonF.setToolTipText("Guess this letter!");
        jButtonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFMouseClicked(evt);
            }
        });

        jButtonG.setText("G");
        jButtonG.setToolTipText("Guess this letter!");
        jButtonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGMouseClicked(evt);
            }
        });

        jButtonH.setText("H");
        jButtonH.setToolTipText("Guess this letter!");
        jButtonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHMouseClicked(evt);
            }
        });

        jButtonI.setText("I");
        jButtonI.setToolTipText("Guess this letter!");
        jButtonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIMouseClicked(evt);
            }
        });

        jButtonJ.setText("J");
        jButtonJ.setToolTipText("Guess this letter!");
        jButtonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonJMouseClicked(evt);
            }
        });

        jButtonK.setText("K");
        jButtonK.setToolTipText("Guess this letter!");
        jButtonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKMouseClicked(evt);
            }
        });

        jButtonL.setText("L");
        jButtonL.setToolTipText("Guess this letter!");
        jButtonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLMouseClicked(evt);
            }
        });

        jButtonM.setText("M");
        jButtonM.setToolTipText("Guess this letter!");
        jButtonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMMouseClicked(evt);
            }
        });

        jButtonN.setText("N");
        jButtonN.setToolTipText("Guess this letter!");
        jButtonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNMouseClicked(evt);
            }
        });

        jButtonO.setText("O");
        jButtonO.setToolTipText("Guess this letter!");
        jButtonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOMouseClicked(evt);
            }
        });

        jButtonP.setText("P");
        jButtonP.setToolTipText("Guess this letter!");
        jButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPMouseClicked(evt);
            }
        });

        jButtonQ.setText("Q");
        jButtonQ.setToolTipText("Guess this letter!");
        jButtonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonQMouseClicked(evt);
            }
        });

        jButtonR.setText("R");
        jButtonR.setToolTipText("Guess this letter!");
        jButtonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRMouseClicked(evt);
            }
        });

        jButtonS.setText("S");
        jButtonS.setToolTipText("Guess this letter!");
        jButtonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSMouseClicked(evt);
            }
        });

        jButtonT.setText("T");
        jButtonT.setToolTipText("Guess this letter!");
        jButtonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTMouseClicked(evt);
            }
        });

        jButtonU.setText("U");
        jButtonU.setToolTipText("Guess this letter!");
        jButtonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUMouseClicked(evt);
            }
        });

        jButtonV.setText("V");
        jButtonV.setToolTipText("Guess this letter!");
        jButtonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVMouseClicked(evt);
            }
        });

        jButtonW.setText("W");
        jButtonW.setToolTipText("Guess this letter!");
        jButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonWMouseClicked(evt);
            }
        });

        jButtonX.setText("X");
        jButtonX.setToolTipText("Guess this letter!");
        jButtonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonXMouseClicked(evt);
            }
        });

        jButtonY.setText("Y");
        jButtonY.setToolTipText("Guess this letter!");
        jButtonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonYMouseClicked(evt);
            }
        });

        jButtonZ.setText("Z");
        jButtonZ.setToolTipText("Guess this letter!");
        jButtonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonZMouseClicked(evt);
            }
        });

        date.setText("date");
        date.setToolTipText("Date and Time");

        time.setText("time");
        time.setToolTipText("Date and Time");

        answerHidden.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        nameSize.setText("nameSize");

        name.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(72, Short.MAX_VALUE)
                        .addComponent(nameSize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(198, 198, 198))
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

        jButtonSkip.setText("Skip");
        jButtonSkip.setToolTipText("Press to skip this game");
        jButtonSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSkipActionPerformed(evt);
            }
        });

        hangmanLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        hangmanLabel.setText("jLabel1");
        hangmanLabel.setToolTipText("Name of the Game!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(answerHidden, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addComponent(hangmanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonX)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonY)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonZ)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSkip))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonP)
                            .addGap(10, 10, 10)
                            .addComponent(jButtonQ)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonT)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonF)
                                .addGap(14, 14, 14)
                                .addComponent(jButtonG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonH)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonJ))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hangmanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(date)
                                .addComponent(time)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(answerHidden, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jButtonZ)
                    .addComponent(jButtonSkip))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseClicked
        jButtonA.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("a")){
            Integer arr[] = getGuessIndex('a');
            drawAnswer(arr, "a");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonAMouseClicked

    private void jButtonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBMouseClicked
        jButtonB.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("b")){
            Integer arr[] = getGuessIndex('b');
            drawAnswer(arr, "b");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonBMouseClicked

    private void jButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCMouseClicked
        jButtonC.setEnabled(false);// TODO add your handling code here:
        if(isInWord("c")){
            Integer arr[] = getGuessIndex('c');
            drawAnswer(arr, "c");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonCMouseClicked

    private void jButtonDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDMouseClicked
        jButtonD.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("d")){
            Integer arr[] = getGuessIndex('d');
            drawAnswer(arr, "d");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonDMouseClicked

    private void jButtonEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEMouseClicked
        jButtonE.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("e")){
            Integer arr[] = getGuessIndex('e');
            drawAnswer(arr, "e");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonEMouseClicked

    private void jButtonFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFMouseClicked
        jButtonF.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("f")){
            Integer arr[] = getGuessIndex('f');
            drawAnswer(arr, "f");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonFMouseClicked

    private void jButtonGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGMouseClicked
        jButtonG.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("g")){
            Integer arr[] = getGuessIndex('g');
            drawAnswer(arr, "g");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonGMouseClicked

    private void jButtonHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHMouseClicked
        jButtonH.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("h")){
            Integer arr[] = getGuessIndex('h');
            drawAnswer(arr, "h");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonHMouseClicked

    private void jButtonIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIMouseClicked
        jButtonI.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("i")){
            Integer arr[] = getGuessIndex('i');
            drawAnswer(arr, "i");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonIMouseClicked

    private void jButtonJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJMouseClicked
        jButtonJ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("j")){
            Integer arr[] = getGuessIndex('j');
            drawAnswer(arr, "j");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonJMouseClicked

    private void jButtonKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKMouseClicked
        jButtonK.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("k")){
            Integer arr[] = getGuessIndex('k');
            drawAnswer(arr, "k");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonKMouseClicked

    private void jButtonLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLMouseClicked
        jButtonL.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("l")){
            Integer arr[] = getGuessIndex('l');
            drawAnswer(arr, "l");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonLMouseClicked

    private void jButtonMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMMouseClicked
        jButtonM.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("m")){
            Integer arr[] = getGuessIndex('m');
            drawAnswer(arr, "m");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonMMouseClicked

    private void jButtonNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNMouseClicked
        jButtonN.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("n")){
            Integer arr[] = getGuessIndex('n');
            drawAnswer(arr, "n");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonNMouseClicked

    private void jButtonOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOMouseClicked
        jButtonO.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("o")){
            Integer arr[] = getGuessIndex('o');
            drawAnswer(arr, "o");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonOMouseClicked

    private void jButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPMouseClicked
        jButtonP.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("p")){
            Integer arr[] = getGuessIndex('p');
            drawAnswer(arr, "p");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonPMouseClicked

    private void jButtonQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQMouseClicked
        jButtonQ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("q")){
            Integer arr[] = getGuessIndex('q');
            drawAnswer(arr, "q");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonQMouseClicked

    private void jButtonRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRMouseClicked
        jButtonR.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("r")){
            Integer arr[] = getGuessIndex('r');
            drawAnswer(arr, "r");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonRMouseClicked

    private void jButtonSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSMouseClicked
        jButtonS.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("s")){
            Integer arr[] = getGuessIndex('s');
            drawAnswer(arr, "s");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonSMouseClicked

    private void jButtonTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTMouseClicked
        jButtonT.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("t")){
            Integer arr[] = getGuessIndex('t');
            drawAnswer(arr, "t");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonTMouseClicked

    private void jButtonUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUMouseClicked
        jButtonU.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("u")){
            Integer arr[] = getGuessIndex('u');
            drawAnswer(arr, "u");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonUMouseClicked

    private void jButtonVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVMouseClicked
        jButtonV.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("v")){
            Integer arr[] = getGuessIndex('v');
            drawAnswer(arr, "v");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonVMouseClicked

    private void jButtonWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWMouseClicked
        jButtonW.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("w")){
            Integer arr[] = getGuessIndex('w');
            drawAnswer(arr, "w");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonWMouseClicked

    private void jButtonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXMouseClicked
        jButtonX.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("x")){
            Integer arr[] = getGuessIndex('x');
            drawAnswer(arr, "x");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonXMouseClicked

    private void jButtonYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonYMouseClicked
        jButtonY.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("y")){
            Integer arr[] = getGuessIndex('y');
            drawAnswer(arr, "y");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonYMouseClicked

    private void jButtonZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZMouseClicked
        jButtonZ.setEnabled(false);        // TODO add your handling code here:
        if(isInWord("z")){
            Integer arr[] = getGuessIndex('z');
            drawAnswer(arr, "z");
        }  
        else{
            wrongGuess();
        }
    }//GEN-LAST:event_jButtonZMouseClicked

    private void jButtonSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSkipActionPerformed
        SkipFrame skip = new SkipFrame();
        this.setVisible(false);
        skip.setVisible(true);   
        skip.setLocationRelativeTo(null);
        score = 0;
        System.out.println(score);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSkipActionPerformed

  
    
     
  

    private boolean isInWord(String letter)
    {
        return (name.getText().contains(letter));
    }
    
    private void wrongGuess()
    {
        Graphics g = this.getGraphics();


        if(score >= 50)
        {
            score -= 10;
            drawHangman(g, score);
            System.out.print("score: " + score);
        }
        if(score == 40){
            ColorTrap CT = new ColorTrap(0);
            drawHangman(g, score);
            System.out.println(" You lose");
            this.setVisible(false);
            CT.setVisible(true);
            
        }
        
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
    private javax.swing.JLabel hangmanLabel;
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
    private javax.swing.JButton jButtonSkip;
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

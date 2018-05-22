/*
 * Arielle
 * Mon. Jan. 23, 2017.
 * Version 1.0
 * Multiple Choice Questions, questions page. 
 */
package ca.hdsb.gwss.ainabe.ics3u.finalPerformanceTask;

import ca.hdsb.gwss.ainabe.ics3u.u6.ArrayUtil;
import static ca.hdsb.gwss.ainabe.ics3u.u6.Method.displayArray;
import static ca.hdsb.gwss.ainabe.ics3u.u6.Method.sopl;
import java.io.File;
import java.util.Enumeration;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1ainabeari
 */
public class Questions extends javax.swing.JFrame {

    Elements questionData;
    Document doc;
    int questionNum;
    int score;
    String question;
    String a, b, c, d;
    int[] ranNum = new int[7];

    /**
     * Creates new form Questions
     */
    public Questions() {
        initComponents();

        File file = new File("Questions.xml");
        Element questions = null;

        Builder builder = new Builder();
        try {
            doc = builder.build(file);
            questions = doc.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Question Num
        questionNum = 1;
        //Get Elements
        questionData = questions.getChildElements();

        
        for( int i = 0; i < ranNum.length; i++ ) {
            ranNum[i] = -1;
        }
        
        int r;
        for( int i = 0; i < ranNum.length; i++ ) {
            do {
                r = (int) (Math.random() * 7);                
            } while( ArrayUtil.linearSearch( ranNum, r) != -1 );         
            ranNum[i] = r;
        }
        

        //Set First Question
        getQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupQuestions = new javax.swing.ButtonGroup();
        jPanelStats = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelStats = new javax.swing.JLabel();
        jLabelProgress = new javax.swing.JLabel();
        jLabelCorrect = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestion = new javax.swing.JTextArea();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabelWrong = new javax.swing.JLabel();
        jLabelRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelStats.setBackground(new java.awt.Color(0, 255, 255));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTitle.setText("Question 1/5");

        jLabelStats.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStats.setText("Stats");

        jLabelProgress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProgress.setText("Progress: 20% through");

        jLabelCorrect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCorrect.setText("Correct Answers: 0");

        javax.swing.GroupLayout jPanelStatsLayout = new javax.swing.GroupLayout(jPanelStats);
        jPanelStats.setLayout(jPanelStatsLayout);
        jPanelStatsLayout.setHorizontalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStatsLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatsLayout.createSequentialGroup()
                        .addComponent(jLabelStats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCorrect)
                            .addComponent(jLabelProgress))
                        .addGap(113, 113, 113))))
        );
        jPanelStatsLayout.setVerticalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStats)
                    .addComponent(jLabelProgress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCorrect)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanelBody.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaQuestion.setColumns(20);
        jTextAreaQuestion.setLineWrap(true);
        jTextAreaQuestion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaQuestion);

        buttonGroupQuestions.add(jRadioButtonA);
        jRadioButtonA.setText("A");
        jRadioButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAActionPerformed(evt);
            }
        });

        buttonGroupQuestions.add(jRadioButtonB);
        jRadioButtonB.setText("B");

        buttonGroupQuestions.add(jRadioButtonC);
        jRadioButtonC.setText("C");

        buttonGroupQuestions.add(jRadioButtonD);
        jRadioButtonD.setText("D");

        jLabelA.setText("It looks neater");

        jLabelB.setText("It is better for comparing two paths");

        jLabelC.setText("It is better for comparing more that two paths");

        jLabelD.setText("A and C");

        jButtonNext.setText("Next Question");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelWrong.setBackground(new java.awt.Color(255, 255, 255));
        jLabelWrong.setForeground(new java.awt.Color(255, 0, 51));
        jLabelWrong.setText(" ");

        jLabelRight.setForeground(new java.awt.Color(102, 255, 51));
        jLabelRight.setText(" ");

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jLabelWrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSubmit)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonNext))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jRadioButtonA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelA))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jRadioButtonB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelB)))
                        .addGap(12, 91, Short.MAX_VALUE)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelC)
                            .addComponent(jLabelD))))
                .addGap(72, 72, 72))
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRight, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonC)
                    .addComponent(jRadioButtonA)
                    .addComponent(jLabelA)
                    .addComponent(jLabelC))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonB)
                    .addComponent(jRadioButtonD)
                    .addComponent(jLabelB)
                    .addComponent(jLabelD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonSubmit)
                    .addComponent(jLabelWrong))
                .addGap(5, 5, 5)
                .addComponent(jLabelRight)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if (jButtonSubmit.isEnabled()) {
            jLabelWrong.setText("Please submit an answer.");
        } else {
            if (questionNum == 5) {
                new QuestionsFinal(score).setVisible(true);
                this.dispose();
            } else {
                jButtonSubmit.setEnabled(true);

                //QuestionNum
                questionNum += 1;
                jLabelTitle.setText("Question " + questionNum + "/5");

                //Score
                jLabelCorrect.setText("Correct Answers: " + score);

                //Through
                jLabelProgress.setText("Progress: " + (questionNum * 20) + "% through");

                //Get Question
                getQuestion();
                
                //Set Submit stuff to nothin
                jLabelWrong.setText("");
                jLabelRight.setText("");

            }

        }


    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // Wrong (Prototype)
        boolean selected;
        int n = 0;

        Enumeration e = buttonGroupQuestions.getElements();
        while (e.hasMoreElements()) {
            javax.swing.JRadioButton b = (javax.swing.JRadioButton) e.nextElement();
            if (b.isSelected()) {
                n++;
            }
        }
        
        if (n == 0){
           jLabelWrong.setText("Please Select Something to Sumbmit for grading."); 
        }
        else{
        jLabelWrong.setText("   ");
        jLabelRight.setText("   ");

        String ans = questionData.get(ranNum[questionNum - 1]).getFirstChildElement("correctAns").getValue();
        if (jRadioButtonA.isSelected()) {
            if (jRadioButtonA.getText().equalsIgnoreCase(ans)) {
                jLabelRight.setText("Yayyyy! " + ans + " is the correct answer!!");
                score += 1;
            } else {
                jLabelWrong.setText("Aghhhh! The correct answer is " + ans + "! So close, but so far!");
            }
        } else if (jRadioButtonB.isSelected()) {
            if (jRadioButtonB.getText().equalsIgnoreCase(ans)) {
                jLabelRight.setText("Yayyyy! " + ans + " is the correct answer!!");
                score += 1;
            } else {
                jLabelWrong.setText("Aghhhh! The correct answer is " + ans + "! So close, but so far!");
            }
        } else if (jRadioButtonC.isSelected()) {
            if (jRadioButtonC.getText().equalsIgnoreCase(ans)) {
                jLabelRight.setText("Yayyyy! " + ans + " is the correct answer!!");
                score += 1;
            } else {
                jLabelWrong.setText("Aghhhh! The correct answer is " + ans + "! So close, but so far!");
            }
        } else if (jRadioButtonD.isSelected()) {
            if (jRadioButtonD.getText().equalsIgnoreCase(ans)) {
                jLabelRight.setText("Yayyyy! " + ans + " is the correct answer!!");
                score += 1;
            } else {
                jLabelWrong.setText("Aghhhh! The correct answer is " + ans + "! So close, but so far!");
            }
        }

        //De enable
        jButtonSubmit.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    public void getQuestion() {
        //Random Num

//        ArrayList repeat = null;
        //ranNum[questionNum] = (int) (Math.random() * 7);
        sopl(ranNum[questionNum] + "");

        //Checking
        displayArray(ranNum);
        //Set Question
        question = questionData.get(ranNum[(questionNum - 1)]).getFirstChildElement("asked").getValue();
        jTextAreaQuestion.setText(question);

        //Set questions multiple choice
        a = questionData.get(ranNum[(questionNum - 1)]).getFirstChildElement("answers").getFirstChildElement("a").getValue();
        b = questionData.get(ranNum[(questionNum - 1)]).getFirstChildElement("answers").getFirstChildElement("b").getValue();
        c = questionData.get(ranNum[(questionNum - 1)]).getFirstChildElement("answers").getFirstChildElement("c").getValue();
        d = questionData.get(ranNum[(questionNum - 1)]).getFirstChildElement("answers").getFirstChildElement("d").getValue();

        jLabelA.setText(a);
        jLabelB.setText(b);
        jLabelC.setText(c);
        jLabelD.setText(d);
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
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupQuestions;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelCorrect;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelProgress;
    private javax.swing.JLabel jLabelRight;
    private javax.swing.JLabel jLabelStats;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWrong;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaQuestion;
    // End of variables declaration//GEN-END:variables
}

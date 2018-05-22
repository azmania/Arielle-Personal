/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1ainabeari
 */
public class SuperHeroQuizNew extends javax.swing.JFrame {
    Document doc;
    Element questions; 
    Elements questionData = null;
    int questionNum;
    /**
     * Creates new form SuperHeroQuizNew
     */
    public SuperHeroQuizNew() {
        initComponents();
        File file = new File("SuperQuiz.xml");
        questionNum = 1; 

        Builder builder = new Builder();
        try {
            doc = builder.build(file);
            questions = doc.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        //Get Elements
        questionData = questions.getChildElements();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelC1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelTop = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelQuestion = new javax.swing.JLabel();
        jToggleButtonContinue = new javax.swing.JToggleButton();
        jRadioButtonA = new javax.swing.JRadioButton();
        jRadioButtonC = new javax.swing.JRadioButton();
        jRadioButtonB = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaQuestion = new javax.swing.JTextArea();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jLabelD = new javax.swing.JLabel();

        jLabelC1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTop.setBackground(new java.awt.Color(255, 51, 51));

        jLabelTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 255));
        jLabelTitle.setText("What Super Hero Are You?");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabelQuestion.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(255, 0, 0));
        jLabelQuestion.setText("Question 1:");

        jToggleButtonContinue.setText("Continue");
        jToggleButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonContinueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonA);
        jRadioButtonA.setText("A");

        buttonGroup1.add(jRadioButtonC);
        jRadioButtonC.setText("C");

        buttonGroup1.add(jRadioButtonB);
        jRadioButtonB.setText("B");

        buttonGroup1.add(jRadioButtonD);
        jRadioButtonD.setText("D");

        jTextAreaQuestion.setColumns(20);
        jTextAreaQuestion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaQuestion);

        jLabelA.setText(" ");

        jLabelB.setText(" ");

        jLabelC.setText(" ");

        jLabelD.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButtonContinue)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelQuestion)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelB))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelA)))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelC)))
                        .addContainerGap(213, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuestion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonA)
                        .addComponent(jLabelA)
                        .addComponent(jLabelC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonB)
                    .addComponent(jRadioButtonD)
                    .addComponent(jLabelB)
                    .addComponent(jLabelD))
                .addGap(29, 29, 29)
                .addComponent(jToggleButtonContinue)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonContinueActionPerformed
        //aSSESSING
        switch (questionNum){
            case 1:
                if (jRadioButtonA.isSelected()){ 
                    
                }
                    
          
        } 
        
        //Variables
        questionNum++;
        
        //Question Number
        jLabelQuestion.setText("Question " + questionNum + ":");

        getQuestion();
    }//GEN-LAST:event_jToggleButtonContinueActionPerformed

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
            java.util.logging.Logger.getLogger(SuperHeroQuizNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperHeroQuizNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperHeroQuizNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperHeroQuizNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperHeroQuizNew().setVisible(true);
            }
        });
    }
    
    public void getQuestion() {
        String question;
        String a, b, c, d;
        //Set Question
        question = questionData.get((questionNum - 1)).getFirstChildElement("asked").getValue();
        jTextAreaQuestion.setText(question);

        //Set questions multiple choice
        a = questionData.get((questionNum - 1)).getFirstChildElement("answers").getFirstChildElement("a").getValue();
        b = questionData.get((questionNum - 1)).getFirstChildElement("answers").getFirstChildElement("b").getValue();
        c = questionData.get((questionNum - 1)).getFirstChildElement("answers").getFirstChildElement("c").getValue();
        d = questionData.get((questionNum - 1)).getFirstChildElement("answers").getFirstChildElement("d").getValue();

        jLabelA.setText(a);
        jLabelB.setText(b);
        jLabelC.setText(c);
        jLabelD.setText(d);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelC1;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JRadioButton jRadioButtonA;
    private javax.swing.JRadioButton jRadioButtonB;
    private javax.swing.JRadioButton jRadioButtonC;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaQuestion;
    private javax.swing.JToggleButton jToggleButtonContinue;
    // End of variables declaration//GEN-END:variables
}
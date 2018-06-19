/*
 *
 */
package edu.hdsb.gwss.muir.ics4u.u2;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * @author Wm.Muir
 * @version 2017-18.S2
 */
public class Game2048 extends javax.swing.JFrame {

    private static final int EMPTY = 0;

    private static Color[] colours = {
        new Color( 255,255,255 )
    };
    private JLabel[][] squares;
    private int[][] values;

    /**
     * Creates new form Game2048
     */
    public Game2048() {
        initComponents();

        // CREATE ARRAY OF JLABELS & VALUES;
        squares = new JLabel[4][4];
        values = new int[4][4];

        // COL 0
        squares[0][0] = jLabel00;
        squares[1][0] = jLabel10;
        squares[2][0] = jLabel20;
        squares[3][0] = jLabel30;

        // COL 1
        squares[0][1] = jLabel01;
        squares[1][1] = jLabel11;
        squares[2][1] = jLabel21;
        squares[3][1] = jLabel31;

        // COL 2
        squares[0][2] = jLabel02;
        squares[1][2] = jLabel12;
        squares[2][2] = jLabel22;
        squares[3][2] = jLabel32;

        // COL 32
        squares[0][3] = jLabel03;
        squares[1][3] = jLabel13;
        squares[2][3] = jLabel23;
        squares[3][3] = jLabel33;

        // TEST DATA
        values[0][0] = 2;
        values[0][1] = 2;

        // TEST DATA
        values[1][0] = 2;
        values[1][2] = 2;

        // TEST DATA
        values[2][1] = 2;
        values[2][3] = 2;

        // TEST DATA
        values[3][1] = 2;
        values[3][2] = 2;
        values[3][3] = 2;

        // UPDATE BOARD
        updateBoard();

    }

    public void clearBoard() {

        values = new int[4][4];

        for ( int r = 0; r < squares.length; r++ ) {
            for ( int c = 0; c < squares[r].length; c++ ) {
                squares[r][c].setText( "" );
            }
        }

        placeRandomTwo();
        placeRandomTwo();
    }

    private void placeRandomTwo() {

        boolean placed = false;

        int r, c;
        while ( !placed ) {
            r = (int) (Math.random() * 4);
            c = (int) (Math.random() * 4);

            if ( values[r][c] == EMPTY ) {
                values[r][c] = 2;
                squares[r][c].setText( "2" );
                placed = true;
            }
        }

    }

    private void updateBoard() {
        for ( int r = 0; r < squares.length; r++ ) {
            for ( int c = 0; c < squares[r].length; c++ ) {
                squares[r][c].setText( "" + values[r][c] );
            }
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

        jPanelTop = new javax.swing.JPanel();
        jPanelGameBoard = new javax.swing.JPanel();
        jLabel00 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel01 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048 Muir!");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelTop.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelGameBoard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel00.setBackground(new java.awt.Color(102, 255, 51));
        jLabel00.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel00.setText("1024");
        jLabel00.setOpaque(true);
        jLabel00.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel10.setBackground(new java.awt.Color(102, 255, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1024");
        jLabel10.setOpaque(true);
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel20.setBackground(new java.awt.Color(102, 255, 51));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("1024");
        jLabel20.setOpaque(true);
        jLabel20.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel30.setBackground(new java.awt.Color(102, 255, 51));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1024");
        jLabel30.setOpaque(true);
        jLabel30.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel01.setBackground(new java.awt.Color(102, 255, 51));
        jLabel01.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel01.setText("1024");
        jLabel01.setOpaque(true);
        jLabel01.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel11.setBackground(new java.awt.Color(102, 255, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1024");
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel21.setBackground(new java.awt.Color(102, 255, 51));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("1024");
        jLabel21.setOpaque(true);
        jLabel21.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel31.setBackground(new java.awt.Color(102, 255, 51));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("1024");
        jLabel31.setOpaque(true);
        jLabel31.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel02.setBackground(new java.awt.Color(102, 255, 51));
        jLabel02.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel02.setText("1024");
        jLabel02.setOpaque(true);
        jLabel02.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel03.setBackground(new java.awt.Color(102, 255, 51));
        jLabel03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel03.setText("1024");
        jLabel03.setOpaque(true);
        jLabel03.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel12.setBackground(new java.awt.Color(102, 255, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1024");
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel13.setBackground(new java.awt.Color(102, 255, 51));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1024");
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel22.setBackground(new java.awt.Color(102, 255, 51));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("1024");
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel23.setBackground(new java.awt.Color(102, 255, 51));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("1024");
        jLabel23.setOpaque(true);
        jLabel23.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel32.setBackground(new java.awt.Color(102, 255, 51));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("1024");
        jLabel32.setOpaque(true);
        jLabel32.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel33.setBackground(new java.awt.Color(102, 255, 51));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("1024");
        jLabel33.setOpaque(true);
        jLabel33.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanelGameBoardLayout = new javax.swing.GroupLayout(jPanelGameBoard);
        jPanelGameBoard.setLayout(jPanelGameBoardLayout);
        jPanelGameBoardLayout.setHorizontalGroup(
            jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel00, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel01, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel02, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel03, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanelGameBoardLayout.setVerticalGroup(
            jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel02, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel03, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelGameBoardLayout.createSequentialGroup()
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel00, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel01, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelGameBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelGameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.print( "KEY PRESSED: " );
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println( "UP" );
                break;
            case KeyEvent.VK_DOWN:
                System.out.println( "DOWN" );
                break;
            case KeyEvent.VK_LEFT:
                System.out.println( "LEFT" );
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println( "RIGHT" );
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] ) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if ( "Nimbus".equals( info.getName() ) ) {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        } catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger( Game2048.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Game2048.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Game2048.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Game2048.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Game2048().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel00;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel02;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanelGameBoard;
    private javax.swing.JPanel jPanelTop;
    // End of variables declaration//GEN-END:variables
}

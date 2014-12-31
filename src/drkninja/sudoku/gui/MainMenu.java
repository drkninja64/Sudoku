/*
 * Sudoku Game
 * Sajag made this!!
 */
package drkninja.sudoku.gui;

import drkninja.sudoku.util.ReferenceD;
import java.awt.Toolkit;

/**
 *
 * @author Admin
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setVisible(true);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SudoCover = new javax.swing.JLabel();
        NewGameBN = new javax.swing.JButton();
        QuitBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setResizable(false);

        SudoCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drkninja/sudoku/res/SudoCover.png"))); // NOI18N

        NewGameBN.setText("New Game !!");
        NewGameBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameBNActionPerformed(evt);
            }
        });

        QuitBN.setText("Quit :(");
        QuitBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SudoCover)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewGameBN, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuitBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SudoCover, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewGameBN)
                    .addComponent(QuitBN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewGameBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameBNActionPerformed
        new SetDifficulty();
        this.dispose();
    }//GEN-LAST:event_NewGameBNActionPerformed

    private void QuitBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitBNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewGameBN;
    private javax.swing.JButton QuitBN;
    private javax.swing.JLabel SudoCover;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(ReferenceD.ICON_PATH)));
    }
    
    
}

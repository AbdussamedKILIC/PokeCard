/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame;

import pokemoncardgame.models.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author askilic
 */
public class GameMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form gameInterface
     */
    //ArrayList<Pokemon> cardList = new ArrayList<>();
    public GameMainMenu() {
        initComponents();
    }
    
    /*public GameMainMenu(ArrayList<Pokemon> cardList){
        this.cardList = cardList;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gameTitlePictureLabel = new javax.swing.JLabel();
        pVcButton = new javax.swing.JButton();
        cVcButton = new javax.swing.JButton();
        instructionButton = new javax.swing.JButton();
        exitToGame = new javax.swing.JButton();
        gamePictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameTitlePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainTitlePicsInGameMainMenu.jpeg"))); // NOI18N
        gameTitlePictureLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(gameTitlePictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 310, 160));

        pVcButton.setText("PlayerVsComputer");
        pVcButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pVcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pVcButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pVcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 210, -1));

        cVcButton.setText("ComputerVsComputer");
        cVcButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cVcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVcButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cVcButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 210, -1));

        instructionButton.setText("Instructions");
        instructionButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        instructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(instructionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 210, -1));

        exitToGame.setText("Exit");
        exitToGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitToGameActionPerformed(evt);
            }
        });
        jPanel1.add(exitToGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 210, -1));

        gamePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundPİcsInGameMainMenu.png"))); // NOI18N
        gamePictureLabel.setText("jLabel2");
        jPanel1.add(gamePictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
            
    
    private void pVcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pVcButtonActionPerformed
        // TODO add your handling code here:  
        GameArena arena = new GameArena();
        arena.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_pVcButtonActionPerformed

    private void cVcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cVcButtonActionPerformed
        // TODO add your handling code here:
        GameArena2 arena = new GameArena2();
        arena.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cVcButtonActionPerformed

    private void instructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionButtonActionPerformed
        // TODO add your handling code here:
        GameInstruction button = new GameInstruction();
        button.setVisible(true);
        
    }//GEN-LAST:event_instructionButtonActionPerformed

    private void exitToGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitToGameActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitToGameActionPerformed

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
            java.util.logging.Logger.getLogger(GameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                new GameMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cVcButton;
    private javax.swing.JButton exitToGame;
    private javax.swing.JLabel gamePictureLabel;
    private javax.swing.JLabel gameTitlePictureLabel;
    private javax.swing.JButton instructionButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pVcButton;
    // End of variables declaration//GEN-END:variables
}

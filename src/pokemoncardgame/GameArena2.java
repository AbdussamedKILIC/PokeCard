/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import pokemoncardgame.models.Pokemon;
import pokemoncardgame.models.Bulbasaur;
import pokemoncardgame.models.Butterfree;
import pokemoncardgame.models.Charmander;
import pokemoncardgame.models.Jigglypuff;
import pokemoncardgame.models.Meowth;
import pokemoncardgame.models.Pikachu;
import pokemoncardgame.models.Psyduck;
import pokemoncardgame.models.Snorlax;
import pokemoncardgame.models.Squirtle;
import pokemoncardgame.models.Zubat;

/**
 *
 * @author askilic
 */
public class GameArena2 extends javax.swing.JFrame {

    /**
     * Creates new form GameArena2
     */
    public GameArena2() {
        initComponents();
        generateRandomPokeCardList();
    }

    ComputerGamer computer1;
    PlayerGamer computer2;
    List<Pokemon> pokeList;
    //List<Pokemon> pokeList2;
    int Score1 = 0;
    int Score2 = 0;

    private void generateRandomPokeCardList() {

        Bulbasaur b = new Bulbasaur();
        Butterfree bf = new Butterfree();
        Charmander c = new Charmander();
        Jigglypuff j = new Jigglypuff();
        Meowth m = new Meowth();
        Pikachu p = new Pikachu();
        Psyduck pd = new Psyduck();
        Snorlax s = new Snorlax();
        Squirtle sq = new Squirtle();
        Zubat z = new Zubat();

        computer1 = new ComputerGamer();
        computer2 = new PlayerGamer();

        pokeList = new ArrayList<Pokemon>();
        /*pokeList2 = new ArrayList<Pokemon>();

        int random = (int) (Math.random() * 10);
        System.out.println(random);

        if (random <= 5) {
            pokeList.add(b);
            pokeList2.add(bf);
            pokeList.add(c);
            pokeList2.add(j);
            pokeList.add(m);
            pokeList2.add(p);
            pokeList.add(pd);
            pokeList2.add(s);
            pokeList.add(sq);
            pokeList2.add(z);
        } else {
            pokeList2.add(b);
            pokeList.add(bf);
            pokeList2.add(c);
            pokeList.add(j);
            pokeList2.add(m);
            pokeList.add(p);
            pokeList2.add(pd);
            pokeList.add(s);
            pokeList2.add(sq);
            pokeList.add(z);
        }*/
       
        pokeList.add(b);
        pokeList.add(bf);
        pokeList.add(c);
        pokeList.add(j);
        pokeList.add(m);
        pokeList.add(p);
        pokeList.add(pd);
        pokeList.add(s);
        pokeList.add(sq);
        pokeList.add(z);

        computer1.setCardList(pokeList);
        computer2.setCardList(pokeList);
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
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

        arenaPanel = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        player1activecard = new javax.swing.JLabel();
        player2activecard = new javax.swing.JLabel();
        computer1place = new javax.swing.JLabel();
        computer2place = new javax.swing.JLabel();
        arenaPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(975, 640));
        setSize(new java.awt.Dimension(975, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arenaPanel.setPreferredSize(new java.awt.Dimension(975, 640));
        arenaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start.setText("Start(round by round)");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        arenaPanel.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 40));

        player1activecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battleCardPlace.jpg"))); // NOI18N
        arenaPanel.add(player1activecard, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 220, 310));

        player2activecard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battleCardPlace.jpg"))); // NOI18N
        arenaPanel.add(player2activecard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 310));

        computer1place.setFont(new java.awt.Font("Ubuntu", 3, 30)); // NOI18N
        computer1place.setForeground(new java.awt.Color(158, 23, 23));
        arenaPanel.add(computer1place, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 260, 30));

        computer2place.setFont(new java.awt.Font("Ubuntu", 3, 30)); // NOI18N
        computer2place.setForeground(new java.awt.Color(158, 23, 23));
        arenaPanel.add(computer2place, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 260, 30));

        arenaPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gameArena1.png"))); // NOI18N
        arenaPic.setPreferredSize(new java.awt.Dimension(975, 640));
        arenaPanel.add(arenaPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(arenaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        Pokemon p1 = computer1.getRandomCard();

        try {
            BufferedImage nulPic = ImageIO.read(new File("src/images/nulpic.jpeg"));
            if (p1 == null) {

                player2activecard.setIcon(new ImageIcon(nulPic));
            } else {
                BufferedImage p1Pic = ImageIO.read(new File(p1.getPokemonURL()));
                player2activecard.setIcon(new ImageIcon(p1Pic));
            }
        } catch (IOException ex) {
            Logger.getLogger(GameArena2.class.getName()).log(Level.SEVERE, null, ex);
        }

        wait(1500);

        Pokemon p2 = computer2.getRandomCard();

        try {

            BufferedImage nulPic = ImageIO.read(new File("src/images/nulpic.jpeg"));
            if (p2 == null) {
                player1activecard.setIcon(new ImageIcon(nulPic));
            } else {
                BufferedImage p2Pic = ImageIO.read(new File(p2.getPokemonURL()));
                player1activecard.setIcon(new ImageIcon(p2Pic));
            }

        } catch (IOException ex) {
            Logger.getLogger(GameArena2.class.getName()).log(Level.SEVERE, null, ex);
        }

        int p1AttackDamage;
        int p2AttackDamage;
        if (p1 != null && p2 != null) {
            p1AttackDamage = p1.showAttackPower();
            p2AttackDamage = p2.showAttackPower();
            if (p1AttackDamage > p2AttackDamage) {
                Score1 += 5;
            }
            if (p2AttackDamage > p1AttackDamage) {
                Score2 += 5;
            }

            computer1.setScore(Score1);
            computer2.setScore(Score2);
        }

        if (p1 == null && p2 == null) {
            if (Score1 > Score2) {
                JOptionPane.showMessageDialog(null, "computer1 : " + computer1.getScore()
                        + " puanla kazanmıştır");
            } else if (Score2 > Score1) {
                JOptionPane.showMessageDialog(null, "computer2 : " + computer2.getScore()
                        + " puanla kazamıştır");
            } else {
                JOptionPane.showMessageDialog(null, " computer1 : " + computer1.getScore()
                        + " \n computer2 : " + computer2.getScore()
                        + " \n puanlarla berabere kalmıştır");
            }
            setVisible(false);
            GameMainMenu again = new GameMainMenu();
            again.setVisible(true);
        }
        computer1place.setText("COMPUTER1 : " + computer1.getScore());
        computer2place.setText("COMPUTER2 : " + computer2.getScore());


    }//GEN-LAST:event_StartActionPerformed

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
            java.util.logging.Logger.getLogger(GameArena2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameArena2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameArena2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameArena2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameArena2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JPanel arenaPanel;
    private javax.swing.JLabel arenaPic;
    private javax.swing.JLabel computer1place;
    private javax.swing.JLabel computer2place;
    private javax.swing.JLabel player1activecard;
    private javax.swing.JLabel player2activecard;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.pokemonsele;

import Atxy2k.CustomTextField.RestrictedTextField;
import Interfaz.masculino;
import pelea.Bullpelea;

/**
 *
 * @author ASUS
 */
public class Bullbasaur extends javax.swing.JFrame {

    
    
    public Bullbasaur() {
        initComponents();
        this.setLocationRelativeTo(null);
        RestrictedTextField r = new RestrictedTextField(motebul);
        r.setLimit(10);
        jButton4.setEnabled(false);
        motebul.setEnabled(false);
        
        
        
                 
    }
    public String Nom = "";
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        motebul = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btsi = new javax.swing.JRadioButton();
        btno = new javax.swing.JRadioButton();
        jprint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Genial has elegido ha Bullbasaur, Desea ponerle un mote ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 26));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bulba_1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 120));

        motebul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motebulActionPerformed(evt);
            }
        });
        getContentPane().add(motebul, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-flecha-filled-50 (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 50, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-32.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 50, 30));

        buttonGroup1.add(btsi);
        btsi.setText("SI");
        btsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiActionPerformed(evt);
            }
        });
        getContentPane().add(btsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 20));

        buttonGroup1.add(btno);
        btno.setText("NO");
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoActionPerformed(evt);
            }
        });
        getContentPane().add(btno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, 20));

        jprint.setForeground(java.awt.Color.red);
        getContentPane().add(jprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        masculino m = new masculino();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void motebulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motebulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motebulActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Bullpelea bp = new Bullpelea();
        motebul.setEnabled(true);
                  
        if(btsi.isSelected() && motebul.getText().isEmpty()){
            jprint.setText("*requerido");
        }
        else if(btno.isSelected()){
            Nom = "Bullbasaur";           
            bp.setVisible(true);
            
        }
        else{
            Nom = motebul.getText();
            bp.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoActionPerformed
        jButton4.setEnabled(true);
        motebul.setEnabled(false);
        jprint.setText("");

        

    }//GEN-LAST:event_btnoActionPerformed

    private void btsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiActionPerformed
        jButton4.setEnabled(true);
        motebul.setEnabled(true);
    }//GEN-LAST:event_btsiActionPerformed

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
            java.util.logging.Logger.getLogger(Bullbasaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bullbasaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bullbasaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bullbasaur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bullbasaur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btno;
    private javax.swing.JRadioButton btsi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jprint;
    private javax.swing.JTextField motebul;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.view;

import com.google.gson.Gson;
import ec.edu.espe.MechanicSystem.view.ProcessToRegister;
import ec.edu.espe.MechanicSystem.model.NewUser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Inforlan
 */
public class frmRegister extends javax.swing.JFrame {

    
    
    
    /**
     * Creates new form frmRegister
     */
    public frmRegister() {
        initComponents();
        setLocationRelativeTo(null);
         rootPane.setDefaultButton(btnSave);
         
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtInsUsername = new javax.swing.JTextField();
        psfInsPassword = new javax.swing.JPasswordField();
        lblInsUsername = new javax.swing.JLabel();
        lblInsPassword = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblFondoRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 290, 70, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        txtInsUsername.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txtInsUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInsUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtInsUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 150, 30));

        psfInsPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        psfInsPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(psfInsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 150, 30));

        lblInsUsername.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblInsUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblInsUsername.setText("Insert a username:");
        getContentPane().add(lblInsUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        lblInsPassword.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblInsPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblInsPassword.setText("Insert a password:");
        getContentPane().add(lblInsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        lblRegister.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("REGISTER");
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        lblFondoRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frmRegister.jpg"))); // NOI18N
        getContentPane().add(lblFondoRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frmLogin frmlogin = new frmLogin();
        frmlogin.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
           FileWriter fw = null;
           PrintWriter pw = null;
        
        try {
            fw = new FileWriter("usuarios.txt",true);
            pw = new PrintWriter(fw);
            String username = txtInsUsername.getText();
            String password = psfInsPassword.getText();
            char[] passwordCoded = password.toCharArray();
            for(int i=0; i< password.length();i++){

                passwordCoded[i] = (char) ((int)passwordCoded[i]+ 2);
                
            }
            password = "";
            for(int i=0; i< passwordCoded.length;i++){

                password+=passwordCoded[i];
                
            }

            pw.println( "{'user' :" + username +';'+"'password' " + password);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmLogin m = new frmLogin();
        m.setVisible(true);
        this.setVisible(false);
        Gson gson = new Gson();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtInsUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblFondoRegister;
    private javax.swing.JLabel lblInsPassword;
    private javax.swing.JLabel lblInsUsername;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPasswordField psfInsPassword;
    private javax.swing.JTextField txtInsUsername;
    // End of variables declaration//GEN-END:variables
}

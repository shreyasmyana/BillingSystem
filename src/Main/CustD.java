/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shreyas
 */
public class CustD extends javax.swing.JFrame {

    /**
     * Creates new form CustD
     */
    public CustD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Name_txt = new javax.swing.JTextField();
        Contct_txt = new javax.swing.JTextField();
        Email_txt = new javax.swing.JTextField();
        ADD_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 154, 84, 31));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email-ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 253, 84, 31));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contact No.:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 206, 84, 25));

        Name_txt.setBackground(new java.awt.Color(204, 204, 204));
        Name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 155, 200, 31));

        Contct_txt.setBackground(new java.awt.Color(204, 204, 204));
        Contct_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contct_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Contct_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 204, 200, 31));

        Email_txt.setBackground(new java.awt.Color(204, 204, 204));
        Email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 253, 200, 33));

        ADD_btn.setBackground(new java.awt.Color(204, 204, 204));
        ADD_btn.setForeground(new java.awt.Color(0, 0, 0));
        ADD_btn.setText("ADD");
        ADD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_btnActionPerformed(evt);
            }
        });
        jPanel1.add(ADD_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 299, 81, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enter Customer Details:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 204, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/cust.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_txtActionPerformed

    private void Contct_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contct_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contct_txtActionPerformed

    private void Email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_txtActionPerformed

    private void ADD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_btnActionPerformed
        if(Name_txt.getText().equals("")||Contct_txt.getText().equals("")||Email_txt.equals("")){
     JOptionPane.showMessageDialog(null,"Field Cannot be left Empty"); 
  }else{    
        
        Connection con = DB.getConnection();
            
            String name=Name_txt.getText();
            String ContctNo=Contct_txt.getText();
            String Email=Email_txt.getText();
try{
            PreparedStatement ps = con.prepareStatement("insert into cust(Name,Email,PhoneNo) values(?,?,?)" );
            ps.setString(1,name);    
            ps.setString(2,Email);
            ps.setString(3,ContctNo);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Customer Added Sucessfully");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Customer Already Exist");
            e.printStackTrace();
        }
          }
    }//GEN-LAST:event_ADD_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_btn;
    private javax.swing.JTextField Contct_txt;
    private javax.swing.JTextField Email_txt;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshal
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Payment() {
        initComponents();
        Connect();
    }
    
       Connection con;
    preparedStatement pst ;
     ResultSet rs;
     public boolean payment(){
          String cardno,cardholder,cardvald,cvv,price,amount;
      
     cardno = txtcn.getText();
     cardholder = txthn.getText();
     cardvald = txtcv.getText();
     cvv = txtcvv.getText();
     price = txtun.getText();
     amount = txtam.getText();
     
     if(cardno.equals("")){
     JOptionPane.showMessageDialog(this,"please enter card number");
     return false;
     }
     if(cardholder.equals("")){
     JOptionPane.showMessageDialog(this,"please enter card holder name");
     return false;
     }
     if(cardvald.equals("")){
     JOptionPane.showMessageDialog(this,"please enter card validity");
     return false;
     }
     if(cvv.equals("")){
     JOptionPane.showMessageDialog(this,"please enter CVV");
     return false;
     }
     if(price.equals("")){
     JOptionPane.showMessageDialog(this,"please enter price");
     return false;
     }
      if(amount.equals("")){
     JOptionPane.showMessageDialog(this,"please enter Amount");
     return false;
     }
     return true;
     }
    
    
    
     
    public void Connect(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/railway?zeroDateTimeBehavior=CONVERT_TO_NULL","harshal", "harshal");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addtrain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    
      public void load()
    {
        try {
            String username = txtun.getText();
           
            
              
             PreparedStatement pst =  con.prepareStatement("select * from reservation where username = ?");
            
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            if ( rs.next()== true)
            {
                                  
                 txtam.setText(rs.getString(10));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Receipt1.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txthn = new javax.swing.JTextField();
        txtcv = new javax.swing.JTextField();
        txtcn = new javax.swing.JTextField();
        txtcvv = new javax.swing.JTextField();
        txtun = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Payment");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Card Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Card Holder Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Card Validity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CVV");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Amount");

        txthn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txthn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthnFocusLost(evt);
            }
        });
        txthn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthnActionPerformed(evt);
            }
        });

        txtcv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcvFocusLost(evt);
            }
        });
        txtcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcvActionPerformed(evt);
            }
        });

        txtcn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnFocusLost(evt);
            }
        });
        txtcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnActionPerformed(evt);
            }
        });

        txtcvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcvvActionPerformed(evt);
            }
        });

        txtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunActionPerformed(evt);
            }
        });
        txtun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtunKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("PayNow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Reset");

        txtam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtun, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcvv, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcv, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(txthn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtam, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(285, 285, 285))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcvv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthnActionPerformed

    private void txtcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcvActionPerformed

    private void txtcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnActionPerformed
        
    }//GEN-LAST:event_txtcnActionPerformed

    private void txtcvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcvvActionPerformed

    private void txtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(payment()==true){
        JOptionPane.showMessageDialog(this,"Payment successfully");
        Receipt1 r = new Receipt1();
        r.show();
        dispose();
        
        }
     
     
     
     
     
     
     
     
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnFocusGained
        
    }//GEN-LAST:event_txtcnFocusGained

    private void txtcnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnFocusLost
       
    }//GEN-LAST:event_txtcnFocusLost

    private void txthnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthnFocusGained

    }//GEN-LAST:event_txthnFocusGained

    private void txthnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthnFocusLost
      
    }//GEN-LAST:event_txthnFocusLost

    private void txtcvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcvFocusGained
       
    }//GEN-LAST:event_txtcvFocusGained

    private void txtcvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcvFocusLost
      
    }//GEN-LAST:event_txtcvFocusLost

    private void txtamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamActionPerformed

    private void txtunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunKeyPressed

        
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
       
              load();
       
       }         // TODO add your handling code here:
    }//GEN-LAST:event_txtunKeyPressed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtam;
    private javax.swing.JTextField txtcn;
    private javax.swing.JTextField txtcv;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txthn;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables

    private static class preparedStatement {

        public preparedStatement() {
        }

        private void setString(int i, String username) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private ResultSet executeQuery() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

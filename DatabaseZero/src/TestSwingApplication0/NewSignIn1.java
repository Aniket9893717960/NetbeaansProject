/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSwingApplication0;
import TestSwingApplication0.connectivity.DBConnector;
import java.time.LocalDate;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class NewSignIn1 extends javax.swing.JFrame 
{
 Connection con= null;
        Statement st= null; 
       LocalDate date = null;
      
    /**
     * Creates new form NewSignIn1
     */
    public NewSignIn1() {
        
//anyMistackOccurLabel1.setVisible(false);
        initComponents();
  st = DBConnector.getStatement();
 
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
        fullnameLabel1 = new javax.swing.JLabel();
        fullNameTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lastNameTextField1 = new javax.swing.JTextField();
        lastnameLabel1 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        emailTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addressLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea1 = new javax.swing.JTextArea();
        streetAddressLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea2 = new javax.swing.JTextArea();
        StreetAddressLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cityTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stateTextArea1 = new javax.swing.JTextArea();
        stateProvinceLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        zipcodeTextArea1 = new javax.swing.JTextArea();
        postalZipCodeLabel5 = new javax.swing.JLabel();
        phoneNoLabel6 = new javax.swing.JLabel();
        submitButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        anyMistackOccurLabel1 = new javax.swing.JLabel();
        phoneNoText1 = new javax.swing.JTextField();
        invalidmessage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRATION PAGE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 102, 255))); // NOI18N

        fullnameLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        fullnameLabel1.setText("Full  Name");

        fullNameTextField1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel1.setText("First Name");

        lastNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        lastnameLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lastnameLabel1.setText("Last Name");
        lastnameLabel1.setToolTipText("");

        emailLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        emailLabel1.setText("Email ID");

        emailTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        emailTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel2.setText("example@gmail.com");

        addressLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        addressLabel3.setText("Address");

        addressTextArea1.setColumns(20);
        addressTextArea1.setRows(5);
        jScrollPane1.setViewportView(addressTextArea1);

        streetAddressLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        streetAddressLabel1.setText("Street Address");

        addressTextArea2.setColumns(20);
        addressTextArea2.setRows(5);
        jScrollPane2.setViewportView(addressTextArea2);

        StreetAddressLabel3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        StreetAddressLabel3.setText("Street Address Line 2");

        cityTextArea1.setColumns(20);
        cityTextArea1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        cityTextArea1.setRows(5);
        jScrollPane3.setViewportView(cityTextArea1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel3.setText("City");

        stateTextArea1.setColumns(20);
        stateTextArea1.setRows(5);
        jScrollPane4.setViewportView(stateTextArea1);

        stateProvinceLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        stateProvinceLabel5.setText("State / Province");

        zipcodeTextArea1.setColumns(20);
        zipcodeTextArea1.setRows(5);
        jScrollPane5.setViewportView(zipcodeTextArea1);

        postalZipCodeLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        postalZipCodeLabel5.setText("Postal / Zip Code");

        phoneNoLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        phoneNoLabel6.setText("Phone Number");

        submitButton1.setBackground(new java.awt.Color(153, 255, 255));
        submitButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        submitButton1.setForeground(new java.awt.Color(153, 153, 255));
        submitButton1.setText("SUBMIT");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Exit");

        anyMistackOccurLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        anyMistackOccurLabel1.setForeground(new java.awt.Color(255, 0, 0));
        anyMistackOccurLabel1.setText("*Some blocks are empty plese fill all Options");

        phoneNoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoText1ActionPerformed(evt);
            }
        });

        invalidmessage1.setForeground(new java.awt.Color(255, 0, 51));
        invalidmessage1.setText("Invalid phone number! Phone number should have 10 digits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stateProvinceLabel5)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postalZipCodeLabel5)
                            .addComponent(streetAddressLabel1)
                            .addComponent(StreetAddressLabel3))
                        .addContainerGap(576, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(submitButton1))
                            .addComponent(anyMistackOccurLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullnameLabel1)
                                    .addComponent(emailLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(addressLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(fullNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnameLabel1))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phoneNoText1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(invalidmessage1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phoneNoLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(fullnameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel1))
                .addGap(27, 27, 27)
                .addComponent(emailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streetAddressLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StreetAddressLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stateProvinceLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postalZipCodeLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phoneNoLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidmessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phoneNoText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anyMistackOccurLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        String firstname = fullNameTextField1.getText();     
        String lastname = lastNameTextField1.getText();
        String mailid = emailTextField1.getText();
        String phoneNo=phoneNoText1.getText();
        String address= addressTextArea1.getText();
        String address2 = addressTextArea2.getText();
        String city = cityTextArea1.getText();
        String state = stateTextArea1.getText();
        String zipcode = zipcodeTextArea1.getText();
        
        
        
                
        
          try
          {
               String query = "INSERT INTO emp(`empname`,`emplastname`,`empmailid`,`empDepartment`,`empWorking`,`empaddress`,`empaddress2`,`empsalary`,`emppassword`,`empcity`,`empstate`,`empsex`,`empzipcode`,`emphoneno`) VALUES ('"+firstname+"','"+lastname+"','"+mailid+"',NULL,NULL,'"+address+"','"+address2+"',NULL,NULL,'"+city+"','"+state+"',NULL,'"+zipcode+"','"+phoneNo+"')";
            
              System.out.println("Query="+query);
              st.executeUpdate(query);
            con.close();
              
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
          if(firstname!=null && lastname!=null && mailid!=null &&  mailid!=null && city!=null && state!=null && zipcode!=null && !mailid.endsWith("gmail.com"))
            {
                System.out.println("Record inserted");
                 NewSetPassword nh1 = new NewSetPassword(firstname);
                 nh1.setVisible(true);
                 this.setVisible(false);
                 
            }
            else
            {
                System.out.println("Record insreted failed");
                anyMistackOccurLabel1.setVisible(true);
            }
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void emailTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextField1ActionPerformed
        
    }//GEN-LAST:event_emailTextField1ActionPerformed

    private void phoneNoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoText1ActionPerformed
        // TODO add your handling code here:
        String phoneNumber =phoneNoText1.getText();
        if(phoneNumber.length() !=10){
            invalidmessage1.setVisible(true);
        }
    }//GEN-LAST:event_phoneNoText1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewSignIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSignIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSignIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSignIn1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new NewSignIn1().setVisible(true);
                NewSignIn1 ns1 = new  NewSignIn1();
            }
        
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StreetAddressLabel3;
    private javax.swing.JLabel addressLabel3;
    private javax.swing.JTextArea addressTextArea1;
    private javax.swing.JTextArea addressTextArea2;
    private javax.swing.JLabel anyMistackOccurLabel1;
    private javax.swing.JTextArea cityTextArea1;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JTextField fullNameTextField1;
    private javax.swing.JLabel fullnameLabel1;
    private javax.swing.JLabel invalidmessage1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField lastNameTextField1;
    private javax.swing.JLabel lastnameLabel1;
    private javax.swing.JLabel phoneNoLabel6;
    private javax.swing.JTextField phoneNoText1;
    private javax.swing.JLabel postalZipCodeLabel5;
    private javax.swing.JLabel stateProvinceLabel5;
    private javax.swing.JTextArea stateTextArea1;
    private javax.swing.JLabel streetAddressLabel1;
    private javax.swing.JButton submitButton1;
    private javax.swing.JTextArea zipcodeTextArea1;
    // End of variables declaration//GEN-END:variables
}
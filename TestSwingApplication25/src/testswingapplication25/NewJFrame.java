/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswingapplication25;

import java.awt.Color;
import static java.awt.Color.YELLOW;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INDIA
 */
public class NewJFrame extends javax.swing.JFrame {

    
        Connection con= null;
        Statement st= null;
        ResultSet rs= null;
        /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
       
        
        initComponents();
        usernamePasswordMessageLabel1.setVisible(false);
         try
        {
            Class.forName("com.mysql.jdbc.Driver");//if any problem found then jrh will treate those error
//Driver is a class which is under jdbc package and the campany name in last 
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root");//This is the connectivity url
            System.out.println("Connected");
            
            st = con.createStatement();
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
    }
        catch(SQLException ex)
        {
            System.out.println(ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        registrationPanel2 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JButton();
        usernameLabel2 = new javax.swing.JLabel();
        usernameTextField2 = new javax.swing.JTextField();
        mailidLabel3 = new javax.swing.JLabel();
        mailidTextField1 = new javax.swing.JTextField();
        usernameLabel3 = new javax.swing.JLabel();
        CityBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        usernameLabel4 = new javax.swing.JLabel();
        logiinPanel1 = new javax.swing.JPanel();
        usernameLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        UsernameTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        submitButton1 = new javax.swing.JButton();
        resetButton1 = new javax.swing.JButton();
        usernamePasswordMessageLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));

        registrationPanel2.setBackground(new java.awt.Color(255, 153, 255));
        registrationPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRATIION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        exitButton1.setBackground(new java.awt.Color(255, 153, 153));
        exitButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(51, 0, 51));
        exitButton1.setText("EXIT");
        exitButton1.setToolTipText("Exit Button");
        exitButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButton1MouseExited(evt);
            }
        });
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        usernameLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel2.setText("USERNAME -:");

        usernameTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField2ActionPerformed(evt);
            }
        });

        mailidLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mailidLabel3.setText("MAIL.ID  -:");

        mailidTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mailidTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailidTextField1ActionPerformed(evt);
            }
        });

        usernameLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel3.setText("CITY  -:");

        CityBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CityBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indore", "Ujjain", "Dewas", "Dhar", "Batama" }));
        CityBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        usernameLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel4.setText("Gendar  -:");

        javax.swing.GroupLayout registrationPanel2Layout = new javax.swing.GroupLayout(registrationPanel2);
        registrationPanel2.setLayout(registrationPanel2Layout);
        registrationPanel2Layout.setHorizontalGroup(
            registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationPanel2Layout.createSequentialGroup()
                .addGap(0, 414, Short.MAX_VALUE)
                .addComponent(exitButton1))
            .addGroup(registrationPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameLabel2)
                        .addComponent(usernameLabel3)
                        .addComponent(mailidLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(usernameLabel4))
                .addGap(18, 18, 18)
                .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailidTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registrationPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registrationPanel2Layout.setVerticalGroup(
            registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registrationPanel2Layout.createSequentialGroup()
                        .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel2)
                            .addComponent(usernameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailidLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailidTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CityBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLabel3)))
                .addGroup(registrationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(usernameLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(exitButton1))
        );

        logiinPanel1.setBackground(new java.awt.Color(153, 153, 255));
        logiinPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        usernameLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usernameLabel1.setText("USERNAME :");

        passwordLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordLabel2.setText("PASSWORD :");

        UsernameTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UsernameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField1.setText("jPasswordField1");

        submitButton1.setBackground(new java.awt.Color(255, 255, 204));
        submitButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitButton1.setText("SUBMIT");
        submitButton1.setToolTipText("Submit Button");
        submitButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButton1MouseExited(evt);
            }
        });
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        resetButton1.setBackground(new java.awt.Color(255, 255, 153));
        resetButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetButton1.setForeground(new java.awt.Color(51, 0, 51));
        resetButton1.setText("RESET");
        resetButton1.setToolTipText("Reset Button");
        resetButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButton1MouseExited(evt);
            }
        });
        resetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton1ActionPerformed(evt);
            }
        });

        usernamePasswordMessageLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        usernamePasswordMessageLabel1.setForeground(new java.awt.Color(255, 0, 0));
        usernamePasswordMessageLabel1.setText("*Username or Password May Incorrect .....");

        javax.swing.GroupLayout logiinPanel1Layout = new javax.swing.GroupLayout(logiinPanel1);
        logiinPanel1.setLayout(logiinPanel1Layout);
        logiinPanel1Layout.setHorizontalGroup(
            logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logiinPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logiinPanel1Layout.createSequentialGroup()
                        .addComponent(usernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UsernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logiinPanel1Layout.createSequentialGroup()
                        .addComponent(passwordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetButton1)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernamePasswordMessageLabel1))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logiinPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton1))
        );
        logiinPanel1Layout.setVerticalGroup(
            logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logiinPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel1)
                    .addComponent(UsernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(logiinPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton1)
                .addGap(18, 18, 18)
                .addComponent(usernamePasswordMessageLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(submitButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logiinPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logiinPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
          String username = UsernameTextField1.getText();      
          char pass[] = jPasswordField1.getPassword();
          String password = new String(pass);
          String tablePassword = "";
          
          try
          {
              String query = "SELECT emppassword FROM emp WHERE empname='"+username+"'";
              System.out.println("Query ="+query);
              
              rs =st.executeQuery(query);
              if(rs.next())
                      {
                         tablePassword= rs.getString(1);
                      }
              else{
                 usernamePasswordMessageLabel1.setVisible(true);
              }
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         /// System.out.println("Username ="+username);
          //System.out.println("Password ="+password);
          
          if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
          {
              //System.out.println("Login Successfull");
              NewHomePage1 nh1 = new NewHomePage1(username);
              nh1.setVisible(true);
              this.setVisible(false);
          }
          else
          {
              //System.out.println("Login Failed");
              usernamePasswordMessageLabel1.setVisible(true);
          }
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void submitButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButton1MouseEntered
        submitButton1.setBackground(Color.YELLOW);
    }//GEN-LAST:event_submitButton1MouseEntered

    private void submitButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButton1MouseExited
        submitButton1.setBackground(Color.BLUE);
    }//GEN-LAST:event_submitButton1MouseExited

    private void exitButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseEntered
        exitButton1.setBackground(Color.RED);
    }//GEN-LAST:event_exitButton1MouseEntered

    private void exitButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseExited
        exitButton1.setBackground(Color.PINK);
    }//GEN-LAST:event_exitButton1MouseExited

    private void resetButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButton1MouseEntered
        resetButton1.setBackground(Color.YELLOW);
    }//GEN-LAST:event_resetButton1MouseEntered

    private void resetButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButton1MouseExited
        resetButton1.setBackground(Color.BLUE);
    }//GEN-LAST:event_resetButton1MouseExited

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
          try {
              con.close();
          } 
          catch (SQLException ex) {
              Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void resetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButton1ActionPerformed
       UsernameTextField1.setText("");
       jPasswordField1.setText("");
    }//GEN-LAST:event_resetButton1ActionPerformed

    private void usernameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField2ActionPerformed
        String username1 = usernameTextField2.getText();
        System.out.println("Username= "+username1);
    }//GEN-LAST:event_usernameTextField2ActionPerformed

    private void mailidTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailidTextField1ActionPerformed
        String mailid1 = mailidTextField1.getText();
        System.out.println("mailid= "+mailid1);
    }//GEN-LAST:event_mailidTextField1ActionPerformed

    private void CityBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityBox1ActionPerformed
       
    }//GEN-LAST:event_CityBox1ActionPerformed

    private void UsernameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CityBox1;
    private javax.swing.JTextField UsernameTextField1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel logiinPanel1;
    private javax.swing.JLabel mailidLabel3;
    private javax.swing.JTextField mailidTextField1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JPanel registrationPanel2;
    private javax.swing.JButton resetButton1;
    private javax.swing.JButton submitButton1;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JLabel usernameLabel3;
    private javax.swing.JLabel usernameLabel4;
    private javax.swing.JLabel usernamePasswordMessageLabel1;
    private javax.swing.JTextField usernameTextField2;
    // End of variables declaration//GEN-END:variables
}

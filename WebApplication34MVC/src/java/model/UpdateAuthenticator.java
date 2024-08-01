/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dtb.userUTP;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class UpdateAuthenticator {
    public boolean isUpdate(userUTP user1){
           String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid = user1.getMailid();
        String address= user1.getAddress();
        String address2 = user1.getAddress2();
        String city = user1.getCity();
        String state = user1.getState();
        String dob = user1.getDob();
        String zipcode = user1.getZipcode();
        String phoneNo=user1.getPhoneNo();
        int i=0;
         try
          {
              Statement st = DBConnector.getStatement();
            
            String query = "UPDATE emp SET empname='"+firstname+"' or emplastname='"+lastname+"' or empaddress='"+address+"' or empaddress2='"+address2+"' or empcity='"+city+"' or empstate='"+state+"' or empdob='"+dob+"' or empzipcode='"+zipcode+"' or empphoneNo='"+phoneNo+"' WHERE empmailid='"+mailid+"'"; 
            
            i=st.executeUpdate(query);
              System.out.println(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(i>0)
            {
                System.out.println("data updated");
                return true;
            }
        System.out.println("not updated");  
        return false;
        
    }
}

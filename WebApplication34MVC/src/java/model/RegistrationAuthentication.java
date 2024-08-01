/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import db.DBConnector;
import dtb.userDTP;
import java.sql.SQLException;
import java.sql.Statement;



public class RegistrationAuthentication {
    public boolean isRegistration(userDTP user1){
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
        
         try
          {
              Statement st = DBConnector.getStatement();
               String query = "INSERT INTO emp(`empname`,`emplastname`,`empmailid`,`empaddress`,`empaddress2`,`empcity`,`empstate`,`empdob`,`empzipcode`,`empphoneNo`) VALUES ('"+firstname+"','"+lastname+"','"+mailid+"','"+address+"','"+address2+"','"+city+"','"+state+"','"+dob+"','"+zipcode+"','"+phoneNo+"')";
              System.out.println("Query="+query);
              st.executeUpdate(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(firstname!=null && lastname!=null && mailid!=null && address!=null && address2!=null && city!=null && state!=null && dob!=null && zipcode!=null && phoneNo!=null && mailid.endsWith("@gmail.com"))
            {
                return true;
            }
            
        return false;
        
    }
}

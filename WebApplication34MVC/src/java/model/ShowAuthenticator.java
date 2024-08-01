/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dtb.userSTP;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class ShowAuthenticator {
    public void isShow(userSTP user1){
        String id = user1.getId();
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
        String salary = user1.getSalary();
        
         try
          {
              Statement st = DBConnector.getStatement();          
              String query = "SELECT * FROM emp WHERE empmailid='"+mailid+"'";
              System.out.println("Query ="+query);
              
              ResultSet rs =st.executeQuery(query);
              if(rs.next())
                      {
                  user1.setId(id);
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setCity(city);
         user1.setState(state);
         user1.setDob(dob);
         user1.setZipcode(zipcode);
         user1.setPhoneNo(phoneNo);
         user1.setSalary(salary);
          }
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authenticator;

import DTO.userRegistration;
import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class registrationAuthentictor extends HttpServlet {
public boolean isRegistration(userRegistration user2){
        String mailid = user2.getMailid();
        String phoneNo=user2.getPhoneNo();
        String password =  user2.getPassword();
        
         try
          {
              Connection con = DBConnector.getConnection();
              PreparedStatement stmt;
              String query = "INSERT INTO user(`email_id`,`password`,`phoneno`) VALUES ('"+mailid+"','"+password+"','"+phoneNo+"')";
              stmt = con.prepareStatement(query);
              System.out.println("Query="+query);
              int rs = stmt.executeUpdate();
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if( mailid!=null && phoneNo!=null && password!=null && mailid.endsWith("@gmail.com"))
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;
        
    }

   
}

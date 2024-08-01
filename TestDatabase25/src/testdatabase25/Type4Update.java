/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabase25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author INDIA
 */
public class Type4Update {
    public static void main(String[] args) {
        Connection con = null;//It maintain connectivity
        Statement st=null;//it use to start working a queries
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//if any problem found then jrh will treate those error
//Driver is a class which is under jdbc package and the campany name in last 
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root");//This is the connectivity url
            System.out.println("Connected");
            
            st = con.createStatement();
            
            String query = "UPDATE emp SET empsalary=18000 WHERE empid>=104"; 
            
            int i =st.executeUpdate(query);
            
            if(i>0)
            {
                System.out.println(i+"Record updated");
            }
            else
            {
                System.out.println("Record updation failed");
            }
            con.close();
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
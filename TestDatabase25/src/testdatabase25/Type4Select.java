/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabase25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author INDIA
 */
public class Type4Select {
    public static void main(String[] args) {
        Connection con = null;//It maintain connectivity
        Statement st=null;//it use to start working a queries
        ResultSet rs = null;//it show/learn the output
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//if any problem found then jrh will treate those error
//Driver is a class which is under jdbc package and the campany name in last 
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root");//This is the connectivity url
            System.out.println("Connected");
            
            st = con.createStatement();
            String query = "SELECT * FROM emp"; 
            
            rs =st.executeQuery(query);
            
            while(rs.next())
            {
                System.out.print(rs.getString(1) + "\t");
                 System.out.print(rs.getString(2) + "\t");
                  System.out.print(rs.getString(3) + "\t");
                   System.out.print(rs.getString(4) + "\n");
                   System.out.print(rs.getString(5) + "\n");
                   System.out.print(rs.getString(6) + "\n");
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

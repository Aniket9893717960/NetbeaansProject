/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabase25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author INDIA
 */
public class Type4PreparedStatement {
    public static void main(String[] args) {
        Connection con = null;//It maintain connectivity
        PreparedStatement pst=null;//it use to start working a queries
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Emp ID: ");
        int id = sc.nextInt();
        
        System.out.println("Enter emp Name: ");
        String name = sc.next();
        
        System.out.println("Enter emp salary: ");
        int salary = sc.nextInt();
        
        System.out.println("Enter emp City: ");
        String city = sc.next();
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//if any problem found then jrh will treate those error
//Driver is a class which is under jdbc package and the campany name in last 
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root");//This is the connectivity url
            System.out.println("Connected");
            
            pst = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
            
            
            //String query = "INSERT INTO EMP VALUES(NULL,'105','Ashu',NULL,'12345','Indore')"; 
            //String query = "INSERT INTO emp VALUES('"+id+"','"+name+"','"+salary+'","'+city"')";
              pst.setInt(1, id);
              pst.setString(2, name);
              pst.setInt(3, salary);
              pst.setString(4, city);
              
              int i =pst.executeUpdate();
            
            if(i>0)
            {
                System.out.println(i+"Record inserted");
            }
            else
            {
                System.out.println("Record insreted failed");
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
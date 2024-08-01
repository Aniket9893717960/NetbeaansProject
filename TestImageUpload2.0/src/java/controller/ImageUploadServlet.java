/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author panka
 */
@WebServlet(name = "ImageUploadServlet", urlPatterns = {"/ImageUploadServlet"})
public class ImageUploadServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
    {
        InputStream inputStream = null;

        String empid = request.getParameter("empid");
        Part filePart = request.getPart("empimage");
        System.out.println(filePart);
        if (filePart != null) 
        {
            System.out.println("File Part");
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());


            inputStream = filePart.getInputStream();
        }

        Connection con = null;
        //PreparedStatement pst = null; 
        Statement st=null;
        String message = null; 
        
        try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded");
                System.out.println(inputStream);
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
                System.out.println("Connected");
                
                /*pst = con.prepareStatement("INSERT INTO testimage(`empid`,`empimage`) VALUES(?,?)");
                
                pst.setString(1, empid);
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                pst.setBlob(2, inputStream);
            }
            int i = pst.executeUpdate();*/
                
                st = con.createStatement();
                String query = "INSERT INTO testimage(`empid`,`empimage`) VALUES('"+empid+"','"+inputStream+"');";
                System.out.println("Query="+query);
                int i =st.executeUpdate(query);
            if (i > 0) 
            {
                message = "File uploaded and saved into database";
            }
        } catch (SQLException e) 
        {
            System.out.println(e);
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        } 
        finally 
        {
            if (con != null) 
            {
                // closes the database connection
                try 
                {
                    con.close();
                } 
                catch (SQLException e) 
                {
                    System.out.println(e);
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);

            // forwards to the message page
            getServletContext().getRequestDispatcher("/imagejsp.jsp").forward(request, response);
        }
    }
}

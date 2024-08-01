<%-- 
    Document   : showimage
    Created on : 16 Jul, 2024, 3:41:49 PM
    Author     : panka
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Blob"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            Blob image = null;
            byte[] imgData = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded");
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
                System.out.println("Connected");
                
                st=con.createStatement();
                
                rs = st.executeQuery("select empimage from testimage");
                while (rs.next()) 
                {
                    image = rs.getBlob(1);
                    imgData = image.getBytes(1, (int) image.length());
                }
                // display the image
                response.setContentType("image/jpg");
                OutputStream o = response.getOutputStream();
                o.write(imgData);
                o.flush();
                o.close();
            } 
            catch (Exception e) 
            {
                out.println("Unable To Display image");
                out.println("Image Display Error=" + e.getMessage());
                System.out.println(e);
                return;
            } 
            finally 
            {
                try 
                {
                    con.close();
                } 
                catch (SQLException e) 
                {
                    System.out.println(e);
                }
            }
        %>        
    </body>
</html>

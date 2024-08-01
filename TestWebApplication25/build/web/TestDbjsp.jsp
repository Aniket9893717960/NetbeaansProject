<%-- 
    Document   : TestDbjsp
    Created on : 12 May, 2023, 7:49:38 AM
    Author     : INDIA
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
            ResultSet rs= null;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded");
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","root");
                System.out.println("Connectd");
                
                st =con.createStatement();
                
                String query = "SELECT * from emp";
                rs = st.executeQuery(query);
        %>
        <table>
            <tr>
                <td><b>Emp ID:</b></td>
                <td><b>Emp Name:</b></td>
                <td><b>Emp Password:</b></td>
                <td><b>Emp Salary:</b></td>
                <td><b>Emp City:</b></td>
            </tr>
        
                
                
                
                <%
                while(rs.next()){
                    %>
                    <tr>
                <td><b><%=rs.getString(1)%></b></td>
                <td><b><%=rs.getString(2)%></b></td>
                <td><b><%=rs.getString(3)%></b></td>
                <td><b><%=rs.getString(4)%></b></td>
                <td><b><%=rs.getString(5)%></b></td>
                    </td>
                    <%
                }
                con.close(); 
            }
            catch (ClassNotFoundException e){
                System.out.println(e);
            }
            catch(SQLException e){
                System.out.println(e);
            }
            %>
            </table>
    </body>
</html>

<%-- 
    Document   : deletejsp
    Created on : 4 Jul, 2023, 8:28:41 AM
    Author     : INDIA
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.Statement"%>

<%@page import="controller.DeleteChecker" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String delete = (String) session.getAttribute("mailid");
            if(delete ==null || delete.trim().equals(""))
{
    response.sendRedirect("login.html");
}
            Statement st = null;
        %>
        <table>
            
            <td>
                <%
                if(delete!=null)
                {
                try {
             st = DBConnector.getStatement();
            String query="DELETE FROM emp where empmailid='"+delete+"'";
            System.out.println("Query=" +query);
            
             int i =st.executeUpdate(query);
            
            if(i!=0){
                %>
             <tr>
                    <td>User Mailid ID:</td>
                    <td><h1><%=delete%></h1></td>
             </tr>
             <tr><td><h2> Is Deleted</h2></td></tr>
                <%
            }
        }
      
        catch(SQLException e){
            System.out.println(e);
        }
} %>
            </td>
                    
                
                </tr>
        </table>
    </body>
</html>

<%-- 
    Document   : showjsp2
    Created on : 1 Jul, 2023, 9:01:46 AM
    Author     : INDIA
--%>

<%@page import="db.DBConnector"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String mailid = (String) session.getAttribute("mailid");
            if(mailid ==null || mailid.trim().equals(""))
{
    response.sendRedirect("login.html");
}
            Statement st = null;
            ResultSet rs = null;
        %>
        <h1><strong><center> successfully Registration</center></strong></h1>
        <a href="login.jsp">Sign In</a>
        <form action="showChecker"  method="post">
            <%
                try {
                    st = DBConnector.getStatement();
                    String query = "SELECT * FROM emp WHERE empmailid='" + mailid + "'";
                    System.out.println("Query =" + query);

                    rs = st.executeQuery(query);
            if (rs.next()) 
            {
            %>
            <table>     
                <tr>
                    <td>Employee ID:</td>
                    <td><h3><%=rs.getString("empid")%></h3></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><h3><%=rs.getString("empname")%></h3></td>
                </tr>

                <tr>
                    <td>Last Name:</td>
                    <td><h3><%=rs.getString("emplastname")%></h3></td>
                </tr>                         
                <tr>
                    <td>Address:</td>
                    <td><h3><%=rs.getString("empaddress")%></h3></td>
                </tr>
                <tr>
                    <td>Additional Address:</td>
                    <td><h3><%=rs.getString("empaddress2")%></h3></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><h3><%=rs.getString("empcity")%></h3></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td><h3><%=rs.getString("empstate")%></h3></td>
                </tr>
                <tr>
                    <td>Date Of Birth:</td>
                    <td><h3><%=rs.getString("empdob")%></h3></td>
                </tr>
                <tr>
                    <td>ZIP CODE:</td>
                    <td><h3><%=rs.getString("empzipcode")%></h3></td>
                </tr>
                <tr>
                    <td>Phone No:</td>
                    <td><h3><%=rs.getString("empphoneNo")%></h3></td>
                </tr>
                <tr>
                    <td>salary:</td>
                    <td><h3><%=rs.getString("empsalary")%></h3></td>
                </tr>
                <%
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }%>

                <tr>
                    <td><a href="logout.jsp">Sign Out</a></td>
                    <td><a href="deletejsp.jsp">Delete Account</a></td>
                </tr>
                <tr>
                    <td><a href="update.jsp">update</a></td>
                </tr>
            </table>
        </form>

    </body>
</html>

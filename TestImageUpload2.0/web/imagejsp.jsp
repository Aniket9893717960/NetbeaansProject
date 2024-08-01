<%-- 
    Document   : index
    Created on : 16 Jul, 2024, 2:16:03 PM
    Author     : pankaj
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Message</title>
    </head>
    <body>
    <center>
        <h3><%=request.getAttribute("Message")%></h3>
    </center>
</body>
</html>
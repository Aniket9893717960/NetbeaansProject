<%-- 
    Document   : logout
    Created on : 13 May, 2023, 9:04:15 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
         response.sendRedirect("login.html");
        %>
    </body>
</html>

<%-- 
    Document   : Testjsp
    Created on : 12 May, 2023, 5:19:02 AM
    Author     : INDIA
--%>

<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor ="cyan">
        <%! static int x;
            int add(int a,int b)
        {
            int c;
            c=a+b;
            return c;
        }
        %>
        <%
            for(int i=0;i<=10;i++){ 
        %>
                <h1>Hello World <%=add(10,i)%>...!</h1>
          <%  }
        %>
    </body>
</html>

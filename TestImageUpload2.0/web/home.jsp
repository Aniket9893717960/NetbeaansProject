<%-- 
    Document   : home
    Created on : 16 Jul, 2024, 2:40:10 PM
    Author     : panka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload to Database Demo</title>
</head>
<body>
    <center>
        <h1>File Upload to Database Demo</h1>
        <form method="post" action="ImageUploadServlet" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Enter ID: </td>
                    <td><input type="text" name="empid" size="20"/></td>
                </tr>
                <tr>
                    <td>Choose Image: </td>
                    <td><input type="file" name="empimage" size="20"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
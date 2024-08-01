<%-- 
    Document   : update
    Created on : 1 Jul, 2023, 7:38:55 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div>UPDATE DETAIL PAGE</div>
         <form action="UpdateChecker"  method="post">
        <table border="0">
             <tr>
                    <td>First Name:</td>
                    <td><input type ="text" name="firstname" placeholder="Enter firstname Here" /></td>
                </tr>
                
                <tr>
                    <td>Last Name:</td>
                    <td><input type ="text" name="lastname" placeholder="Enter Lastname Here" /></td>
                </tr>
                <tr>
                    <td>Email ID:</td>
                    <td><input type ="email" name="email" placeholder="Enter Email ID" /></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type ="text" name="address" placeholder="Enter Address" /></td>
                </tr>
                <tr>
                    <td>Additional Address:</td>
                    <td><input type ="text" name="address1" placeholder="Enter Additional Address" /></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type ="text" name="city" placeholder="Enter City" /></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td><input type ="text" name="state" placeholder="Enter State" /></td>
                </tr>
                <tr>
                    <td>Date Of Birth:</td>
                    <td><input type ="date" name="dob" placeholder="Enter Date Of Birth" /></td>
                </tr>
                <tr>
                    <td>ZIP CODE:</td>
                    <td><input type ="number" name="zipcode" placeholder="Enter zipcode" /></td>
                </tr>
                <tr>
                    <td>Phone No:</td>
                    <td><input type ="number" name="phoneno" placeholder="Enter Phone Number" /></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Reset" /></td>
                    <td><input type="submit" value="update" /></td>
                </tr>
        </table>
        </form>
    </body>
</html>

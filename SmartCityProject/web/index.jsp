<%-- 
    Document   : index
    Created on : 15 Jan, 2024, 10:11:35 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dependent Dropdown List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="style.css">
    </head>
    <body>
         <div class="container">

        <h3>Select Country State and City</h3>

        <div class="select_option">
            <select class="form-select country" aria-label="Default select example" onchange="loadStates()">
                <option selected>Select Country</option>
            </select>
            <select class="form-select state" aria-label="Default select example" onchange="loadCities()">
                <option selected>Select State</option>
            </select>
            <select class="form-select city" aria-label="Default select example">
                <option selected>Select City</option>
            </select>
        </div>

    </div>

    <script src="app.js"></script>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" ></script>
    </body>
</html>

<%-- 
    Document   : registration
    Created on : 20 Mar, 2024, 5:04:11 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registration Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
body{
background-image: linear-gradient(rgba(0, 0, 0, 0.491), rgba(0, 0, 0, 0.416)), url(login-bg.jpg);
height: 100vh; }
.login-top{
width: 100vw;
height: 70px;
background-color: rgba(0, 0, 0, 0);
padding: 0px 20px;
display: flex;
align-items: center;
}
login-top img{
width: 150px; 
}
.login-box{
width: 430px;
height: 670px;
background-color: rgba(0, 0, 0, 0.899);
border-radius: 5px;
padding: 50px;
}
.small-text{
font-size: 13px;
}
.form-control{
box-shadow: none !important;
</style>
</head>
<body>
<div class="login-top">
<img src="logo.svg" alt="">
</div>
<div class="d-flex justify-content-center align-items-center" style="width: 100vw;">

<section class="login-box">

<h2 class="text-white">Sign In</h2>

<form class="mt-4" action="registrationChecker" methord="post">

<div class="mb-3 bg-white rounded px-2" >

<label for="exampleInputEmaill" class="form-label small-text">Email</label>

<input type="email" name="email_id" class="form-control border-e p-e" id="exampleInputEmaill" aria-describedby="emailHelp">

</div>

<div class="mb-3 bg-white rounded px-2" >

<label for="exampleInputEmaill" class="form-label small-text">Mobile Number</label>

<input type="number" name="phoneno" class="form-control border-0 p-8" id="exampleInputEmaill" aria-describedby="emailHelp">

</div>

<div class="mb-3 bg-white rounded px-2">

<label for="exampleInputPassword1" class="form-label small-text">Password</label>

<input type="password" name="password" class="form-control border-0 p-0" id="exampleInputPassword1">

</div>

<div class="mb-3 bg-white rounded px-2">

<label for="exampleInputPassword1" class="form-label small-text">Confrom Password</label>

<input type="password" name="cp" class="form-control border-8 p-8" id="exampleInputPassword1">

</div> 
   

<input type="submit" value="submit" class="btn btn-danger mt-3" style="width: 100%;"/>

<div class="mb-3 mt-3 form-check">

<input type="checkbox" class="form-check-input" id="exampleCheck1">
<label class="form-check-label text-white small-text" for="exampleCheck1">Remember Me</label>

</div>

<div class="mt-3 d-flex">

    <img width="20px"  alt=""><i class="bi bi-facebook"></i></img>

<p class="m-0 small-text text-white mx-2">Login with Facebook</p>

</div>

<div class="mt-3">

<p class="m-0 small-text text-white mt-2"> <span style="color: rgba(212, 212, 212, 0.75);">This page is protected by

</div>

</form>

</section>

</div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" ></script>
    </body>
</html>

<%-- 
    Document   : Login Page
    Created on : 20 Mar, 2024, 3:38:41 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Netflix Login Page</title>
        <link rel="stylesheet" href="login.css">
    </head>
    <body>
        <nav>
            <a href="#"><img src="assets/images/logo.svg" alg="logo"></a>
        </nav>
        <div class="form-wrapper">
            <h2>Sign in</h2>
            <form action="loginChecker" method="post">
            <div class="form-control">
            <input type="text" name="email_id" />
            <label>Email or phone number</label>
            </div>
            <div class="form-control">
            <input type="password" class="form-control" name="password" />
            <label>Passoword</label>
            </div>
            <input value="Login" type="submit" class="submit" style="width: 100%;padding: 16px 0;font-size: 1rem;background: #e50914;color: #fff;font-weight: 500;border-radius: 4px;border: none;outline: none;margin: 25px 0 10px;cursor: pointer;transition: 0.1s ease;" />
             </form>   
                <div class="form-help">
                <div class="remember-me">
                    <input type="checkbox" id="remember-me">
                    <label for="">Remember me</label>
                </div>
                <a href="#">Need Help?</a>
            </div>
            <p>New to Netflix? <a href="registration.jsp">sign up Now</a></p>
            <small>This page is protected by reCAPTChA to ensure you're not a bot.
            <a hred='#'>learn more.</a>
            </small>
        </div>
    </body>
</html>

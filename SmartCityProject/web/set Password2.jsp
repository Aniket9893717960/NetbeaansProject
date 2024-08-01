<%-- 
    Document   : set Password2
    Created on : 6 Apr, 2024, 12:31:47 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Set Password</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
  body {
    background-color: #FFFAF0; /* Creamy background color */
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  .container {
    background-color: #FFD700; /* Yellow container background */
    padding: 40px;
    border-radius: 15px;
    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  h2 {
    margin-bottom: 30px;
    color: #FF8C00; /* Darker shade of orange */
    font-size: 32px;
    font-weight: bold;
  }

  input[type="password"] {
    border: 2px solid #FFA500; /* Orange border color */
    border-radius: 25px;
    font-size: 16px;
    padding: 12px 20px;
    transition: border-color 0.3s;
  }

  input[type="password"]:focus {
    border-color: #FF4500; /* Darker shade of orange on focus */
    outline: none;
  }

  button {
    background-color: #FF8C00; /* Orange button color */
    color: #fff; /* White text color */
    border-radius: 25px;
    cursor: pointer;
    font-size: 16px;
    padding: 12px 30px;
    transition: background-color 0.3s;
  }

  button:hover {
    background-color: #FF4500; /* Darker shade of orange on hover */
  }

  .message {
    color: #FF8C00; /* Orange text color */
    margin-top: 20px;
  }

  .message a {
    color: #FF8C00; /* Orange text color */
    text-decoration: none;
    font-weight: bold;
    transition: color 0.3s;
  }

  .message a:hover {
    color: #FF4500; /* Darker shade of orange on hover */
  }
</style>
</head>
<body>
  <div class="container">
    <h2>Set Password</h2>
    <form action="#" method="post">
      <div class="form-group">
        <input type="password" class="form-control" name="password" placeholder="Enter Password" required>
      </div>
      <div class="form-group">
        <input type="password" class="form-control" name="confirm_password" placeholder="Confirm Password" required>
      </div>
      <button type="submit" class="btn btn-primary btn-block">Set Password</button>
    </form>
    <div class="message mt-3">Already have an account? <a href="#" class="font-weight-bold">Login</a></div>
  </div>
</body>
</html>

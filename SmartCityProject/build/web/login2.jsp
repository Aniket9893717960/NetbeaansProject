<%-- 
    Document   : login2
    Created on : 26 Feb, 2024, 6:36:02 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Page</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Font Awesome CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
  <!-- Custom CSS -->
  <style>
    body {
      background: linear-gradient(to right, #283048, #859398);
      color: #fff;
      height: 100vh;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .login-container {
      background: rgba(255, 255, 255, 0.1);
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    .login-container h2 {
      text-align: center;
      margin-bottom: 30px;
    }

    .login-container .form-group {
      position: relative;
      margin-bottom: 20px;
    }

    .login-container .form-group input {
      width: 100%;
      padding: 10px;
      border-radius: 5px;
      border: none;
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
    }

    .login-container .form-group input:focus {
      outline: none;
      background: rgba(255, 255, 255, 0.2);
    }

    .login-container .form-group i {
      position: absolute;
      top: 50%;
      right: 15px;
      transform: translateY(-50%);
    }

    .login-container .form-group .fa-user {
      color: #28a745;
    }

    .login-container .form-group .fa-lock {
      color: #dc3545;
    }

    .login-container button[type="submit"] {
      width: 100%;
      padding: 10px;
      border-radius: 5px;
      border: none;
      background: #007bff;
      color: #fff;
      cursor: pointer;
      transition: background 0.3s ease;
    }

    .login-container button[type="submit"]:hover {
      background: #0056b3;
    }

    .login-container p {
      text-align: center;
      margin-top: 20px;
      font-size: 14px;
    }
  </style>
</head>
<body>
  <div class="login-container">
    <h2>Login</h2>
    <form id="loginForm">
      <div class="form-group">
        <input type="text" id="username" placeholder="Username" required>
        <i class="fas fa-user"></i>
      </div>
      <div class="form-group">
        <input type="password" id="password" placeholder="Password" required>
        <i class="fas fa-lock"></i>
      </div>
      <button type="submit">Login</button>
    </form>
    <p>Don't have an account? <a href="#">Sign up</a></p>
  </div>

  <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>

  <!-- Custom JavaScript -->
  <script>
    document.getElementById('loginForm').addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent the form from submitting

      // Get username and password
      var username = document.getElementById('username').value;
      var password = document.getElementById('password').value;

      // Validate username and password (for demonstration purpose)
      if (username === 'admin' && password === 'password') {
        alert('Login successful!');
        // You can redirect the user to another page here if needed
      } else {
        alert('Invalid username or password!');
      }
    });
  </script>
</body>
</html>


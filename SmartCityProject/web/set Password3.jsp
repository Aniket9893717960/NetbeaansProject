<%-- 
    Document   : set Password3
    Created on : 27 Feb, 2024, 5:26:11 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Password Setup</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Font Awesome CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
  <!-- Custom CSS -->
  <style>
    body {
      background-color: #f4e04d;
      color: #333;
      font-family: Arial, sans-serif;
      height: 100vh;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .password-setup {
      background-color: #fff;
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      padding: 20px;
      width: 300px;
      text-align: center;
    }

    .password-setup h2 {
      margin-bottom: 20px;
    }

    .password-setup input[type="password"] {
      width: calc(100% - 20px);
      padding: 10px;
      border-radius: 5px;
      border: 1px solid #ccc;
      margin-bottom: 10px;
    }

    .password-setup button[type="submit"] {
      width: calc(100% - 20px);
      padding: 10px;
      border-radius: 5px;
      border: none;
      background-color: #f2a154;
      color: #fff;
      cursor: pointer;
      transition: background 0.3s ease;
    }

    .password-setup button[type="submit"]:hover {
      background-color: #f4e04d;
    }
  </style>
</head>
<body>
  <div class="password-setup">
    <h2>Set Password</h2>
    <form id="passwordForm">
      <input type="password" id="password" placeholder="Enter Password" required>
      <input type="password" id="confirmPassword" placeholder="Confirm Password" required>
      <button type="submit">Set Password</button>
    </form>
  </div>

  <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>
</body>
</html>


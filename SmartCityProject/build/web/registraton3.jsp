<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registration Page</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Font Awesome CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
  <!-- Custom CSS -->
  <style>
    body {
      background: linear-gradient(to right, #f4e04d, #f2a154);
      color: #333;
      height: 100vh;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .registration-container {
      background: rgba(255, 255, 255, 0.9);
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      max-width: 700px;
      width: 100%;
    }

    .registration-container h2 {
      text-align: center;
      margin-bottom: 30px;
      color: #f2a154;
    }

    .form-group {
      margin-bottom: 20px;
    }

    input[type="text"],
    input[type="email"],
    input[type="tel"],
    input[type="password"] {
      width: calc(50% - 10px);
      padding: 10px;
      border-radius: 5px;
      border: none;
      background: rgba(255, 255, 255, 0.1);
      color: #333;
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    input[type="tel"]:focus,
    input[type="password"]:focus {
      outline: none;
      background: rgba(255, 255, 255, 0.2);
    }

    button[type="submit"] {
      width: 100%;
      padding: 10px;
      border-radius: 5px;
      border: none;
      background: #f2a154;
      color: #fff;
      cursor: pointer;
      transition: background 0.3s ease;
    }

    button[type="submit"]:hover {
      background: #f4e04d;
    }
  </style>
</head>
<body>
  <div class="registration-container">
    <h2>Registration</h2>
    <form id="registrationForm">
      <div class="form-row">
        <div class="col">
          <input type="text" id="firstName" placeholder="First Name" required>
        </div>
        <div class="col">
          <input type="text" id="lastName" placeholder="Last Name" required>
        </div>
      </div>
      <div class="form-group">
        <input type="text" id="username" placeholder="Username" required>
      </div>
      <div class="form-group">
        <input type="email" id="email" placeholder="Email" required>
      </div>
      <div class="form-group">
        <input type="tel" id="phoneNumber" placeholder="Phone Number" required>
      </div>
      <div class="form-group">
        <input type="text" id="address" placeholder="Address" required>
      </div>
      <div class="form-group">
        <input type="password" id="password" placeholder="Password" required>
      </div>
      <div class="form-group">
        <input type="password" id="confirmPassword" placeholder="Confirm Password" required>
      </div>
      <button type="submit">Register</button>
    </form>
  </div>

  <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>

  <!-- Custom JavaScript -->
  <script>
    document.getElementById('registrationForm').addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent the form from submitting

      // Get form values
      var firstName = document.getElementById('firstName').value;
      var lastName = document.getElementById('lastName').value;
      var username = document.getElementById('username').value;
      var email = document.getElementById('email').value;
      var phoneNumber = document.getElementById('phoneNumber').value;
      var address = document.getElementById('address').value;
      var password = document.getElementById('password').value;
      var confirmPassword = document.getElementById('confirmPassword').value;

      // Perform registration logic here (for demonstration purpose)
      // In a real application, you would send this data to a server
      alert('Registration successful!');
      console.log('First Name: ' + firstName);
      console.log('Last Name: ' + lastName);
      console.log('Username: ' + username);
      console.log('Email: ' + email);
      console.log('Phone Number: ' + phoneNumber);
      console.log('Address: ' + address);
      console.log('Password: ' + password);
      console.log('Confirm Password: ' + confirmPassword);
    });
  </script>
</body>
</html>

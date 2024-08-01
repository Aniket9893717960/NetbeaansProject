<%-- 
    Document   : indexjsp2
    Created on : 29 Feb, 2024, 1:56:36 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Healthcare System</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        /* Custom CSS */
        .jumbotron {
            background-image: linear-gradient(to right bottom, #f8f9fa, #dee2e6), url('https://images.unsplash.com/photo-1594055138554-6e13cd5f9f5b');
            background-size: cover;
            color: #fff;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
            padding: 100px 0;
        }
        .feature-icon {
            font-size: 50px;
            margin-bottom: 20px;
            color: #007bff;
        }
        .feature-box {
            padding: 30px;
            border-radius: 10px;
            transition: transform 0.3s ease-in-out;
            background-color: #fff;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
            height: 100%;
        }
        .feature-box:hover {
            transform: translateY(-5px);
            box-shadow: 0px 0px 40px rgba(0, 0, 0, 0.2);
        }
        .footer {
            background-color: #343a40;
            color: #fff;
            padding: 50px 0;
        }
        .footer a {
            color: #fff;
        }
        .footer a:hover {
            color: #007bff;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Healthcare System</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About Us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Services</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li>
    </ul>
  </div>
</nav>

<div class="jumbotron">
    <div class="container text-center">
        <h1 class="display-3">Welcome to Our Healthcare System</h1>
        <p class="lead">Providing top-notch healthcare services</p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Learn More</a>
    </div>
</div>

<div class="container mt-5">
    <div class="row text-center">
        <div class="col-md-4">
            <div class="feature-box">
                <i class="fas fa-user-md feature-icon"></i>
                <h3>Expert Staff</h3>
                <p>Our team consists of highly qualified medical professionals.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <i class="fas fa-hospital feature-icon"></i>
                <h3>State-of-the-Art Facilities</h3>
                <p>We offer modern facilities equipped with advanced medical technology.</p>
            </div>
        </div>
        <div class="col-md-4">
            <div class="feature-box">
                <i class="fas fa-heartbeat feature-icon"></i>
                <h3>Comprehensive Services</h3>
                <p>From consultations to surgeries, we provide a wide range of healthcare services.</p>
            </div>
        </div>
    </div>
</div>

<footer class="footer text-center">
    <div class="container">
        <p>&copy; 2024 Healthcare System. All rights reserved. Designed by <a href="#" target="_blank">Your Name</a></p>
    </div>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

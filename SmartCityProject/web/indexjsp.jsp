<%-- 
    Document   : indexjsp
    Created on : 29 Feb, 2024, 1:50:44 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Website</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700&display=swap" rel="stylesheet">
    <style>
        /* Custom CSS */
        body {
            font-family: 'Open Sans', sans-serif;
            background-color: #f8f9fa;
            color: #555;
        }
        .navbar {
            background-color: #007bff;
        }
        .navbar-brand {
            color: #fff;
            font-weight: 700;
        }
        .navbar-nav .nav-link {
            color: #fff;
            font-weight: 600;
        }
        .jumbotron {
            background-image: linear-gradient(to right bottom, rgba(0, 123, 255, 0.8), rgba(0, 172, 230, 0.8)), url('https://images.unsplash.com/photo-1521737711867-61faca5cc2a2');
            background-size: cover;
            color: #fff;
            text-align: center;
            padding: 150px 0;
        }
        .jumbotron h1 {
            font-weight: 700;
        }
        .jumbotron p {
            font-size: 20px;
            font-weight: 600;
        }
        .services {
            padding: 80px 0;
            background-color: #fff;
        }
        .service-item {
            text-align: center;
            margin-bottom: 50px;
        }
        .service-icon {
            font-size: 40px;
            color: #007bff;
            margin-bottom: 20px;
        }
        .service-title {
            font-size: 24px;
            font-weight: 700;
            margin-bottom: 15px;
        }
        .service-description {
            font-size: 18px;
            line-height: 1.6;
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

<nav class="navbar navbar-expand-lg navbar-dark">
  <div class="container">
    <a class="navbar-brand" href="#">Hospital Name</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#services">Services</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#contact">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron">
    <div class="container">
        <h1>Welcome to Hospital Name</h1>
        <p>We care for your health</p>
        <a class="btn btn-primary btn-lg" href="#services" role="button">Our Services</a>
    </div>
</div>

<div id="services" class="services">
    <div class="container">
        <h2 class="text-center mb-5">Our Services</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="service-item">
                    <i class="fas fa-user-md service-icon"></i>
                    <h3 class="service-title">Medical Care</h3>
                    <p class="service-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-item">
                    <i class="fas fa-stethoscope service-icon"></i>
                    <h3 class="service-title">Diagnostic Services</h3>
                    <p class="service-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-item">
                    <i class="fas fa-ambulance service-icon"></i>
                    <h3 class="service-title">Emergency Care</h3>
                    <p class="service-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fermentum velit nec libero mollis, nec commodo mi fermentum.</p>
                </div>
            </div>
        </div>
    </div>
</div>

<footer class="footer text-center">
    <div class="container">
        <p>&copy; 2024 Hospital Name. All rights reserved. Designed by <a href="#" target="_blank">Your Name</a></p>
    </div>
</footer>

<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

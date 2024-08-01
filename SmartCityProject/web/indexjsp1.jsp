<%-- 
    Document   : indexjsp1
    Created on : 29 Feb, 2024, 1:54:45 AM
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
            background-image: url('https://images.unsplash.com/photo-1594055138554-6e13cd5f9f5b');
            background-size: cover;
            color: #fff;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
        }
        .feature-icon {
            font-size: 50px;
            margin-bottom: 20px;
        }
        .feature-box {
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            transition: transform 0.3s ease-in-out;
        }
        .feature-box:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
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

<div class="container mt-5">
    <div class="jumbotron">
        <div class="text-center">
            <h1>Welcome to Our Healthcare System</h1>
            <p class="lead">Providing top-notch healthcare services</p>
            <a class="btn btn-primary btn-lg" href="#" role="button">Learn More</a>
        </div>
    </div>

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

<footer class="bg-dark text-light text-center py-4">
    <p>&copy; 2024 Healthcare System. All rights reserved.</p>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

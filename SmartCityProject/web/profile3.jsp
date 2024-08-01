<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Profile Page</title>
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

    .profile-card {
      background-color: #fff;
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      padding: 20px;
      width: 300px;
      text-align: center;
    }

    .profile-card img {
      width: 100px;
      height: 100px;
      border-radius: 50%;
      margin-bottom: 20px;
    }

    .profile-card h2 {
      margin-bottom: 10px;
    }

    .profile-card p {
      margin-bottom: 5px;
    }

    .profile-card .detail {
      margin-bottom: 10px;
      display: flex;
      justify-content: space-between;
    }

    .profile-card .detail .label {
      font-weight: bold;
    }

    .place-photo img {
      width: 100%;
      border-radius: 10px;
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <div class="profile-card">
    <img src="person.jpg" alt="Profile Picture">
    <h2>John Doe</h2>
    <div class="detail">
      <span class="label">ID:</span>
      <span>123456</span>
    </div>
    <div class="detail">
      <span class="label">Email:</span>
      <span>johndoe@example.com</span>
    </div>
    <div class="detail">
      <span class="label">Phone:</span>
      <span>(123) 456-7890</span>
    </div>
    <div class="detail">
      <span class="label">Address:</span>
      <span>123 Main St, Cityville</span>
    </div>
    <div class="detail">
      <span class="label">Date of Birth:</span>
      <span>January 1, 1990</span>
    </div>
    <div class="detail">
      <span class="label">Gender:</span>
      <span>Male</span>
    </div>
    <div class="detail">
      <span class="label">Occupation:</span>
      <span>Software Engineer</span>
    </div>
    <div class="detail">
      <span class="label">Blood Group:</span>
      <span>O+</span>
    </div>
    <div class="detail">
      <span class="label">Nationality:</span>
      <span>American</span>
    </div>
    <div class="place-photo">
      <img src="place.jpg" alt="Place Picture">
    </div>
  </div>

  <!-- Bootstrap JS and jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <!-- Font Awesome JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"></script>
</body>
</html>

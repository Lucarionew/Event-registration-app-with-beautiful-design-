<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background: linear-gradient(135deg, #667eea, #764ba2); min-height: 100vh; display: flex; align-items: center; justify-content: center; }
        .card { max-width: 500px; box-shadow: 0 15px 35px rgba(0,0,0,0.3); border: none; }
        h1 { color: white; text-shadow: 2px 2px 10px rgba(0,0,0,0.5); }
    </style>
</head>
<body>
    <div class="text-center">
        <h1 class="mb-5">Tech Events 2025</h1>
        <div class="card p-5">
            <h2 class="mb-4">Welcome!</h2>
            <p class="lead mb-4">Register for our exciting events</p>
            <a href="register.jsp" class="btn btn-primary btn-lg me-3">Register Now</a>
            <a href="EventServlet" class="btn btn-outline-primary btn-lg">View Registrations</a>
        </div>
    </div>
    </body>
</html>
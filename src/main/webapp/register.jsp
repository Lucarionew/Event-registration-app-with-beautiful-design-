<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background: linear-gradient(135deg, #f093fb, #f5576c); min-height: 100vh; display: flex; align-items: center; }
        .card { max-width: 600px; margin: auto; box-shadow: 0 15px 35px rgba(0,0,0,0.3); }
    </style>
</head>
<body>
    <div class="container">
        <div class="card p-5">
            <h2 class="text-center mb-4">Event Registration Form</h2>
            <% if (request.getParameter("success") != null) { %>
                <div class="alert alert-success">Registration Successful! 🎉</div>
            <% } %>
            <form action="RegisterServlet" method="post">
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" name="name" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" name="email" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Phone</label>
                    <input type="text" name="phone" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Event</label>
                    <select name="event" class="form-select" required>
                        <option value="Webinar">Tech Webinar</option>
                        <option value="Conference">Annual Conference</option>
                        <option value="Workshop">Java Workshop</option>
                    </select>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-success btn-lg">Submit Registration</button>
                    <a href="index.jsp" class="btn btn-secondary btn-lg ms-3">Back</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
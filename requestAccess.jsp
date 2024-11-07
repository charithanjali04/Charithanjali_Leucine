<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Request Access</title>
</head>
<body>
    <h2>Request Access to Software</h2>
    <form action="requestAccess" method="post">
        <label>Software Name: 
            <select name="softwareId">
                <!-- Populate options dynamically with JSP/Servlet -->
            </select>
        </label><br>
        <label>Access Type: 
            <select name="accessType">
                <option value="Read">Read</option>
                <option value="Write">Write</option>
                <option value="Admin">Admin</option>
            </select>
        </label><br>
        <label>Reason for Request: <textarea name="reason" required></textarea></label><br>
        <input type="submit" value="Request Access">
    </form>
</body>
</html>

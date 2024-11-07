<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Software</title>
</head>
<body>
    <h2>Create New Software</h2>
    <form action="createSoftware" method="post">
        <label>Software Name: <input type="text" name="name" required></label><br>
        <label>Description: <textarea name="description" required></textarea></label><br>
        <label>Access Levels: 
            <input type="checkbox" name="accessLevels" value="Read"> Read
            <input type="checkbox" name="accessLevels" value="Write"> Write
            <input type="checkbox" name="accessLevels" value="Admin"> Admin
        </label><br>
        <input type="submit" value="Create">
    </form>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pending Requests</title>
</head>
<body>
    <h2>Pending Access Requests</h2>
    <table border="1">
        <tr>
            <th>Employee Name</th>
            <th>Software Name</th>
            <th>Access Type</th>
            <th>Reason</th>
            <th>Action</th>
        </tr>
        <!-- Example row; populate dynamically using JSP/Servlet -->
        <tr>
            <td>John Doe</td>
            <td>Software ABC</td>
            <td>Read</td>
            <td>Required for Project XYZ</td>
            <td>
                <form action="approveRequest" method="post">
                    <input type="hidden" name="requestId" value="1">
                    <button type="submit" name="action" value="Approve">Approve</button>
                    <button type="submit" name="action" value="Reject">Reject</button>
                </form>
            </td>
        </tr>
    </table>
</body>
</html>

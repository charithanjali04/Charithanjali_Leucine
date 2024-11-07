package com.example.servlets;

import com.example.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/approveRequest")
public class ApprovalServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int requestId = Integer.parseInt(request.getParameter("requestId"));
        String action = request.getParameter("action"); // Expected to be either "Approve" or "Reject"

        String newStatus = "Rejected";
        if ("Approve".equalsIgnoreCase(action)) {
            newStatus = "Approved";
        }

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "UPDATE requests SET status = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newStatus);
            statement.setInt(2, requestId);
            statement.executeUpdate();

            // Redirect to pending requests page or confirmation page
            response.sendRedirect("pendingRequests.jsp?success=Request%20" + newStatus);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("pendingRequests.jsp?error=Failed%20to%20update%20request%20status");
        }
    }
}

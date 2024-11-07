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

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data from signup.jsp
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Establish a database connection and save the new user
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, 'Employee')";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.executeUpdate();

            // Redirect to login page on successful registration
            response.sendRedirect("login.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            // Redirect to signup page with error message if registration fails
            response.sendRedirect("signup.jsp?error=User%20already%20exists");
        }
    }
}

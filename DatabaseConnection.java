package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Update these constants with your PostgreSQL details
    private static final String URL = "jdbc:postgresql://localhost:5432/your_database_name";
    private static final String USER = "Charithanjali";
    private static final String PASSWORD = "teju";

    // Method to establish a connection to the PostgreSQL database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

package com.corejavaproject.jdbcwithoracle;

import java.sql.*;

public class EmpDAO {

    public String saveEmployee(Employee employee) throws SQLException {
        String response = "Failed to insert employee.";

        // 1. Queries
        String getMaxIdSql = "SELECT NVL(MAX(EMP_ID), 100) + 1 FROM employee";
        String insertSql = "INSERT INTO employee (EMP_ID, EMP_NAME, EMP_EMAIL, EMP_SALARY) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {

            // 2. Step 1: Calculate next unique ID
            int nextId = 101;
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(getMaxIdSql)) {
                if (rs.next()) {
                    nextId = rs.getInt(1);
                }
            }

            // 3. Step 2: Insert using the calculated ID
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setInt(1, nextId);
                insertStmt.setString(2, employee.getName());
                insertStmt.setString(3, employee.getEmail());
                insertStmt.setDouble(4, employee.getSalary());

                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    employee.setId(nextId); // Store generated ID back into object
                    response = "A new user was inserted successfully with ID: " + nextId;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return response;
    }

    public String updateEmployee(Employee employee) throws SQLException {
        String response = "Failed to update employee.";
        String sql = "UPDATE employee SET EMP_NAME = ?, EMP_EMAIL = ?, EMP_SALARY = ? WHERE EMP_ID = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, employee.getName());
            statement.setString(2, employee.getEmail());
            statement.setDouble(3, employee.getSalary());
            statement.setInt(4, employee.getId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                response = "Employee updated successfully!";
            } else {
                response = "No employee found with ID: " + employee.getId();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return response;
    }
}
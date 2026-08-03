package com.corejavaproject.jdbcwithoracle;

import java.sql.*;

public class EmpDAO {
    public String saveEmployee(Employee employee) throws SQLException {
        String response = null;

        String sql = "INSERT INTO employee (EMP_ID, EMP_NAME, EMP_EMAIL, EMP_SALARY) "
                + "VALUES ((SELECT NVL(MAX(EMP_ID), 100) + 1 FROM employee), ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, employee.getName());   // 1st ?
            statement.setString(2, employee.getEmail());  // 2nd ?
            statement.setDouble(3, employee.getSalary()); // 3rd ?

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was inserted successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
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
            statement.setInt(4, employee.getId()); // Assuming Employee class has getId()

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                response = "Employee updated successfully!";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return response;
    }
}
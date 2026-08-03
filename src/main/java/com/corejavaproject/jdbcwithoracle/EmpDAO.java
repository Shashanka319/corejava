package com.corejavaproject.jdbcwithoracle;

import java.sql.*;

public class EmpDAO {
    public String saveEmployee(Employee employee) throws SQLException {
        String response = null;

        // Subquery gets current MAX ID (103) and adds 1 -> 104
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
}
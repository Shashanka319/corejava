package com.corejavaproject.jdbcwithoracle;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class Main {
    public static void main(String[] args) {

        try (Connection db = DBConnection.getConnection()) {
            log.info("Database Connection Established: {}", db);

            EmpDAO empDAO = new EmpDAO();

            // 1. Prepare Employee object (ID is auto-calculated in DAO)
            Employee emp = new Employee();
            emp.setName("Kumar");
            emp.setEmail("kumar@gmail.com");
            emp.setSalary(3999.9);

            // 2. Save Employee
            String saveResponse = empDAO.saveEmployee(emp);
            log.info("Save Response: {}", saveResponse);

            // 3. Update the employee using the generated ID (emp.getId())
            emp.setName("Kumar Sanu");
            emp.setEmail("kumar.sanu@gmail.com");
            emp.setSalary(4500.0);

            log.info("Updating employee with ID: {}...", emp.getId());
            String updateResponse = empDAO.updateEmployee(emp);
            log.info("Update Response: {}", updateResponse);

        } catch (Exception e) {
            log.error("An error occurred during DB operation: ", e);
        }
    }
}
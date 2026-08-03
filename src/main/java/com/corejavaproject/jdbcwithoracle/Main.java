package com.corejavaproject.jdbcwithoracle;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class Main {
    public static void main(String[] args) {

        try (Connection db = DBConnection.getConnection()) {
            log.info("Database Connection Established: {}", db);

            EmpDAO empDAO = new EmpDAO();

            // SAVE EMPLOYEE
            Employee emp = new Employee();
            emp.setName("Kumar");
            emp.setEmail("kumar@gmail.com");
            emp.setSalary(3999.9);

            Employee emp1 = new Employee();
            emp1.setName("Sharath Kumar");
            emp1.setEmail("sharathkumar@gmail.com");
            emp1.setSalary(7699.9);

            Employee emp2 = new Employee();
            emp2.setName("Sharath ");
            emp2.setEmail("sharath@gmail.com");
            emp2.setSalary(5649.9);

            String saveResponse = empDAO.saveEmployee(emp2);
            log.info("Save Response: {}", saveResponse);

            String save= empDAO.saveEmployee(emp2);
            log.info("Save Response: {}", save);

            String save2 = empDAO.saveEmployee(emp1);
            log.info("Save Response: {}", save2);

            // SELECT BY ID
            log.info("Fetching employee with ID: {}...", emp2.getId());
            Employee fetchedEmp = empDAO.getEmployeeById(emp2.getId());
            if (fetchedEmp != null) {
                log.info("Fetched Employee: ID={}, Name={}, Email={}, Salary={}",
                        fetchedEmp.getId(), fetchedEmp.getName(), fetchedEmp.getEmail(), fetchedEmp.getSalary());
            }

            //  UPDATE EMPLOYEE
            emp2.setName("Kumar Sanu");
            emp2.setEmail("kumar.sanu@gmail.com");
            emp2.setSalary(4500.0);

            log.info("Updating employee with ID: {}...", emp2.getId());
            String updateResponse = empDAO.updateEmployee(emp2);
            log.info("Update Response: {}", updateResponse);


            //  DELETE EMPLOYEE
            log.info("Deleting employee with ID: {}...", emp2.getId());
            String deleteResponse = empDAO.deleteEmployee(emp2.getId());
            log.info("Delete Response: {}", deleteResponse);

        } catch (Exception e) {
            log.error("An error occurred during DB operation: ", e);
        }
    }
}
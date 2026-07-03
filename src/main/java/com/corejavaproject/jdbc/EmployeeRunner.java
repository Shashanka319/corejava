package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
@Log4j2

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Sharath","Kumbar","sharathshashank1986@gmail.com", LocalDate.of(2026, 9, 27));
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        int result =employeeDAO.saveEmployee(employee);
        log.info("Result of employee saving:{}", result);
        log.info("Result of current Employee Detailes:{}", employeeDAO.getAllEmployees());

    }
}

package com.corejavaproject.jdbc;

import java.util.List;

public interface EmployeeDAO {
    int saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}

package com.corejavaproject.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public int saveEmployee(Employee employee) {
        int response=0;
        String sql ="insert into employees(first_name,last_name,email,hire_date) values(?,?,?,?)";
        try(Connection con = .getEmployeeConnection();

        return 0;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}


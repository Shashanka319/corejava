package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
@Log4j2

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public int saveEmployee(Employee employee) {
        int response=0;
        String sql = "insert into employees(first_name, last_name, email, hire_date) values (?, ?, ?, ?)";
        try(Connection con=DBConnection.getEmployeeConnection();
            PreparedStatement statement=con.prepareStatement(sql)){
                statement.setString(1,employee.firstName());
                statement.setString(2,employee.lastName());
                statement.setString(3,employee.email());
                statement.setObject(4,employee.hireDate());
                response= statement.executeUpdate();
        }catch(Exception e){
            log.error(e);
        }

        log.info("Inserted the user details, no of rows inserted:{}", response);
        return response;
    }


    @Override
    public List<Employee> getAllEmployees() {

        return List.of();
    }
}


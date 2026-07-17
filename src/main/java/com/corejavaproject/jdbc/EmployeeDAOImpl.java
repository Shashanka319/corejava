package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Log4j2

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public int saveEmployee(Employee employee) {
        int response=0;
       String sql ="insert into employees(first_name,last_name,email,hire_date) values(?,?,?,?)";
       try(Connection connection= DBConnections.getConnection();
           PreparedStatement statement=connection.prepareStatement(sql)
       ){
           statement.setString(1,employee.firstName());
           statement.setString(2,employee.lastName());
           statement.setString(3,employee.email());
           statement.setObject(4,employee.hireDate());

           response=statement.executeUpdate();
       }catch (Exception exp){
           log.error("Exception While Executing User Detailes");
       }
       log.info("Inserted the employee detailes,index values:{}",response);
       return response;

    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employee=new ArrayList<>();
        String sql="select first_name,last_name,email,hire_date from employees";
        try(Connection connection= DBConnections.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery()
        ){
            while(resultSet.next()) {
                String firstName=resultSet.getString("first_name");
                String lastName=resultSet.getString("last_name");
                String email=resultSet.getString("email");
                LocalDate hireDate = resultSet.getObject("hire_date",LocalDate.class);
                Employee employees= new Employee(firstName,lastName,email,hireDate);
                employee.add(employees);
            }
        }catch(Exception exp){
            log.error("Exception While Executing User Detailes");
        }
        return employee;
    }



}


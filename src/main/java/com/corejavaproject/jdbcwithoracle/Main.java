package com.corejavaproject.jdbcwithoracle;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class Main {
    public static void main(String[] args) throws SQLException {
         Connection db=DBConnection.getConnection();
         log.info(db);
        EmpDAO empDAO = new EmpDAO();
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Kumar");
        emp.setEmail("kumar@gmail.com");
        emp.setSalary(3999.9);

        try{
            String response=empDAO.saveEmployee(emp);
            System.out.println(response);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

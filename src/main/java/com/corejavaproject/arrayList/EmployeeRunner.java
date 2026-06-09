package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> list =employeeList.getEmployee();

        List<Institute> instituteList = employeeList.getCourseList();

        log.info("Course Information :"+instituteList);

        employeeList.setEmployee(list);
        employeeList.empInfo(list);
        employeeList.empDetailes(list);
        employeeList.empinformation(list);









    }
}

package com.corejavaproject.basics;

public class EmployeeRunner {
    public static void main(String[] args) {
        Address address = new Address("Shashank","Neladri Nagar");
        Employee employee = new Employee(30000.0,"Niladri Nagar",address);
        Employee.info();
        employee.jobInfo();
    }
}

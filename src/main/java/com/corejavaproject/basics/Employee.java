package com.corejavaproject.basics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    public static int AGE=25;
    public static String NAME="Shashank";
    double salary;
    String address;
    Address add;

    Employee(){
    }
    Employee(double salary,String address,Address add){
        this.salary=salary;
        this.address=address;
        this.add=add;
    }
    public static void info(){
        log.info("Employee Age:"+AGE);
        log.info("Employee Name:"+NAME);

    }
    public void jobInfo(){
        log.info("Employee Salary:"+this.salary);
        log.info("Employee Address:"+this.address);
        log.info("Address:"+this.add);
    }

}

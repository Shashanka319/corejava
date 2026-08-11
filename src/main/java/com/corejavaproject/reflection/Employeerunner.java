package com.corejavaproject.reflection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
@Log4j2
public class Employeerunner {
    public static void main(String[] args) throws Exception{
        Employee employee=new Employee();

        Class aClass = employee.getClass();

        //private with instance variable
        Field field= aClass.getDeclaredField("id");
        field.setAccessible(true);
        field.setInt(employee,101);
        log.info("The Employee Id:"+field.get(employee));

        //private with static variable
        Field field1 = aClass.getDeclaredField("NAME");
        field1.setAccessible(true);
        field1.set(employee,"Shashank");
        //log.info("Employe name:"+field1.get(employee));
        log.info("The Employee Name:"+field1.get(employee));

        //public with instance variable
        Field field2 = aClass.getDeclaredField("add");
        field2.set(employee,"Bangalore");
        log.info("Employe address:"+field2.get(employee));

        //public with static variable
        Field field3 = aClass.getDeclaredField("MOBILE_NO");
        field3.set(employee,9743873982L);
        log.info("Employe Mobile Number:"+ Employee.MOBILE_NO);



    }
}

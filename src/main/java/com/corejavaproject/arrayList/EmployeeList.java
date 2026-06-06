package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
@Log4j2

public class EmployeeList {
    public List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee("Shashank", 101, "Davanagere");
        Employee employee1 = new Employee("Harshitha", 102, "Arsikere");
        Employee employee3 = new Employee("Shashi", 103, "Chitradurga");
        Employee employee4 = new Employee("Harshi", 104, "Hasan");

        list.add(employee);
        list.add(employee1);
        list.add(employee3);
        list.add(employee4);
        log.info("Employee1 Detailes:"+employee);
        log.info("Employee2 Detailes:"+employee1);
        log.info("Employee3 Detailes:"+employee3);
        log.info("Employee4 Detailes:"+employee4);
        return list;

    }


}

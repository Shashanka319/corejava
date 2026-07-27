package com.corejavaproject.assignment;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetRunner {
    public static void main(String[] args) {
        EmployeeWithTreeSet employee = new EmployeeWithTreeSet();
        employee.setId(101);
        employee.setName("Shashank");
        employee.setEmail("shashank@gmail.com");
        employee.setAddress("Magadi Road");

        EmployeeWithTreeSet employee1 = new EmployeeWithTreeSet();
        employee1.setId(104);
        employee1.setName("Shashank");
        employee1.setEmail("shashank@gmail.com");
        employee1.setAddress("Electronic City");

        EmployeeWithTreeSet employee2= new EmployeeWithTreeSet();
        employee2.setId(106);
        employee2.setName("Shashank Kumar");
        employee2.setEmail("kumar@gmail.com");
        employee2.setAddress("Bommasandra");

        EmployeeWithTreeSet employee3 = new EmployeeWithTreeSet();
        employee3.setId(102);
        employee3.setName("Sharath");
        employee3.setEmail("sharath@gmail.com");
        employee3.setAddress("BTM Layout");

        EmployeeWithTreeSet employee4 = new EmployeeWithTreeSet();
        employee4.setId(103);
        employee4.setName("Shashi");
        employee4.setEmail("shashi@gmail.com");
        employee4.setAddress("Hongasandra");

        EmployeeWithTreeSet employee5 = new EmployeeWithTreeSet();
        employee5.setId(105);
        employee5.setName("Sharu");
        employee5.setEmail("sharu@gmail.com");
        employee5.setAddress("Niladri nagar");

        Set<EmployeeWithTreeSet> set = new TreeSet<>(Comparator.comparing(EmployeeWithTreeSet::getId));
        set.add(employee);
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        set.forEach(System.out::println);
    }
}

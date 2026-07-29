package com.corejavaproject.assignment;

import java.util.HashSet;
import java.util.Set;

public class HashSetRunner {
    public static void main(String[] args) {
        EmployeeWithHashSet employee = new EmployeeWithHashSet();
        employee.setId(101);
        employee.setName("Shashank");
        employee.setEmail("shashank@gmail.com");
        employee.setAddress("Magadi Road");

        EmployeeWithHashSet employee1 = new EmployeeWithHashSet();
        employee1.setId(104);
        employee1.setName("Shashank");
        employee1.setEmail("shashank@gmail.com");
        employee1.setAddress("Electronic City");

        EmployeeWithHashSet employee2= new EmployeeWithHashSet();
        employee2.setId(106);
        employee2.setName("Shashank Kumar");
        employee2.setEmail("kumar@gmail.com");
        employee2.setAddress("Bommasandra");

        EmployeeWithHashSet employee3 = new EmployeeWithHashSet();
        employee3.setId(102);
        employee3.setName("Sharath");
        employee3.setEmail("sharath@gmail.com");
        employee3.setAddress("BTM Layout");

        EmployeeWithHashSet employee4 = new EmployeeWithHashSet();
        employee4.setId(103);
        employee4.setName("Shashi");
        employee4.setEmail("shashi@gmail.com");
        employee4.setAddress("Hongasandra");

        EmployeeWithHashSet employee5 = new EmployeeWithHashSet();
        employee5.setId(105);
        employee5.setName("Sharu");
        employee5.setEmail("sharu@gmail.com");
        employee5.setAddress("Niladri nagar");

        EmployeeWithHashSet employee6 = new EmployeeWithHashSet();
        employee6.setId(105);
        employee6.setName("Sharu");
        employee6.setEmail("sharu@gmail.com");
        employee6.setAddress("Niladri nagar");



        Set<EmployeeWithHashSet> set = new HashSet<EmployeeWithHashSet>();
        set.add(employee);
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee6);
        set.forEach(System.out::println);

       // for(Employee e: set){
        //    System.out.println(e);
        //}

    }
}

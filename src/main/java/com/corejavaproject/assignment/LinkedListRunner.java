package com.corejavaproject.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListRunner {
    public static void main(String[] args) {
        EmployeeWithLinkedList el = new EmployeeWithLinkedList();
        el.setId(101);
        el.setName("Shashank");
        el.setEmail("shashank@gmail.com");
        el.setAddress("Magadi Road");

        EmployeeWithLinkedList el1 = new EmployeeWithLinkedList();
        el1.setId(104);
        el1.setName("Shashank");
        el1.setEmail("shashank@gmail.com");
        el1.setAddress("Electronic City");

        EmployeeWithLinkedList el2= new EmployeeWithLinkedList();
        el2.setId(106);
        el2.setName("Shashank Kumar");
        el2.setEmail("kumar@gmail.com");
        el2.setAddress("Bommasandra");

        EmployeeWithLinkedList el3 = new EmployeeWithLinkedList();
        el2.setId(102);
        el2.setName("Sharath");
        el2.setEmail("sharath@gmail.com");
        el2.setAddress("BTM Layout");

        EmployeeWithLinkedList el4 = new EmployeeWithLinkedList();
        el4.setId(103);
        el4.setName("Shashi");
        el4.setEmail("shashi@gmail.com");
        el4.setAddress("Hongasandra");

        EmployeeWithLinkedList el5 = new EmployeeWithLinkedList();
        el4.setId(105);
        el4.setName("Sharu");
        el4.setEmail("sharu@gmail.com");
        el4.setAddress("Niladri nagar");

        Set<EmployeeWithLinkedList> set = new LinkedHashSet<>();
        set.add(el);
        set.add(el1);
        set.add(el2);
        set.add(el3);
        set.add(el4);
        set.add(el5);

        set.forEach(System.out::println);
    }
}

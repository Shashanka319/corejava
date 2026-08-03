package com.corejavaproject.jdbcwithoracle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    int id;
    String name;
    String email;
    double salary;
}

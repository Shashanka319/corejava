package com.corejavaproject.basics.constructor;

public class Employee {
    public String COMPANY_NAME="Emexo Technology";
    private String name;
    private int age;

    public Employee(){
        this.name="unkonown";
        this.age=0;
    }
    public Employee(String name, int age){
        this.name=name;
        this.age=age;

    }
    public void getEmployee(){
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Age : "+this.age);
        System.out.println("Company77 Name : "+COMPANY_NAME);
    }
    public  static void main(String[] args){
        Employee employee = new Employee("Shashanka",22);
        employee.getEmployee();
    }

}

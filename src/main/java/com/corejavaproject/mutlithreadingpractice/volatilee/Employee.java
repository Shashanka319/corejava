package com.corejavaproject.mutlithreadingpractice.volatilee;

public class Employee {
    private volatile static Employee obj;

    public static Employee getInstance() {
        if (obj == null) {
            synchronized (Employee.class) {
                if (obj == null) {
                    obj = new Employee();
                }
            }
        }
        return obj;
    }
}

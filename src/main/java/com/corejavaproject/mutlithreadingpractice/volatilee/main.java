package com.corejavaproject.mutlithreadingpractice.volatilee;

public class main {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            Employee emp = Employee.getInstance();
            System.out.println("Empployee1 :"+emp.hashCode());

        };
        Runnable r2 = ()->{
            Employee emp = Employee.getInstance();
            System.out.println("Empployee2 :"+emp.hashCode());
        };
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}

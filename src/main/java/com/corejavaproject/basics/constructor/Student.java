package com.corejavaproject.basics.constructor;

public class Student {
    private static String INSTITUTE_NAME="Emexo Technology";
    private String name;
    private int age;

    public Student(){
        this.name="unkown";
        this.age=0;
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getStudent(){
        System.out.println("Student Name : "+this.name);
        System.out.println("Student Age : "+this.age);
        System.out.println("Institute Name : "+INSTITUTE_NAME);
    }
    public static void main(String[] args){
        Student student=new Student("Shashank",25);
        student.getStudent();
    }
}

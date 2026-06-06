package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Employee {
    String name;
    int id;
    String Address;

    Employee(String name,int id,String Address){
        this.name=name;
        this.id=id;
    }
    public void info(){
        log.info("Employee Name:"+this.name);
        log.info("Employee Id:"+this.id);

    }
}

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
        this.Address=Address;
    }
    public void info(){
        log.info("Employee Name:"+this.name);
        log.info("Employee Id:"+this.id);

    }
    public String toString() {
        return "Employee [id=" + this.id + ", Name=" +this.name + ", Address=" + this.Address+ "]";
    }

}
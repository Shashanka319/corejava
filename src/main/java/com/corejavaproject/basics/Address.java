package com.corejavaproject.basics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Address {
    String name;
    String address;
    Address(String name,String address){
        this.name=name;
        this.address=address;

    }
    public void inforssss(){
        log.info("Name:"+this.name);
        log.info("Address:"+ this.address);
    }
}

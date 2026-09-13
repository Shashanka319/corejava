package com.corejavaproject.basics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Address {
    String name;
    String address;
    Mobile mobile;
    Address(String name,String address,Mobile mobile){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    public void info(){
        log.info("Name:"+this.name);
        log.info("Address:"+ this.address);
        Mobile mobile1 = new Mobile;
        mobile1.mobileInfo();
    }


}

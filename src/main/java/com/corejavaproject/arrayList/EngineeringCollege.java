package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class EngineeringCollege {
    String name;
    int noOfStaff;
    String principalName;
    Branches branches;

    EngineeringCollege(String name, int noOfStaff, String principalName, Branches branches) {
        this.name = name;
        this.noOfStaff = noOfStaff;
        this.principalName = principalName;
        this.branches = branches;
    }

    public void collegeInfo(){
        log.info("College Name:"+this.name);
        log.info("No of Staff:"+this.noOfStaff);
        log.info("Principal Name:"+this.principalName);
        log.info("Branches:"+this.branches.getBranches());
    }


}

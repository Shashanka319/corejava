package com.corejavaproject.basics.oops.pollymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RailwayStation implements Station {
    @Override
    public void getStationInfo() {
        log.info("Execute the Railway Station Information");
    }

    @Override
    public void getOfficerInfo() {
        log.info("Execute the Railway Station Officers Information");
    }
}

package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class RailwayStation implements Station {
    @Override
    public void getStationInfo() {
        log.info("Get the Railway Station Inforamtion");
    }

    @Override
    public void getOfficerInfo() {
        log.info("Get the Reilway Officers Information");

    }
}

package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class MetroStation implements Station {

    @Override
    public void getStationInfo() {
        log.info("Get the Metro Station Information");
    }

    @Override
    public void getOfficerInfo() {
        log.info("get the Metro Officer Informations");
    }
}

package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PoliceStation implements Station{
    @Override
    public void getStationInfo() {
        log.info("get the PolicStation Informations");
    }

    @Override
    public void getOfficerInfo() {
        log.info("Get the Police Officers Informations");
    }
    public  void getCaseInfo(){
        log.info("Get the Case Information in Police Station");
    }
}

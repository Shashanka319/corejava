package com.corejavaproject.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class PoliceStaion implements Station{
    int noOFPolice;
    String policeName;
    PoliceStaion(int noOFPolice,String policeName){
        this.noOFPolice=noOFPolice;
        this.policeName=policeName;
    }
    public void stationInfo(){
        log.info("Executing the Station Info in Police Station");
        log.info("Station Name:"+Station.name);
        log.info("Station Location:"+Station.location);
        log.info("No of Polices in Station:"+this.noOFPolice);
        log.info("Police Name:"+this.policeName);
    }

    @Override
    public void staionRules() {
        log.info("Station Rules:"+"On time Duty take to at any Situation");
    }
}

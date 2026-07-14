package com.corejavaproject.basics.oops.interfaces;

public class StationRunner {
    public static void main(String[] args) {

        Station station = new RailwayStation();
        Station station1 = new MetroStation();
        Station station2 = new PoliceStation();
        station.getStationInfo();
        station.getOfficerInfo();
        station1.getStationInfo();
        station1.getOfficerInfo();
        station2.getStationInfo();
        station2.getOfficerInfo();


        StationInfo stationInfo = new StationInfo();
        stationInfo.getStation(station);
        stationInfo.getStation(station1);
        stationInfo.getStation(station2);
        ((PoliceStation)station2).getCaseInfo();//downcasting



    }
}

package com.corejavaproject.basics.oops.interfaces;

public class StationRunner {
    public static void main(String[] args) {
        Station station = new RailwayStation();
        Station station1 = new MetroStation();
        Station station2 = new PoliceStation();
        StationInfo stationInfo = new StationInfo();
        stationInfo.getStation(station);
        stationInfo.getStation(station1);
        stationInfo.getStation(station2);
        ((PoliceStation)station2).getCaseInfo();



    }
}

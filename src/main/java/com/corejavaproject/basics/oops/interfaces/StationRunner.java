package com.corejavaproject.basics.oops.interfaces;

public class StationRunner {
    public static void main(String[] args) {
        Station station = new RailwayStation();
        Station station1 = new MetroStation();
        PoliceStation station2 = new PoliceStation();
        StationInfo stationInfo = new StationInfo();
        stationInfo.getStation(station);
        stationInfo.getStation(station1);
        stationInfo.getStation(station2);


    }
}

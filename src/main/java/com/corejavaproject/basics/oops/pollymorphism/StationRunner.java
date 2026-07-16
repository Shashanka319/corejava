package com.corejavaproject.basics.oops.pollymorphism;

public class StationRunner {
    public static void main(String[] args) {
        MetroStation metroStation = new MetroStation();
        RailwayStation railwayStation = new RailwayStation();
        PoliceStation policeStation = new PoliceStation();

        Information information = new Information();

        information.getInfo(metroStation);
        information.getInfo(railwayStation);
        information.getInfo(policeStation);
    }
}

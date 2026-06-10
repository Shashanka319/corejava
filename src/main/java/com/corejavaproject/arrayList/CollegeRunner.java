package com.corejavaproject.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CollegeRunner {
    public static void main(String[] args) {
        Branches branches = new Branches("GECClK",3);
        EngineeringCollege engineeringCollege = new EngineeringCollege("Government Engineering College Challakere",12,"MahaGundappa",branches);;
        engineeringCollege.collegeInfo();







    }
}

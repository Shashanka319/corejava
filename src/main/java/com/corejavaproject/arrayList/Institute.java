package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.Comparator;

@Log4j2

public class Institute implements Comparable<Institute> , Comparator<Institute> {
    int courseId;
    String courseName;
    String duration;
    double courseFees;
    String managerName;
    String trainer;

    Institute(){

    }


    Institute(int courseId, String courseName, String duration, double courseFees, String managerName, String trainer){
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
        this.courseFees=courseFees;
        this.managerName=managerName;
        this.trainer=trainer;
    }

    public int compareTo(Institute institute){
        log.info("According to Compareto");
        return this.courseId-institute.courseId;
    }



    @Override
    public String toString() {
        // Keeps everything on one line for a clean array presentation
        return "[Id=" + this.courseId + ", Name=" + this.courseName + ", Duration=" + this.duration + ", Fees=" + this.courseFees + "]";
    }

    @Override
    public int compare(Institute i1, Institute i2) {
        return Double.compare(i1.courseFees, i2.courseFees);
    }

}

package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Institute {
    int courseId;
    String courseName;
    String duration;
    double courseFees;
    String managerName;
    String trainer;

    Institute(int courseId, String courseName, String duration, double courseFees, String managerName, String trainer){
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
        this.courseFees=courseFees;
        this.managerName=managerName;
        this.trainer=trainer;
    }
    public  void institueInfo(){
        log.info("Course Id:"+this.courseId);
        log.info("Course Name:"+this.courseName);
        log.info("Course Duration:"+this.duration);
        log.info("Course Fees:"+this.courseFees);
        log.info("Course Manager Name:"+this.managerName);
        log.info("Course Trainer Name:"+this.trainer);
    }


}

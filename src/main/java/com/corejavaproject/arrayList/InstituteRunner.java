package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2

public class InstituteRunner {
    public static void main(String[] args) {
        CourseList courseList = new CourseList();
        List<Institute> list = courseList.getInstitute();
        courseList.courseList(list);
        courseList.course(list);
        courseList.Info(list);
        courseList.information(list);



    }

}

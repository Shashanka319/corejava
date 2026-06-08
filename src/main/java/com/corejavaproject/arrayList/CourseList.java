package com.corejavaproject.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    public List<Institute> getInstitute(){
        List<Institute> list = new ArrayList<>();
        Institute institute = new Institute(101,"Java FullStack","SIx Months",30000.0,"Reno","Reghu");
        list.add(institute);
        institute = new Institute(102,"Java core","Two Months",15000,"Reno","Raghu");
        list.add(institute);
        institute = new Institute(103,"Java Advance","Two Months",13.5000,"Reno","Reghu");
        list.add(institute);
        institute = new Institute(104,"Spring Boot","two Months",15000.0,"Reno","Reghu");
        list.add(institute);

        return list;
    }
}

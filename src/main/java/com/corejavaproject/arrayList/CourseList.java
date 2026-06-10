package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Log4j2

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

    public void courseList(List<Institute> lists){
        if(CollectionUtils.isNotEmpty(lists)){
            log.info("Execute the courseList in Institute");
            lists.forEach(log::info);

        }
    }
    public void course(List<Institute>  list){
        if(CollectionUtils.isNotEmpty(list)){
            log.info("Execute the course Detailes in CourseList of Institute");
            for(int i=0;i<list.size();i++){
              log.info(list.get(i));

            }
        }
    }

}
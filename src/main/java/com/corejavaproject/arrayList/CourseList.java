package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        log.info("");
        if(CollectionUtils.isNotEmpty(list)){
            log.info("Execute the course Detailes in CourseList of Institute");
            for(int i=0;i<list.size();i++){
              log.info(list.get(i));


            }
        }
    }

    public void Info(List<Institute>  lists){
        log.info("");
        if(CollectionUtils.isNotEmpty(lists)){
            log.info("Execute the info in Course List of Institute");
            Iterator<Institute> iterator = lists.iterator();
            while(iterator.hasNext()){
                log.info(iterator.next());

            }
        }
    }

    public void information(List<Institute>  lists){
        log.info("");
        if(CollectionUtils.isNotEmpty(lists)){
            log.info("Execute the Information in Course List of Institute");
            Iterator<Institute> iterator = lists.iterator();
            while(iterator.hasNext()){
                log.info(iterator.next());

            }
            log.info("");
            log.info("Execute the information in Course List of Institute in Reverse Order");
            ListIterator<Institute> listIterator = lists.listIterator(lists.size());
            while(listIterator.hasPrevious()){
                log.info(listIterator.previous());
            }
        }
    }

}
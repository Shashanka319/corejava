package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Log4j2
public class CourseList {
    public List<Institute> getInstitute() {
        List<Institute> list = new ArrayList<>();
        Institute institute = new Institute(101, "Java FullStack", "Six Months", 30000.0, "Reno", "Reghu sir");
        Institute institute1 = new Institute(103, "Java core", "Three Months", 19000.0, "Reno sir", "Raghu");
        Institute institute2 = new Institute(102, "Java Advance", "Four Months", 17000.5, "Reno manager", "Reghu Trainer");
        Institute institute3 = new Institute(106, "Spring Boot", "Five Months", 13000.0, "Reno coordinator", "Reghu Guider");

        list.add(institute);
        list.add(institute1);
        list.add(institute2);
        list.add(institute3);

        log.info("Index Zero:"+list.get(0));

        Collections.sort(list);
        log.info("Customized List using comparator");
        Collections.sort(list, new Institute());
        list.forEach(log::info);
        return list;
    }

    public void setlamdaExpression(List<Institute> lists) {
        if (CollectionUtils.isNotEmpty(lists)) {
            log.info("Execute the courseList in Institute in For Each Formate");
            lists.forEach(log::info);

        }
    }

    public void setForLoop(List<Institute> list) {
        log.info("");
        if (CollectionUtils.isNotEmpty(list)) {
            log.info("Execute the course Detailes in CourseList of Institute in For looping Formate");
            for (int i = 0; i < list.size(); i++) {
                log.info(list.get(i));

            }
        }
    }

    public void setIterator(List<Institute> lists) {
        log.info("");
        if (CollectionUtils.isNotEmpty(lists)) {
            log.info("Execute the info in Course List of Institute in Iterator Formate");
            Iterator<Institute> iterator = lists.iterator();
            while (iterator.hasNext()) {
                log.info(iterator.next());

            }
        }
    }

    public void setListIterator(List<Institute> lists) {

        if (CollectionUtils.isNotEmpty(lists)) {
            log.info("Execute the Information in Course List of Institute in Order in List Iterator Formate");
            ListIterator<Institute> listiterators = lists.listIterator();
            while (listiterators.hasNext()) {
                log.info(listiterators.next());

            }

            log.info("Execute the information in Course List of Institute in Reverse Order");
            while (listiterators.hasPrevious()) {
                log.info(listiterators.previous());
            }
        }


    }

}

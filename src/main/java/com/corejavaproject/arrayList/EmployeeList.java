package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Log4j2

public class EmployeeList {
    public List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee("Shashank", 101, "Davanagere");
        Employee employee1 = new Employee("Harshitha", 102, "Arsikere");
        Employee employee3 = new Employee("Shashi", 103, "Chitradurga");
        Employee employee4 = new Employee("Harshi", 104, "Hasan");

        list.add(employee);
        list.add(employee1);
        list.add(employee3);
        list.add(employee4);

        return list;




    }

    public void setEmployee(List<Employee> list){

        if(CollectionUtils.isNotEmpty(list)){
            log.info("Execute the setEmployee in Employee List....");
            list.forEach(data ->log.info(data));
        }
    }

    public void empInfo(List<Employee>list){
        if(CollectionUtils.isNotEmpty(list)) {
            log.info("Execute the empInfo in Employee List");
            for (int i = 0; i < list.size(); i++) {
                Employee data = list.get(i);

                log.info(data);
            }

        }

    }

   public void empDetailes(List<Employee>list){
        if(CollectionUtils.isNotEmpty(list)) {
            log.info("Execute the empDetailes in EmployeeList");
            Iterator<Employee> iterator = list.iterator();
            while (iterator.hasNext()) {
                Employee data = iterator.next();
                log.info(data);
            }
        }
   }

   public void empinformation(List<Employee>list){
        if(CollectionUtils.isNotEmpty(list)) {
            log.info("Execute the empInformation in Employee List");
            ListIterator<Employee> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                Employee data = listIterator.next();
                log.info(listIterator.next());
            }
            while (listIterator.hasPrevious()) {
                log.info(listIterator.previous());
            }
        }
   }

}

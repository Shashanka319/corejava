package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Log4j2

public class ArrayListExp {
    public List<String> getGames(){
        List<String> list = new ArrayList<>();
        list.add("Football");
        list.add("Badminton");
        list.add("Cricket");
        list.add("Volleyball");
        log.info("index Zero Information:"+list.get(0));



        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        log.info("Assending Order:"+list);
        log.info("Desending Order:"+list);
        return list;
    }
    public List<String> desendingOrder(){
        List<String> desendingList = new ArrayList<>();
        desendingList.add("Badminton");
        desendingList.add("ThrowBall");
        desendingList.add("Haky");
        desendingList.add("FootBall");

        Collections.sort(desendingList, Collections.reverseOrder());

        return desendingList;
    }

    public void iterateWithLambda(List<String> list){

        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(log::info);
        }
    }
}
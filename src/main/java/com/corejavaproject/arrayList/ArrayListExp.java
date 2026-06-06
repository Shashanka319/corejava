package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Log4j2

public class ArrayListExp {
    public List<String> getGames(){
        List<String> list = new ArrayList<>();
        list.add("Football");
        list.add("Badminton");
        list.add("Cricket");
        list.add("Volleyball");

        return list;
    }

    public void iterateWithLambda(List<String> list){

        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(log::info);
        }
    }
}
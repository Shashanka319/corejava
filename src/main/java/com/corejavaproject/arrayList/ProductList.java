package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class ProductList {
    public List<Dmart> getProductList(){
        List<Dmart> list = new ArrayList<Dmart>();
        Dmart dmart = new Dmart(101,"Shampoo","Electranic City",true);
        Dmart dmart1 = new Dmart(102,"Book","Electranic City",true);
        Dmart dmart2 = new Dmart(103,"T shirt","Electranic City",true);
        Dmart dmart3 = new Dmart(104,"Shoes","Electranic City",true);
        Dmart dmart4 = new Dmart(105,"Shirt","Electranic City",true);
        list.add(dmart);
        list.add(dmart1);
        list.add(dmart2);
        list.add(dmart3);
        list.add(dmart4);
        return list;

    }

    public void setProductList(List<Dmart> lists) {
        if (CollectionUtils.isNotEmpty(lists)) {
            log.info("Execute the courseList in Institute in For Each Formate");
            lists.forEach(log::info);
        }
    }


}

package com.corejavaproject.classWork;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.LinkedHashSet;
import java.util.Set;
@Log4j2

public class 6ZomotoRunner {
    public static void main(String[] args) {
        Set<Zomoto> set = new LinkedHashSet<Zomoto>();
        Zomoto zomoto = new Zomoto();
        zomoto.setId(101);
        zomoto.setName(null);
        zomoto.setPrice(150.0);
        zomoto.setAvailable(true);
        set.add(zomoto);

        Zomoto zomoto1 = new Zomoto();
        zomoto1.setId(0);
        zomoto1.setName(null);
        zomoto1.setPrice(0.0);
        zomoto1.setAvailable(false);
        set.add(zomoto1);

        set.forEach(data -> log.info(data.toString()));
    }
}

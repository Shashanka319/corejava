package com.corejavaproject.classWork;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.LinkedHashSet;
import java.util.Set;
@Log4j2

public class ZomotoRunner {
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

        Zomoto zomoto2 = new Zomoto();
        zomoto2.setId(101);
        zomoto2.setName(null);
        zomoto2.setPrice(150.0);
        zomoto2.setAvailable(true);
        set.add(zomoto2);

        Zomoto zomoto3 = new Zomoto();
        zomoto3.setId(0);
        zomoto3.setName(null);
        zomoto3.setPrice(0.0);
        zomoto3.setAvailable(false);
        set.add(zomoto3);

        set.forEach(data -> log.info(data.toString()));
    }
}

package com.corejavaproject.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class Branches {
    String collegeName;
    int noOfBranches;

    Branches(String collegeName, int noOfBranches) {
        this.collegeName = collegeName;
        this.noOfBranches = noOfBranches;
    }

    public List<String> getBranches() {
        List<String> list = new ArrayList<>();
        log.info("Executing the get Branches in Branchges of College");
        list.add("Compute Science and Engineering");
        list.add("Artificial Intelligence and Engineering");
        list.add("Auto Mobile Engineering");
        log.info(list.toString());

        return list;
    }










}

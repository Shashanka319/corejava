package com.corejavaproject.ref;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class EmployeeRunner {
    public static void main(String[] args) {
        log.info("Organization Nmae:"+Employee.ORGANIZATION_NAME);
        log.info("ETABLISHED_YEAR:"+Employee.ETABLISHED_YEAR);

    }
}

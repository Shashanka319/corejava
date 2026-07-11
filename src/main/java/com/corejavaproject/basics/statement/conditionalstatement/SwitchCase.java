package com.corejavaproject.basics.statement.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.generateRegulatoryReport("NA");

    }
    public void generateRegulatoryReport(String region){
        log.info("Generating regulatory report According to region: ");
        switch (region) {
            case "NA":
                log.info("Generating regulatory report for region: NA");
                break;
            case "APAC":
                log.info("Generating regulatory report for region: APAC");
                break;
            case "EUA":
                log.info("Generating regulatory report for region: EUA");
                break;
            default:
                log.info("Region not recognized");
                break;
        }
    }
}

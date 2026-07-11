package com.corejavaproject.basics.statement.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SwitchCase {
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
    public int caluclateInterestRate(String loanType){
        log.info("Calculating interest rate for loanType: ");
        int interestRate;
        switch (loanType) {
            case "Home Loan":
                interestRate = 12;
                break;
            case "Business Loan":
                interestRate = 22;
                break;
            case "Car Loan":
                interestRate = 10;
                break;
            default:
                interestRate = 12;
                break;
        }
        return interestRate;
    }

    public int caluclateInterestRateWithLamda(String loanType){
        log.info("Calculating interest rate for loanType: ");
        return switch (loanType){
            case "Home Loan" -> 12;
            case "Business Loan" -> 22;
            case "Car Loan" -> 10;
            case "Personal Loan" -> {
                log.info("Execute the Personla Loan ");
                print();
                yield 12;
            }
            default -> 12;
        };
    }
    public void print(){
        log.info("Execute the Print method in Switchcase ");
    }

}

package com.corejavaproject.basics.statement.conditionalstatement;

public class SwitchCaseRunner {
    public static void main(String[] args) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.generateRegulatoryReport("NA");
        switchCase.caluclateInterestRate("Home Loan");
        switchCase.caluclateInterestRateWithLamda("Personal Loan");

    }
}

package com.corejavaproject.enum1;

public enum AccountType {
    SAVING_ACCOUNT("saving acc"), CURRENT_ACCOUNT("current acc"),LOAN_ACCOUNT("loan acc");

    private String accountType;

    AccountType(String type){
        this.accountType = type;
    }

    public String getAccountType() {
        return accountType;
    }

}

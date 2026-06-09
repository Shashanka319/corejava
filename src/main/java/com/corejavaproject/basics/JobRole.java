package com.corejavaproject.basics;

import lombok.Getter;

public class JobRole {
    @Getter
    String empName;
    String jobRole;
    public JobRole(String empName, String jobRole) {
        this.empName = empName;
        this.jobRole = jobRole;
    }

    public String getJobRole() {
        System.out.println("Executing jobrole in Job ");
        System.out.println("empName: " + empName);
        System.out.println("jobRole: " + jobRole);
        this.jobRole = jobRole;
        return this.jobRole;
    }
}

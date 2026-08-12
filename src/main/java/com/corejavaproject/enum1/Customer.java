package com.corejavaproject.enum1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String name;
    private String email;
    AccountType accountType;

}

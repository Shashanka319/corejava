package com.corejavaproject.comparator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private int id;
    private boolean available;
    private String type;
    private double price;

}

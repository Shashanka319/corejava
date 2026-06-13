package com.corejavaproject.classWork;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Order implements Comparable<Order>{
    int id;
    String productName;
    double price;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(price, order.price) == 0 && Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, price);
    }

    @Override
    public int compareTo(Order order) {
        return this.id - order.id;
    }
}

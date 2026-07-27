package com.corejavaproject.comparator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@ToString
@Log4j2

public class Product {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(103);
        product.setName("TShirt");
        product.setPrice(1222.5);

        Product product1 = new Product();
        product1.setId(101);
        product1.setName("Shirt");
        product1.setPrice(1222.5);

        Product product2 = new Product();
        product2.setId(102);
        product2.setName("Fan");
        product2.setPrice(1222.5);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);

        list.sort(Comparator.comparing(Product ::getId));
        list.forEach(System.out::println);

        Book book = new Book();
        book.setId(103);
        book.setType("Rould Long Book");
        book.setPrice(122.5);
        book.setAvailable(true);

        Book book1 = new Book();
        book1.setId(101);
        book1.setType("UnRould Long Book");
        book1.setPrice(168.5);
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setId(104);
        book2.setType(" Long Book");
        book2.setPrice(122.5);
        book2.setAvailable(true);

        Book book3 = new Book();
        book3.setId(102);
        book3.setType("UnRould A4 Book");
        book3.setPrice(122.5);
        book3.setAvailable(true);

        List<Book> list1 = new ArrayList<>();
        list1.add(book);
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);

        list1.sort(Comparator.comparing(Book::getId));
        list1.forEach(System.out::println);

        log.info("Sorted by Price");
        list1.sort(Comparator.comparing(Book::getPrice));
        list1.forEach(System.out::println);

    }
    int id;
    String name;
    double price;
}

package com.corejavaproject.reflection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class ProductRunner {
    public static void main(String[] args) throws Exception {
        Product product = new Product();

        Class<?> productClass = product.getClass();

        //access private variable
        Field field=productClass.getDeclaredField("id");
        field.setAccessible(true);
        field.set(product,101);
        log.info("The Product Id:"+field.get(product));

        //access public variable
        Field field1=productClass.getDeclaredField("name");
        field1.set(product,"T-shirt");
        log.info("The Product Name:"+field1.get(product));

        //access private method
        Method method=productClass.getDeclaredMethod("getQuantity", int.class);
        method.setAccessible(true);
        //log.info("The Product Quantity:"+method.invoke(product,6));

        int quantity=(int)method.invoke(product,5000);
        log.info("The Product Quantity:"+quantity);

        //access public method
        Method method1=productClass.getDeclaredMethod("getPrice",double.class);
        double price=(double)method1.invoke(product,quantity);
        log.info("The Product Price:"+price);

        //get the variables
        Field[] fields = productClass.getDeclaredFields();
        for (Field field2 : fields) {
            log.info("Get Variable:"+field2.getName());
        }

        //get the Methods
        Method[] methods = productClass.getDeclaredMethods();
        for (Method method2 : methods) {
            log.info("Get Methods:"+method2.getName());
        }

    }
}

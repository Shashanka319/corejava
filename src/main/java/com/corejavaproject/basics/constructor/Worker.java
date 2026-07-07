package com.corejavaproject.basics.constructor;

public class Worker {

static String MARKET_NAME="D-Mart";
String name;
int age;
long mobileNo;
String address;
String productName;
double price;

Customer(){
    this.name="unkown";
    this.age=0;
    this.mobileNo=0;
    this.address="unkown";
    this.productName="unkown";
    this.price=0;
}
Customer(String name,int age,long mobileNo,String address,String productName,double price){
    this.name=name;
    this.age=age;
    this.mobileNo=mobileNo;
    this.address=address;
    this.productName=productName;
    this.price=price;
}
public void getDetails(){
    System.out.println("Market Name:"+MARKET_NAME);
    System.out.println(" Customer Name : "+this.name);
    System.out.println("Customer Age : "+this.age);
    System.out.println("Customer Mobile No : "+this.mobileNo);
    System.out.println("Customer Address : "+this.address);
    System.out.println("Product Name : "+this.productName);
    System.out.println(" Product Price : "+this.price);

}
public static void getWorkers(){
    Worker w=new Worker();
    w.getDetails();
}

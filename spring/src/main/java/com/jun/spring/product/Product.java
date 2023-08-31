package com.jun.spring.product;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


public class Product {


    String name;


    int price;
    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
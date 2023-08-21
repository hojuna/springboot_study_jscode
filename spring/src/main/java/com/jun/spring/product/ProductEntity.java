package com.jun.spring.product;



import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@NoArgsConstructor
@Table
@Entity
public class ProductEntity{

    @Id
    long id;

    @Column
    String name;

    @Column
    int price;

//    @Column
//    String name;
//
//    @Column
//    int price;

    public ProductEntity(long id, String name,int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getPrice() {
//        return price;
//    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public long getId() {
//        return id;
//    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductEntity[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}

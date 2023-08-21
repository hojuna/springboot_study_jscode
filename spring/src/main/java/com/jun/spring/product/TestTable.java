package com.jun.spring.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class TestTable {

    @Id
    private long id;

    @Column
    private  String name;
    //columns는 ㅜ머임?


    public TestTable(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestTable(){

    }
}

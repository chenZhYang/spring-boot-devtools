package com.chen.springbootdevtools.model;

import lombok.Data;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/16 1:37
 */
@Data
public class Person {
    private int age;
    private String name;
    private long time;

    public Person(int age,String name,long time){
        this.age = age;
        this.name = name;
        this.time = time;
    }
}

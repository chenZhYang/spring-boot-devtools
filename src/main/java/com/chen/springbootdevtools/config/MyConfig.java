package com.chen.springbootdevtools.config;

import com.chen.springbootdevtools.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/16 1:36
 */
@Configuration
public class MyConfig {

    @Autowired
    Person person;

    @Bean
//    @Lazy
    @Scope(value = "prototype")
    public Person person(){
        System.out.println("创建Person："+System.currentTimeMillis());
        return new Person(11,"陈正阳",System.currentTimeMillis());
    }

    public Person getPerson(){
        return person;
    }
}

package com.chen.springbootdevtools;

import com.chen.springbootdevtools.config.ApplicationContextHolder;
import com.chen.springbootdevtools.config.MyConfig;
import com.chen.springbootdevtools.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDevtoolsApplicationTests {

    @Autowired
    Person person;
    @Autowired
    MyConfig myConfig;

    @Test
    void contextLoads() {
        System.out.println(person);

        Person person1 = myConfig.getPerson();
        System.out.println(person1);
        System.out.println(person1.equals(person));
    }

}

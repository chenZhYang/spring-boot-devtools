package com.chen.springbootdevtools.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/15 2:22
 */
@RestController
public class TestController {

    @RequestMapping("/test1")
    public String test(){
        System.out.println("到这了ddd111ddd1");
        return "hello devtools hhs1111s";
    }
}

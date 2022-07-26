package com.zhan.out.tomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 外嵌tomcat
 */
@RestController
public class DefaultController {
    @RequestMapping("/")
    public String Welcome(){
        return "hello world";
    }
}

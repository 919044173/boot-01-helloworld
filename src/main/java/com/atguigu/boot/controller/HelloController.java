package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ay.
 * @create 2022-12-10 17:25
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){

        return "Hello SpringBoot2 !!!";
    }
}

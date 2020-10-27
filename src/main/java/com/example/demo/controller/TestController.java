package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: geek
 * @Date: 2020/10/25 20:35
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}

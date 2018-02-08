package com.mysoft.servicedemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHi")
    public String sayHi(@RequestParam String name) {
        return "Hi~ " + name + ",from port:" + port;
    }
}

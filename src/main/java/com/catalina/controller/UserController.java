package com.catalina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

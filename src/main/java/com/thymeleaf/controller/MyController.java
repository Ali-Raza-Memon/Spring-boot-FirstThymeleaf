package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(){

        System.out.println("Inside about handler");
        return "about";
    }
}

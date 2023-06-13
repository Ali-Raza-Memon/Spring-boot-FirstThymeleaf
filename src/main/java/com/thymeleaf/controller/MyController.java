package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model model){

        model.addAttribute("name","Ali Raza");
        model.addAttribute("currentDate", new Date());

        System.out.println("Inside about handler");
        return "about";
    }
}

package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }
}

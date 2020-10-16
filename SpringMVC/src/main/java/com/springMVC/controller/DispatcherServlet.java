package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherServlet {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld";
    }
}

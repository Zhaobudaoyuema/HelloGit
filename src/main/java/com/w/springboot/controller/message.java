package com.w.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class message {


    @RequestMapping(value = "/message")
    public String message(Model model){

        model.addAttribute("shuju","测试");

        return "message";
    }
}

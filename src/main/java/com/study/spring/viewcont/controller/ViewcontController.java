package com.study.spring.viewcont.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ViewcontController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @RequestMapping("get204")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void get204(){
    }

    @GetMapping("mvctest")
    public String mvctest(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-temp";
    }


}

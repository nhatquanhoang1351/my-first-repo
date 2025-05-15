package com.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class vidu1chuong4 {

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Hello World from Spring MVC!");
        return mv;
    }
}

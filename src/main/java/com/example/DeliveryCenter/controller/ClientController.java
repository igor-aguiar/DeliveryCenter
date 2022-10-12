package com.example.DeliveryCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("client")
public class ClientController {

    @GetMapping("registerForm")
    public ModelAndView registerForm(){
        ModelAndView mv = new ModelAndView("client/registerForm");
        return mv;
    }
}

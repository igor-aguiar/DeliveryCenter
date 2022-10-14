package com.example.DeliveryCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("order")
public class OrderController {

    @GetMapping("register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("order/register");
        return mv;
    }
}

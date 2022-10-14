package com.example.DeliveryCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("product")
public class ProductController{

    @GetMapping("register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("product/register");
        return mv;
    }
}

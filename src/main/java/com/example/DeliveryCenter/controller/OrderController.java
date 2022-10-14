package com.example.DeliveryCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("order")
public class OrderController {

    @GetMapping("register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("order/register");
        LocalDateTime orderTime = LocalDateTime.now();
        mv.addObject("orderTime", orderTime.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")));
        return mv;
    }
}

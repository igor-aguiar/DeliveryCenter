package com.example.DeliveryCenter.controller;

import com.example.DeliveryCenter.dto.ClientDTO;
import com.example.DeliveryCenter.dto.ProductDTO;
import com.example.DeliveryCenter.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("product")
public class ProductController{
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("product/register");
        return mv;
    }

    @PostMapping("register")
    public ModelAndView register(ProductDTO dto){
        productRepository.save(dto.toProduct());
        ModelAndView mv = new ModelAndView("product/register");
        return mv;
    }
}

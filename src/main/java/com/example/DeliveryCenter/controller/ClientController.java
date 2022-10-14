package com.example.DeliveryCenter.controller;

import com.example.DeliveryCenter.dto.ClientDTO;
import com.example.DeliveryCenter.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("client")
public class ClientController {

    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("register")
    public ModelAndView registerForm(){
        ModelAndView mv = new ModelAndView("client/register");
        return mv;
    }

    @PostMapping("register")
    public ModelAndView register(ClientDTO dto){
        clientRepository.save(dto.toClient());
        ModelAndView mv = new ModelAndView("client/register");
        return mv;
    }
}

package com.example.DeliveryCenter.controller;

import com.example.DeliveryCenter.dto.EmployeeDTO;
import com.example.DeliveryCenter.model.Employee;
import com.example.DeliveryCenter.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("register")
    public ModelAndView registerForm(){
        ModelAndView mv = new ModelAndView("employee/register");
        return mv;
    }

    @PostMapping("register")
    public ModelAndView register(EmployeeDTO dto){
        Employee employee = dto.toEmployee();
        employeeRepository.save(employee);
        ModelAndView mv = new ModelAndView("employee/register");
        return mv;
    }
}

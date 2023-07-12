package com.muhammedessa.mysecondproject.controllers;

 
import java.util.List;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhammedessa.mysecondproject.models.Employees;
import com.muhammedessa.mysecondproject.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
    
    private final EmployeeService employeeService;


    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


 @GetMapping
    public List<Employees> getAllEmployees(){ 
        return  employeeService.getAllEmployees();
    }



}

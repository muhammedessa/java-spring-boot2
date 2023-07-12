package com.muhammedessa.mysecondproject.controllers;

 
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhammedessa.mysecondproject.models.Department;
import com.muhammedessa.mysecondproject.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentRestController {
    
    private final DepartmentService departmentService;

    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping
    public List<Department> getAllDepartments(){
        return   departmentService.getAllDepartment() ;
    }

}

package com.muhammedessa.mysecondproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.muhammedessa.mysecondproject.models.Department; 
import com.muhammedessa.mysecondproject.models.Position; 

@Service
public class DepartmentService {

     private static final List<Department> departments = new ArrayList<>();

     static{
        departments.add(new Department(UUID.randomUUID().toString(), "IT", "Kirkuk", Position.MANAGER));
        departments.add(new Department(UUID.randomUUID().toString(), "HR", "Erbil", Position.MEMBER));
        departments.add(new Department(UUID.randomUUID().toString(), "Developer", "Baghdad", Position.SUPERVISOR));
        departments.add(new Department(UUID.randomUUID().toString(), "Engineering", "Basra", Position.TEAMLEADER)); 
     }

      public List<Department> getAllDepartment(){
        return departments;
    }
    
}

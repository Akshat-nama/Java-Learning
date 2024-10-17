package com.example.jpaDataMapping.jpaDataMapping.controllers;

import com.example.jpaDataMapping.jpaDataMapping.entities.EmployeeEntity;
import com.example.jpaDataMapping.jpaDataMapping.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    EmployeeController( EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id){

        return employeeService.getEmployeeById(id);

    }

//    @GetMapping
//    public List<EmployeeEntity> getAllEmployees(){
//        return employeeService.getAllEmployee();
//    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeEntity);
    }
}

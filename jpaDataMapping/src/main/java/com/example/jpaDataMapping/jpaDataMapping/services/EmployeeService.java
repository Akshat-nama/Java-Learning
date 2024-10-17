package com.example.jpaDataMapping.jpaDataMapping.services;

import com.example.jpaDataMapping.jpaDataMapping.entities.EmployeeEntity;
import com.example.jpaDataMapping.jpaDataMapping.repositories.DepartmentRepository;
import com.example.jpaDataMapping.jpaDataMapping.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
}

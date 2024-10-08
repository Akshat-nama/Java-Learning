package com.codingshuttle.springbootweb.springbootweb.services;

import com.codingshuttle.springbootweb.springbootweb.dto.EmployeeDTO;
import com.codingshuttle.springbootweb.springbootweb.entities.EmployeeEntity;
import com.codingshuttle.springbootweb.springbootweb.exceptions.ResourceNotFoundException;
import com.codingshuttle.springbootweb.springbootweb.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public Optional<EmployeeDTO> getEmployeeById(Long id) {
        isEmployeeExists(id);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);
        return employeeEntity.map(employeeEntity1 -> modelMapper.map(employeeEntity1, EmployeeDTO.class));
    }

    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        EmployeeEntity toSave = modelMapper.map(employee, EmployeeEntity.class);
        EmployeeEntity savedEmployee =  employeeRepository.save(toSave);
        return modelMapper.map(savedEmployee,EmployeeDTO.class);

    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities.stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());

    }

    public EmployeeDTO updateEmployeeById(Long id, EmployeeDTO updatedData) {

        EmployeeEntity employeeEntity = modelMapper.map(updatedData, EmployeeEntity.class);
        employeeEntity.setId(id);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(employeeEntity);
        return modelMapper.map(savedEmployeeEntity, EmployeeDTO.class);
    }

    public boolean deleteEmployeeById(Long id) {
        isEmployeeExists(id);
        employeeRepository.deleteById(id);
        return true;
    }

    public EmployeeDTO updatePartialEmployeeId(Long id, Map<String, Object> updates) {
        isEmployeeExists(id);
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        updates.forEach((field, value) -> {
            Field fieldToBeUpdated = ReflectionUtils.findRequiredField(EmployeeEntity.class, field);
            fieldToBeUpdated.setAccessible(true);
            ReflectionUtils.setField(fieldToBeUpdated, employeeEntity, value);
        });

        employeeRepository.save(employeeEntity);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);


    }

    private void isEmployeeExists(Long id) {
        boolean isExists = employeeRepository.existsById(id);
        if(!isExists)
            throw new ResourceNotFoundException("Employee not found with id "+ id);
    }


}

package com.codingshuttle.springbootweb.springbootweb.controllers;

import com.codingshuttle.springbootweb.springbootweb.dto.EmployeeDTO;
import com.codingshuttle.springbootweb.springbootweb.exceptions.ResourceNotFoundException;
import com.codingshuttle.springbootweb.springbootweb.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "employeeId") Long id) {
        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
        return employeeDTO
                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody @Valid EmployeeDTO inputEmployee) {
        EmployeeDTO savedValue = employeeService.createEmployee(inputEmployee);
        return new ResponseEntity<>(savedValue, HttpStatus.CREATED);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployeeById(@PathVariable(name = "employeeId") Long id, @RequestBody @Valid EmployeeDTO updatedData) {
        return ResponseEntity.ok(employeeService.updateEmployeeById(id, updatedData));
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable(name = "employeeId") Long id) {
        boolean gotDeleted = employeeService.deleteEmployeeById(id);
        if (gotDeleted)
            return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@PathVariable(name = "employeeId") Long id, @RequestBody Map<String, Object> updates) {
        EmployeeDTO updatedEmployee = employeeService.updatePartialEmployeeId(id, updates);
        if (updatedEmployee != null)
            return ResponseEntity.ok(updatedEmployee);
        return ResponseEntity.notFound().build();
    }
}

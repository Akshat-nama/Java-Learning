package com.example.jpaDataMapping.jpaDataMapping.controllers;

import com.example.jpaDataMapping.jpaDataMapping.entities.DepartmentEntity;
import com.example.jpaDataMapping.jpaDataMapping.services.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable Long id){

        return departmentService.getDepartmentById(id);

    }
//
//    @GetMapping
//    public List<DepartmentEntity> getAllDepartments(){
//        return departmentService.getAllDepartment();
//    }

    @PostMapping
    public DepartmentEntity createDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.createDepartment(departmentEntity);
    }

    @PutMapping (path = "/{departmentId}/manager/{employeeId}")
    public DepartmentEntity assignManagerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignManagerToDepartment(departmentId, employeeId);
    }

    @GetMapping(path = "/getAssignedDepartmentOfManager/{employeeId}")
    public DepartmentEntity getAssignedDepartmentOfManager(@PathVariable Long employeeId){
        return departmentService.getAssignedDepartmentOfManager(employeeId);
    }

    @PutMapping (path = "/{departmentId}/worker/{employeeId}")
    public DepartmentEntity assignWorkerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignWorkerToDepartment
                (departmentId, employeeId);
    }

    @PutMapping (path = "/{departmentId}/freelancers/{employeeId}")
    public DepartmentEntity assignFreelancerToDepartment(@PathVariable Long departmentId, @PathVariable Long employeeId){
        return departmentService.assignFreelancerToDepartment
                (departmentId, employeeId);
    }

}

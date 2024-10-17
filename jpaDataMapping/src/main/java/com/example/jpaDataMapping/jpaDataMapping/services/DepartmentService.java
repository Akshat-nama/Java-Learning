package com.example.jpaDataMapping.jpaDataMapping.services;

import com.example.jpaDataMapping.jpaDataMapping.entities.DepartmentEntity;
import com.example.jpaDataMapping.jpaDataMapping.entities.EmployeeEntity;
import com.example.jpaDataMapping.jpaDataMapping.repositories.DepartmentRepository;
import com.example.jpaDataMapping.jpaDataMapping.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public DepartmentEntity getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public List<DepartmentEntity> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public DepartmentEntity createDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    public DepartmentEntity assignManagerToDepartment(Long departmentId, Long employeeId) {

        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(departmentId);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);

        return departmentEntity.flatMap(department ->
                (employeeEntity.map(employee -> {
                            department.setManager(employee);
                            return departmentRepository.save(department);
                        }
                ))).orElse(null);
    }

    public DepartmentEntity getAssignedDepartmentOfManager(Long employeeId) {

//        Method 1
//        EmployeeEntity employeeEntity = EmployeeEntity.builder().id(employeeId).build();
//        return departmentRepository.findByManager(employeeEntity);

//        Method2
//        EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).orElse(null);
//        return departmentRepository.findByManager(employeeEntity);

//        Method 3
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);
        return employeeEntity.map(employee -> employee.getManagedDepartment()).orElse(null);

    }

    public DepartmentEntity assignWorkerToDepartment(Long departmentId, Long employeeId) {
        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(departmentId);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);

//        return departmentEntity.flatMap(
//                departmentEntity1 -> (employeeEntity.map(employeeEntity1 -> employeeEntity1.setWorkerDepartment(departmentEntity1))
//
//                )).orElse(null);

        return departmentEntity.flatMap(department ->
                (employeeEntity.map(employee -> {
                            employee.setWorkerDepartment(department);
                            employeeRepository.save(employee);
                            department.getWorkers().add(employee);
                            return department;
                        }
                ))).orElse(null);
    }

    public DepartmentEntity assignFreelancerToDepartment(Long departmentId, Long employeeId) {
        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(departmentId);
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);

        return departmentEntity.flatMap(department ->
                (employeeEntity.map(employee -> {
                    employee.getFreelanceDepartments().add(department);
                    employeeRepository.save(employee);
                    department.getFreelancers().add(employee);
                    return department;

                        }
                ))).orElse(null);
    }
}

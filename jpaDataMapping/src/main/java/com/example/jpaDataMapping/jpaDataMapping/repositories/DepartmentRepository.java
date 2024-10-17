package com.example.jpaDataMapping.jpaDataMapping.repositories;

import com.example.jpaDataMapping.jpaDataMapping.entities.DepartmentEntity;
import com.example.jpaDataMapping.jpaDataMapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}

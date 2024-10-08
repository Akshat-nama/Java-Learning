package com.codingshuttle.springbootweb.springbootweb.repositories;

import com.codingshuttle.springbootweb.springbootweb.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}

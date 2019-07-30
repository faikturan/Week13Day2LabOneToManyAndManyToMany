package com.codeclan.example.personnelservice.repositories;

import com.codeclan.example.personnelservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

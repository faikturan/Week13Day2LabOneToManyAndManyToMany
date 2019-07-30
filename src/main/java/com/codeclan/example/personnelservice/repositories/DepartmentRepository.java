package com.codeclan.example.personnelservice.repositories;

import com.codeclan.example.personnelservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

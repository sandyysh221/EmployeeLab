package com.example.EmployeeTracking.repositories;

import com.example.EmployeeTracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

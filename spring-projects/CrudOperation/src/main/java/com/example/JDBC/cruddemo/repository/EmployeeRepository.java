package com.example.JDBC.cruddemo.repository;

import com.example.JDBC.cruddemo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
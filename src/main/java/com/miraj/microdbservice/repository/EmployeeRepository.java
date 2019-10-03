package com.miraj.microdbservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miraj.microdbservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee findByFirstName(String name);

	
}

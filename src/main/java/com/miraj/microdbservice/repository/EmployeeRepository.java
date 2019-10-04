package com.miraj.microdbservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miraj.microdbservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	/**
     * Finds a person by using the last name as a search criteria.
     * @param lastName
     * @return  A list of persons whose last name is an exact match with the given last name.
     *          If no persons is found, this method returns an empty list.
     */
    @Query("SELECT e FROM Employee e "
    		+ "WHERE LOWER(e.firstName) = LOWER(:name) "
    		+ "OR LOWER(e.lastName) = LOWER(:name) ")
	public List<Employee> findByName(String name);
	
}

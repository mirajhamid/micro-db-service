package com.miraj.microdbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miraj.microdbservice.model.Person;

public interface PersonRepository extends JpaRepository<Person , Integer>{
	
	

}

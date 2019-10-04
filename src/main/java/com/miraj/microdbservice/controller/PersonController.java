/**
 * 
 */
package com.miraj.microdbservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miraj.microdbservice.model.Employee;
import com.miraj.microdbservice.model.Person;
import com.miraj.microdbservice.repository.EmployeeRepository;
import com.miraj.microdbservice.repository.PersonRepository;


/**
 * @author Miraj_105288
 *
 */
@RestController
@RequestMapping("/rest/db")
public class PersonController {
	
	
	private static final Logger log = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PersonRepository personRepository;

	//GET Type1
	@RequestMapping(value="/persons", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getPersons() {
		log.info("getPersons method");
		return personRepository.findAll();
	}
	
	//GET Type1
	@RequestMapping(value="/persons/{id}", method=RequestMethod.GET)
	public Optional<Person> getPerson( @PathVariable("id") int id) {
		log.info("getPerson method " + id);
		return personRepository.findById(id);
	}
	
	//GET Type2
	@GetMapping(value="/employees" )
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	//GET Type2
	@GetMapping(value="/employee/name/{name}" , produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Employee> getEmployee(@PathVariable("name") String name) {
		log.info("getEmployee by name " + name.toLowerCase());
		return employeeRepository.findByName(name);
		
	}
	
	//GET Type2
	@GetMapping(value="/employee/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
	public Optional<Employee> getEmployee(@PathVariable("id") Integer id) {
		log.info("getEmployee by id :  " + id);	
		return employeeRepository.findById(id);
	}
		
	
	
}

package com.api.employee.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employee.microservice.entity.Employee;
import com.api.employee.microservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public void insertDetails(Employee emp) {
		
		repository.save(emp);
	}
	
	public Employee getDetailsByID(Integer id) {
		
		return repository.findById(id).get();
		
	}
	
	public List<Employee> getAllDetails(){
		return repository.findAll();
	}
	
	public void deleteByID(Employee emp) {
		repository.delete(emp);
	}

}

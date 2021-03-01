package com.api.employee.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.microservice.entity.Employee;
import com.api.employee.microservice.service.EmployeeService;

@RestController
@RequestMapping(value="/api",produces="application/json")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/employee")
	public String insertDetails(@RequestBody Employee employee) {
		
		empservice.insertDetails(employee);
		return "Employee details saved successfully";
		
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployeeDetails(){
		return empservice.getAllDetails();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetail(@PathVariable("id")Integer id) {
		return empservice.getDetailsByID(id);
	}
	
	@DeleteMapping("/employee")
	public String deleteEmployeeDetails(@RequestBody Employee emp) {
		empservice.deleteByID(emp);
		return "Employee details deleted successfully";
		
	}

}

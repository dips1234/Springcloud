package com.api.employee.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.info.api.proxy.EmployeeApi;
import com.api.employee.info.model.Employee;

@RestController
@RequestMapping(value="/api",produces="application/json")
public class EmployeeInfoController {
	
	@Autowired
	private EmployeeApi employeeapi;
	
	@PostMapping("/employee")
	public String insertDetails(@RequestBody Employee employee) {
		
		return employeeapi.insertdetails(employee);
		
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployeeDetails(){
		return employeeapi.getAllDetails();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetail(@PathVariable("id")Integer id) {
		return employeeapi.getDetailsByID(id);
	}
	
	@DeleteMapping("/employee")
	public String deleteEmployeeDetails(@RequestBody Employee emp) {
       return employeeapi.deletedetails(emp) ;
}
}

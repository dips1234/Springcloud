package com.api.employee.info.api.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.api.employee.info.model.Employee;

import feign.FeignException;
import feign.hystrix.FallbackFactory;


@FeignClient(name = "employee-ws",fallbackFactory = EmployeeFallbackFactory.class)
public interface EmployeeApi {

	@RequestMapping(value = "/api/employee", method = RequestMethod.POST)
	public String insertdetails(@RequestBody Employee emp);

	@RequestMapping(value = "/api/employee", method = RequestMethod.DELETE)
	public String deletedetails(@RequestBody Employee emp);

	@RequestMapping(value = "/api/employee", method = RequestMethod.GET)
	public List<Employee> getAllDetails();

	@RequestMapping(value = "/api/employee/{id}", method = RequestMethod.GET)
	public Employee getDetailsByID(@PathVariable("id") Integer id);

}

@Component
class EmployeeFallbackFactory implements FallbackFactory<EmployeeApi>{

	@Override
	public EmployeeApi create(Throwable cause) {
		// TODO Auto-generated method stub
		return new EmployeeFallBack();
	}
}

@Component
class EmployeeFallBack implements EmployeeApi{
	
	
	

	@Override
	public String insertdetails(Employee emp) {
		// TODO Auto-generated method stub
		return "Employee-Microservice is down.Please try after sometime ";
		
	}

	@Override
	public String deletedetails(Employee emp) {
		return "Employee-Microservice is down.Please try after sometime ";
	}

	@Override
	public List<Employee> getAllDetails() {
		// TODO Auto-generated method stub
		return new ArrayList<Employee>();
	}

	@Override
	public Employee getDetailsByID(Integer id) {
		// TODO Auto-generated method stub
		return new Employee();
	}
}
	
	

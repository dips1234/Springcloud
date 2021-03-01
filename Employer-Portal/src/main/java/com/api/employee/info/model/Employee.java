package com.api.employee.info.model;

public class Employee {
	
	private Integer empid;
	private String firstname;
	private String lastname;
	private String mailid;
	private String designation;
	private String dept;
	private String address;
public Employee() {
		
	}
	public Employee(Integer empid, String firstname, String lastname, String mailid, String designation, String dept,
			String address) {
		
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mailid = mailid;
		this.designation = designation;
		this.dept = dept;
		this.address = address;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", mailid=" + mailid
				+ ", designation=" + designation + ", dept=" + dept + ", address=" + address + "]";
	}
	
	

}

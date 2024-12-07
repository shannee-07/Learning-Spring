package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public Employee(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
}

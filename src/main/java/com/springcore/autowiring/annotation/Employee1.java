package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee1 {
	
//	Using autowired annotation: It will automatically inject using type 
// It will use setter/constructor/property based on where we are placing @autowired annotation, in this case it will use the property that is Address
	@Autowired
	private Address address;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside constructor");
	}
}

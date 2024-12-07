package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private Address address;
	private int id;
	private List<String> hobbies;

	public Person(String name, int id, Address address, List<String> hobbies) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " : " + this.name + " {"+ this.address+"} " + this.hobbies;
	}
}

package com.springcore.ci;

public class Address {
	private String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;
	}
//	public String getAddress() {
//		return this.line1;
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.line1;
	}

}

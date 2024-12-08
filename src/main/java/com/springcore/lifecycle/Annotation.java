package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Annotation [str=" + str + "]";
	}

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Annotation: Init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Annotation: Destroy method");
	}
	
}

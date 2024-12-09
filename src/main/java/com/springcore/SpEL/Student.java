package com.springcore.SpEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu1")
@Scope("prototype")
public class Student {

	@Value("#{new java.lang.String('Shannee Ahirwar')}")
	private String name;

	@Value("#{11+5}")
	private int n;
	
	@Value("#{T(java.lang.Math).sqrt(81)}")
	private double sqrt;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}


	private String intro;

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", n=" + n + ", sqrt=" + sqrt + ", pi=" + pi + ", intro=" + intro + "]";
	}

}

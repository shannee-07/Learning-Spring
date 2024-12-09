package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private Course course;
	public void study() {
		System.out.println("Student is studying");
		course.enroll();
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	public Student(Course course) {
		super();
		this.course = course;
	}
}

package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu1")
// Defining scope of the  object. by default singleton is there. Available scopes are:
// singleton: there will only be one object and each time using getBean method will return the single created object
// prototype: new object will be created each time
// ... many more

// When we use prototype scope, bean is created only when its being called. But in Singleton scope, 
// it is created at initial load only without being checked it is used or not. 
// We can verify it by creating constructor with no argument and a print statement in it

// when creating bean in the xml, we can use scope="" attribute of the bean tag

@Scope("prototype")
public class Student {

	@Value("Tony Stark")
	private String name;

	@Value("New York")
	private String city;

	@Value("#{friends}")
	private List<String> friends;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}

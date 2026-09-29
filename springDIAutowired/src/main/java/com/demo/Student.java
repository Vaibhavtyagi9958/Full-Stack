package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	private String name = "Vinay";
	
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}

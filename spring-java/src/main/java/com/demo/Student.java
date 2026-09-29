package com.demo;

public class Student {
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name = " + name + " Age = " + age);
	}
}

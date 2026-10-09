package com.demo;

public class Student {
	private String name;
	private int marks;
	private String regno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int marks, String regno) {
		super();
		this.name = name;
		this.marks = marks;
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", regno=" + regno + "]";
	}
	
}

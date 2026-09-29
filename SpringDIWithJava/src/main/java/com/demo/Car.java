package com.demo;

public class Car {
	private String name;
	private int model;
	private Engine engine;
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}

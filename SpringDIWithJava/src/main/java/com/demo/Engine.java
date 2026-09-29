package com.demo;

public class Engine {
	private String type;
	private int life;
	public void setType(String type) {
		this.type = type;
	}
	public void setLife(int life) {
		this.life = life;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", life=" + life + "]";
	}
}

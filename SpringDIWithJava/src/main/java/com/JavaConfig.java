package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.Car;
import com.demo.Engine;

@Configuration
public class JavaConfig {
	@Bean
	public Engine getEngine() {
		Engine obj = new Engine();
		obj.setLife(15);
		obj.setType("Petrol");
		return obj;
	}
	
	@Bean(name="car1")
	public Car getCar() {
		Car obj2 = new Car();
		obj2.setName("Alto");
		obj2.setModel(2001);
		obj2.setEngine(getEngine());
		return obj2;
	}
}
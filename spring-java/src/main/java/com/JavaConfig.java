package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.Student;

@Configuration
public class JavaConfig {

	@Bean(name="stu")
	public Student getStudent() {
		Student s = new Student();
		s.setAge(18);
		s.setName("Mohit");
		return s;
	}
}

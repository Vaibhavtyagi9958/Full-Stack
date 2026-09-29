package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");/
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu = (Student) context.getBean(Student.class);
        Student stu2 = (Student) context.getBean(Student.class);
        System.out.println(stu==stu2);
    }
}

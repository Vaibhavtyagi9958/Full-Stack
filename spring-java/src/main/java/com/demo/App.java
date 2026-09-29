package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.JavaConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s = (Student) context.getBean("stu");
        s.display();
    }
}

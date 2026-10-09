package com.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.resources.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDAO sdao = (StudentDAO) context.getBean(StudentDAO.class);
        List<Student> students = sdao.getAllStudents();
        students.forEach(stu -> {
        	System.out.println(stu);
        });
    }
}

package com.example.AutoWiringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("AutoWiring/applicationContextForAnnotation.xml");

        Employee emp=applicationContext.getBean("employee",Employee.class);
        System.out.println(emp.address);
    }
}

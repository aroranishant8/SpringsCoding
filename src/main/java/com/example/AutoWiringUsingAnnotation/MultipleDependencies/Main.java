package com.example.AutoWiringUsingAnnotation.MultipleDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("AutoWiring/MultipleDependencies/applicationContextForAnnotation.xml");

        Employee e=applicationContext.getBean("employee", Employee.class);
        //example where we have multiple dependencies of same type
        System.out.println(e.listAddress.size());



    }
}

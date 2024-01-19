package com.example.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("AutoWiring/applicationContext.xml");

        AutoMobile autoMobile= (AutoMobile) applicationContext.getBean("AutoMobile");
        System.out.println(autoMobile.brake); // null without autowiring by name
        System.out.println( applicationContext.getBean("Brake"));

    }
}

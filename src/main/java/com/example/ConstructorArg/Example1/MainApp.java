package com.example.ConstructorArg.Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring XML configuration
        //Both classes require spring context dependency
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Car bean
        Car car = (Car) context.getBean("car");

        // Use the car
        // ...
        System.out.println(car.e.toString());
    }
}

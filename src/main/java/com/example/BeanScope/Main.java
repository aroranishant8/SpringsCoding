package com.example.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new
                ClassPathXmlApplicationContext("BeanScope/applicationContext.xml");
        Car car=applicationContext.getBean("car",Car.class);



        System.out.println("Is engine 1 equals engine 2 when we call them using Setter injection : "+
                car.engine1.equals(car.engine2));
        System.out.println("Is engine 1 equals engine 2 when we call using bean lookup : "+
                applicationContext.getBean("engine",Engine.class).equals(
                        applicationContext.getBean("engine",Engine.class)));

        System.out.println("Is seat 1 equals seat 2 when we call using bean lookup : "+
                applicationContext.getBean("seat",Seat.class).equals(
                        applicationContext.getBean("seat",Seat.class)));
        System.out.println("Is seat 1 equals seat 2 when we call them using Setter injection: "+
                car.seat1.equals(car.seat2));

    }
}

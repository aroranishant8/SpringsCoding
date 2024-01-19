package com.example.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("AutoWiring/applicationContext.xml");
        //AutoWire By Name
        AutoMobile autoMobile= (AutoMobile) applicationContext.getBean("AutoMobile");
        System.out.println(autoMobile.brake1); // null without autowiring by name

        //AutoWire By Type
        AutoMobileByType autoMobileByType = (AutoMobileByType) applicationContext.getBean("AutoMobile1");
        System.out.println(autoMobileByType.steering); // null without autowiring by type

        //AutoWire By Constructor
        AutoMobileWithConstructor autoMobileWithConstructor = (AutoMobileWithConstructor) applicationContext.getBean("AutoMobile2");
        System.out.println(autoMobileWithConstructor.steering); // null without autowiring by constructor



    }
}

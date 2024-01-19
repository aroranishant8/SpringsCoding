package com.example.SetterArgInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("SetterArgInjection/applicationContext.xml");

        House bean = (House) applicationContext.getBean("House");
        System.out.println(bean.bathRoom);
        System.out.println(bean.diningRoom);
        System.out.println(bean.studyRoom);

    }
}

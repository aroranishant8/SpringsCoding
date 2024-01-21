package com.example.AnnotationBasedConfig;

import com.example.SetterArgInjection.House;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("AnnotationBasedConfig/applicationContext.xml");



    }
}

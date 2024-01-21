package com.example.AutoWiringUsingAnnotation.MultipleDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Its bean id should be referred by a lowercase by default(e: ), otherwise I was getting error
@Component
public class Employee {


    List<Address> listAddress;

    @Autowired
    Employee(List<Address> listAddress)
    {
    this.listAddress=listAddress;
    }

}

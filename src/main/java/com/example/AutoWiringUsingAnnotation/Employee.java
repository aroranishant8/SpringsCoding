package com.example.AutoWiringUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//Its bean id should be referred by a lowercase by default(e: ), otherwise I was getting error
@Component
public class Employee {

    /* Here address can be a bean declared in xml
    OR it can be annotated with @Component
    For now ,i have used it in xml
   */
    Address address;

    @Autowired // as of spring 4.3 , if we have only one constructor,
        // declaring AutoWiring on Constructor is optional
    Employee(Address address)
    {
    this.address=address;
    }

}

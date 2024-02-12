package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
====================================================================================================
Spring @Configuration annotation is part of the Spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition methods.
So Spring Container can process the class and generate Spring Beans to be used in the application
====================================================================================================
 */

@Configuration
public class ProjectConifig {

    /*
    ====================================================================================================
    @Bean annotation, which lets Spring know that it needs to call this method when it initializes its
    context and adds the returned value to the context.
    ====================================================================================================
     */
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    /*
    ====================================================================================================
    The method names usually follow verbs notation. but for methods which we will use to create beans,
    can use nouns as names this will be a good practice as the method names will become bean names as
    well in the Context
    ====================================================================================================
     */
    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer num(){
        return 16;
    }
}

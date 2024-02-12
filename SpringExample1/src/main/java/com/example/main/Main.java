package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //=========NORMAL POJO CLASS=============//

        Vehicle vehicle = new Vehicle();
        vehicle.setName("AUDI");
        System.out.println("POJO Object from non - Spring context : "+vehicle.getName()+"\n");


        //=========SPRING CONTEXT=============//

        /*
        ====================================================================================================
        The var Keyword was introduced in JAVA 10, Type inference is used in var keyword in which it detects
        automatically the datatype of a variable based on the surrounding context
        ====================================================================================================
         */
        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);

        var veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh.getName());

        /*
        ====================================================================================================
        We don't need to do any explicit casting while fetching a bean from context. Spring is smart enough
        to look for a bean of the type you requested in its context. If such a bean doesn't exist, Spring
        will throw an exception.
        ====================================================================================================
         */
        String hello = context.getBean(String.class);
        System.out.println("String object from Spring Context : "+ hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer object from Spring Context : "+ num);
    }
}

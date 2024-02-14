package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println();
        System.out.println("Vehicle name from Spring context is : " + vehicle.getName()+"\n");
        System.out.println("Person name form Spring context is : " + person.getName());
        System.out.println("Vehicle that the person owns is : "+person.getVehicle());
    }
}

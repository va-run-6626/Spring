package com.example.main;

import com.example.Services.VehicleService;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Condition;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the person bean from Spring Context!");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context!");
    }
}

package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    /*
   ====================================================================================================
   The @Autowired annotation marks on a field, constructor, Setter method is used to auto-wire that
   beans that is 'injecting beans' (Objects) at runtime by Spring Dependency Injection mechanism
   ====================================================================================================
     */
    @Autowired
    private Vehicle vehicle;

    public Person(){
        System.out.println("Person bean created by Spring!");
    }
    @PostConstruct
    public void initalize(){
        setName("Varun");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

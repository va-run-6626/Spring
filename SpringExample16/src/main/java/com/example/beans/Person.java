package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
@Lazy
public class Person {
    private String name;
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created!");
        this.vehicle = vehicle;
    }

    @PostConstruct
    private void initialize(){
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
}

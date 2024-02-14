package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    public Vehicle(){
        System.out.println("Vehicle bean created by Spring!");
    }


    @PostConstruct
    public void initialize(){
        setName("BMW");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle bean!");
    }

    @Override
    public String toString() {
        return "Vehicle name is : " + name;
    }
}
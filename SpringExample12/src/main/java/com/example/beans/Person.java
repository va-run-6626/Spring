package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle3") Vehicle vehicle){
        System.out.println("Person bean created by Spring!");
        this.vehicle = vehicle;
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

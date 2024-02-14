package com.example.beans;


public class Vehicle {
    private String name;
    public Vehicle(){
        System.out.println("Vehicle bean created by Spring!");
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

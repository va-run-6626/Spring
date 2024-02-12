package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);


        var veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh1.getName());
        System.out.println();

    }
}

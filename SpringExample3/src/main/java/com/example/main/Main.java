package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);


        var veh1 = context.getBean("bmwVehicle",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh1.getName());
        System.out.println();

        var veh2 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh2.getName());
        System.out.println();

        var veh3 = context.getBean("benzVehicle",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh3.getName());
        System.out.println();


    }
}

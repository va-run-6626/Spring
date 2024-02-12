package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);

        /*
        var veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh.getName());
        System.out.println();

        ====================================================================================================
        This will throw NoUniqueBeanDefinitionException as the Spring is ambiguous as which vehicle object
        to return
        ====================================================================================================
         */

        var veh1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh1.getName());
        System.out.println();

        var veh2 = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh2.getName());
        System.out.println();

        var veh3 = context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle object from Spring Context : "+ veh3.getName());
        System.out.println();


    }
}

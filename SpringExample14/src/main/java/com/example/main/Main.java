package com.example.main;

import com.example.Services.VehicleService;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleService", VehicleService.class);

        System.out.println("HashCode vehicleService1 : "+vehicleService1.hashCode());
        System.out.println("HashCode vehicleService2 : "+vehicleService2.hashCode());

        if(vehicleService1 == vehicleService2){
            System.out.println("VehicleService bean is a Singleton scoped bean !!");
        }
    }
}

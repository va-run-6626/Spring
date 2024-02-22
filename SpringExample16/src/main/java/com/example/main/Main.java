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

        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);

        System.out.println("HashCode of vehicleService1 is " + vehicleService1.hashCode());
        System.out.println("HashCode of vehicleService2 is " + vehicleService2.hashCode());

        if(vehicleService1 != vehicleService2){
            System.out.println("Hashcode is not same and hence the BEANs are different !");
        }
    }
}

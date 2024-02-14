package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConifig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConifig.class);


        Vehicle bmw = new Vehicle();
        bmw.setName("BMW");
        Supplier<Vehicle> bmwSupplier = () -> bmw;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("AUDI");
            return audi;
        };

        Random random = new SecureRandom();
        int randomNumber = random.nextInt(10);
        System.out.println("Our Random number is : "+ randomNumber);

        if(randomNumber % 2 == 0){
            context.registerBean("bmw",Vehicle.class,bmwSupplier);
        }else{
            context.registerBean("audi", Vehicle.class,audiSupplier);
        }

        Vehicle bmwVehicle = null;
        Vehicle audiVehicle = null;
        try{
            bmwVehicle = context.getBean("bmw", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error getting BMW Vehicle");
        }

        try{
            audiVehicle = context.getBean("audi",Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error getting AUDI Vehicle");
        }

        if(bmwVehicle != null){
            System.out.println("Printing form Spring context : "+ bmwVehicle.getName());
        }else{
            System.out.println("Printing form Spring context : "+ audiVehicle.getName());
        }
    }
}

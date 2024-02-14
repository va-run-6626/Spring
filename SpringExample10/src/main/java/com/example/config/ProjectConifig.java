package com.example.config;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConifig {
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    /*
   ====================================================================================================
   Here in the below code, we are trying to wire or establish a relationship between Person and Vehicle
   , by passing the vehicle as a method parameter to the person() bean method

   Spring injects the vehicle bean to the person bean using Dependency Injection. Spring will make sure
   to have only 1 vehicle bean is created and also vehicle bean will be created first always as person
   bean has dependency on it.
   ====================================================================================================
     */
    @Bean
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Varun");
        person.setVehicle(vehicle);
        return person;
    }
}

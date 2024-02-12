package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConifig {
    @Bean(name ="bmwVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean(value ="audiVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("AUDI");
        return veh;
    }

    @Bean("benzVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("BENZ");
        return veh;
    }

}

package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConifig {
    @Bean(name ="bmwVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }
    /*
    ====================================================================================================
    When you have multiple beans of the same kind inside the Spring context, you can make one of them
    primary by using @Primary annotation. Primary bean is the one which Spring will choose if it has
    multiple options, and you don't specify a name. In other words , it is the default bean that spring
    Context will consider in the case of confusion due to multiple beans present of same type
    ====================================================================================================
     */
    @Primary
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

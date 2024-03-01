package com.example.main;

import com.example.config.ProjectConfig;
import com.example.entities.Song;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleService = context.getBean(VehicleServices.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song("King Shit","Shubh");
        boolean vehicleStarted = true;
        System.out.println(vehicleService.moveVehicle(vehicleStarted));
        String playMusicStatus = vehicleService.playMusic(vehicleStarted,song);
        System.out.println(playMusicStatus);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStarted);
        System.out.println(applyBrakeStatus);
    }
}

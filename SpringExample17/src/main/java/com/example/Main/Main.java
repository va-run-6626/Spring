package com.example.Main;

import com.example.Config.ProjectConfig;
import com.example.Models.Song;
import com.example.Services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song();
        song.setName("Blank Space");
        song.setArtist("Taylor Swift");

        boolean vehicleStart = true;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStart);
        String playMusicStatus = vehicleService.playMusic(vehicleStart,song);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStart);
        System.out.println(moveVehicleStatus);
        System.out.println(playMusicStatus);
        System.out.println(applyBrakeStatus);
    }
}

package com.example.Services;

import com.example.Interfaces.Speakers;
import com.example.Interfaces.Tyres;
import com.example.Models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class VehicleService {
    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public String playMusic(boolean vehicleStarted, Song song){
        Instant start = Instant.now();
        logger.info("method exectuition start");

        String music = null;
        if(vehicleStarted){
            music = speakers.makeSound(song);
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the " + "play operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return music;
    }

    public String moveVehicle(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method exectuition start");
        String status = null;
        if(vehicleStarted){
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the " + "move operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        return status;
    }

    public String applyBrake(boolean vehicleStarted){
        Instant start = Instant.now();
        logger.info("method execution start");
        String status = null;
        if(vehicleStarted){
            status = tyres.stop();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +" brake operation");
        }
        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        return status;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}

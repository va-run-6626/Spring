package com.example.services;

import com.example.entities.Song;
import com.example.interfaces.LogAspect;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class VehicleServices {

    private Speakers speakers;
    private Tyres tyres;
    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres) {
        setSpeakers(speakers);
        setTyres(tyres);
    }

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song){
        return speakers.makeSound(song);
    }
    @LogAspect
    public String moveVehicle(boolean vehicleStarted){
        String s = tyres.rotate();
        return s;
    }

    @LogAspect
    public String applyBrake(boolean vehicleStarted){
        return tyres.stop();
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

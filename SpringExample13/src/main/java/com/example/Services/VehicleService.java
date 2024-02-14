package com.example.Services;

import com.example.Interfaces.ISpeaker;
import com.example.Interfaces.ITyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private ISpeaker speakers;
    private ITyre tyre;

    @Autowired
    public VehicleService(ISpeaker speakers, ITyre tyre) {
        this.speakers = speakers;
        this.tyre = tyre;
    }

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyre.rotate();
        System.out.println(status);
    }

    public ISpeaker getSpeakers() {
        return speakers;
    }

    public void setSpeakers(ISpeaker speakers) {
        this.speakers = speakers;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }
}

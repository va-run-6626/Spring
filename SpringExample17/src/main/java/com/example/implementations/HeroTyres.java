package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class HeroTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle moving with the help of Hero tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Hero tyres";
    }
}

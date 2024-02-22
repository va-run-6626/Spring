package com.example.implementations;

import com.example.Interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with the help of Michelin tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin tyres";
    }
}

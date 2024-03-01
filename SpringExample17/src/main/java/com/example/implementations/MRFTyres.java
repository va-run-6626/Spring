package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with the help of MRF tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of MRF tyres";
    }
}

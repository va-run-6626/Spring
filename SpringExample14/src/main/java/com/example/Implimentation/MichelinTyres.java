package com.example.Implimentation;

import com.example.Interfaces.ITyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements ITyre {
    @Override
    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }
}

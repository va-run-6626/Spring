package com.example.Implimentation;

import com.example.Interfaces.ITyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements ITyre {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyres";
    }
}

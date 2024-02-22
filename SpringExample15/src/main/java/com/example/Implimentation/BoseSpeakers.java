package com.example.Implimentation;

import com.example.Interfaces.ISpeaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements ISpeaker {
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}

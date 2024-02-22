package com.example.Implimentation;

import com.example.Interfaces.ISpeaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements ISpeaker {
    @Override
    public String makeSound() {
        return "Playing music with Sony speakers";
    }
}

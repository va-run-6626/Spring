package com.example.implementations;

import com.example.Interfaces.Speakers;
import com.example.Models.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bose implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the song "+ song.getName()+ " by "
                + song.getArtist()+
                " with Bose speakers";
    }
}

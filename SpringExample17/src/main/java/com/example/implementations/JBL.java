package com.example.implementations;

import com.example.Interfaces.Speakers;
import com.example.Models.Song;
import org.springframework.stereotype.Component;

@Component
public class JBL implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the song "+ song.getName()+ " by "
                + song.getArtist()+
                " with JBL speakers";
    }
}

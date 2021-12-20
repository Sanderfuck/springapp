package com.sander.spring;

import org.springframework.stereotype.Component;


@Component
public class RockMusic implements Music {
    String rockSong = "Hey You";

    @Override
    public String getSong() {
        return rockSong;
    }
}

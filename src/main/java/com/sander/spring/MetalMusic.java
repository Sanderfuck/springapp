package com.sander.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MetalMusic implements Music {
private String metalSong;
    @Override
    public String getSong() {
        return metalSong;
    }
}

package com.sander.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", RockMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("metalMusic", MetalMusic.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        RockMusic rockMusic1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);

        System.out.println(rockMusic1 == rockMusic2);
        context.close();
    }
}

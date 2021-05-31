package com.media.musicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicAppApplication {
    public static void main(String[] args) {
        System.out.println("This is a fix.");
        System.out.println("Another fix");
        SpringApplication.run(MusicAppApplication.class, args);
    }

}

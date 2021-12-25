package com.example.spring;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //class dan nesne olusturulur
        Immutability im = new Immutability();

        //değer ekrana yazdırılır
        System.out.println(im.getData());
    }
}

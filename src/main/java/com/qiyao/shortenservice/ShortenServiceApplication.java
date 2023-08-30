package com.qiyao.shortenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShortenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortenServiceApplication.class, args);
    }

}

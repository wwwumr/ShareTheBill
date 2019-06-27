package com.example.wordladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WordladderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }
}

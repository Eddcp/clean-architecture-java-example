package com.example.exampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableFeignClients
public class ExampleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApiApplication.class, args);
    }

}

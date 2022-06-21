package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TwoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoApiApplication.class, args);
    }

    @GetMapping("/two")
    public String hello() {
        return "two-api-hello";
    }

}

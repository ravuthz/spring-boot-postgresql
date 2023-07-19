package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TutorialApplication {

    @GetMapping("/")
    String home() {
        return "welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

}

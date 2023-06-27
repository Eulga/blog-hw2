package com.example.bloghw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BlogHw2Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogHw2Application.class, args);
    }

}

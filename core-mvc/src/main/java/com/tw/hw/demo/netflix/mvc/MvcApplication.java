package com.tw.hw.demo.netflix.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MvcApplication {

    @GetMapping
    public String helo(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class, args);
    }
}
